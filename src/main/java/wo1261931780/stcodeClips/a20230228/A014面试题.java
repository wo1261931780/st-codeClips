package wo1261931780.stcodeClips.a20230228;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230228
 *
 * @author liujiajun_junw
 * @Date 2023-02-16-51  星期二
 * @description
 */
public class A014面试题 {

	public static void main(String[] args) {
		show1();
		show2();
		show3();
	}

	public static void show1() {
		String x1 = new String("aa");
		// 上面的构建，实际上创建了两个对象，
		// 一个对象是常量池的，一个对象是堆内存的
		String x2 = "aa";
		// 这里默认会创建一个常量池的，但是常量池中已经有了，所以会默认使用已经创建的地址
		System.out.println(x1 == x2);
		// 结果为false
		// 这里x1指向堆内存的地址，而x2指向常量池的地址
	}

	public static void show2() {
		String x1 = "abc";// 常量池
		String x2 = "ab";
		String x3 = x2 + 'c';// 只要不是双引号直接给出，都放在堆内存
		System.out.println(x1 == x3);
		// 结果为false
	}

	public static void show3() {
		String x1 = "abc";// 常量池
		String x2 = "a" + "b" + "c";// 常量池，认定这里是abc，和上面指向相同
		// 上面的代码，编译阶段就已经完成，所以认为最终结果一样
		// String x2 = 'a' + 'b' + 'c';//报错
		// x2 += 'c';
		System.out.println(x1 == x2);
		// 结果为true
	}
}
