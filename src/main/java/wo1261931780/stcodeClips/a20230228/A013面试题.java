package wo1261931780.stcodeClips.a20230228;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230228
 *
 * @author liujiajun_junw
 * @Date 2023-02-16-44  星期二
 * @description
 */
public class A013面试题 {
	public static void main(String[] args) {
		// 面试题
		// 直接创建字符串和通过new的方式新建对象字符串,
		// 二者得到的结果不同，因为一个是常量池，一个是堆内存的对象
		String q = "aaa";
		String q2 = "aaa";
		System.out.println(q == q2);
		// 结果为true
		System.out.println("******************");
		char[] xx = {'a', 'b', '测', '试'};
		byte[] x1 = {97, 98, 99, 65, 66};
		String q3 = new String(x1);
		String q4 = new String(x1);
		System.out.println(q3 == q4);
		// 结果为false
	}

}
