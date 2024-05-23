package wo1261931780.stcodeClips.a20240514;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20240514
 *
 * @author liujiajun_junw
 * @Date 2024-05-21-32  星期二
 * @Description
 */

import com.sun.jdi.*;
import com.sun.jdi.connect.*;
import com.sun.jdi.event.*;
import com.sun.jdi.request.*;

import java.util.List;
import java.util.Map;

public class CustomRemoteDebugger {
	/**
	 * 在 Java 开发中，调试是一个不可或缺的环节，它帮助我们发现并修复程序中的错误。
	 * 除了使用 IDE 的内置调试工具外，Java 还提供了一套 JDI（Java Debug Interface）API，允许我们进行更为复杂的调试操作，包括远程调试。
	 * 今天，我们将通过一个示例来展示如何使用 JDI 进行远程调试。
	 * <p>
	 * 远程调试是指在一台机器上运行的调试器（debugger）可以连接到另一台机器上的Java虚拟机（JVM），并对其进行调试。这在分布式系统或远程服务器的调试中非常有用。
	 * <p>
	 * Java 远程调试 JVM 的步骤
	 * <p>
	 * 1）启动远程应用的 JVM：在启动远程应用程序时，需要带上 JDWP（Java Debug Wire Protocol）的参数。
	 * 2）使用 JDI 连接到远程 JVM：通过 JDI API 连接到远程 JVM，并进行操作。
	 * 3）设置事件请求：定义需要监听的事件，如方法入口、断点等。
	 * 4）事件循环：处理调试事件，直到调试结束。
	 * 5）断开连接：在完成调试后，断开与远程JVM的连接。
	 * <p>
	 * 下面是 Java 远程调试 JVM 的示例代码：
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// 远程调试连接信息
		String host = "localhost";
		int port = 8000;

		// 连接到远程 JVM
		VirtualMachine vm = connectToRemoteVM(host, port);

		// 添加事件请求
		addEventRequests(vm.eventRequestManager());

		// 处理调试事件
		processDebugEvents(vm.eventQueue());

		// 断开连接
		disconnectFromRemoteVM(vm);
	}

	private static VirtualMachine connectToRemoteVM(String host, int port) {
		VirtualMachineManager vmManager = Bootstrap.virtualMachineManager();

		try {
			AttachingConnector connector = findConnector(vmManager);

			Map<String, Connector.Argument> connectorArgs = connector.defaultArguments();
			connectorArgs.get("hostname").setValue(host);
			connectorArgs.get("port").setValue(String.valueOf(port));

			VirtualMachine vm = connector.attach(connectorArgs);

			System.out.println("Connected to remote VM: " + vm.name());
			return vm;
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to connect to remote VM");
		}
	}

	private static AttachingConnector findConnector(VirtualMachineManager vmManager) {
		for (AttachingConnector connector : vmManager.attachingConnectors()) {
			if ("dt_socket".equals(connector.transport())) {
				return connector;
			}
		}
		throw new RuntimeException("No suitable connector found");
	}

	private static void addEventRequests(EventRequestManager requestManager) {
		// 添加你需要的事件请求
		MethodEntryRequest methodEntryRequest = requestManager.createMethodEntryRequest();
		methodEntryRequest.enable();

		// BreakpointRequest breakpointRequest = requestManager.createBreakpointRequest(
		// 		requestManager.createMethodExitRequest().location());
		// breakpointRequest.enable();
	}

	private static void processDebugEvents(EventQueue eventQueue) {
		while (true) {
			try {
				EventSet eventSet = eventQueue.remove();
				for (Event event : eventSet) {
					// 处理不同类型的事件
					if (event instanceof MethodEntryEvent) {
						MethodEntryEvent methodEntryEvent = (MethodEntryEvent) event;
						System.out.println("Method Entry: " + methodEntryEvent.location());
					} else if (event instanceof BreakpointEvent) {
						BreakpointEvent breakpointEvent = (BreakpointEvent) event;
						System.out.println("Breakpoint Hit: " + breakpointEvent.location());
					}
				}
				eventSet.resume();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private static void disconnectFromRemoteVM(VirtualMachine vm) {
		try {
			vm.dispose();
			System.out.println("Disconnected from remote VM");
		} catch (VMDisconnectedException e) {
			// VMDisconnectedException is expected upon disconnect
		}
	}
}
