package wo1261931780.stcodeClips.a20230228;

import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230228
 *
 * @author liujiajun_junw
 * @Date 2023-02-17-17  星期二
 * @description
 */
public class A016ArrayList的类型问题 {
	public static void main(String[] args) {
		System.out.println("开始测试");
		ArrayList<String> x = new ArrayList<>();
		x.add("s");
		x.add("ss");
		System.out.println(x);
		System.out.println("------------------");
		x.add(0, "222");
		// 在0号位置插入元素以后，其他元素会自动顺延
		// 第一次打印，结果为：[s, ss]
		// 这里的结果是：[222, s, ss]
		// 也说明，即使会发生变化，这里的显示也是按照堆内存的元素进行展示

		System.out.println(x);
	}
}
