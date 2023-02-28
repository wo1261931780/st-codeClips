package wo1261931780.stcodeClips.a20230228;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230228
 *
 * @author liujiajun_junw
 * @Date 2023-02-17-01  星期二
 * @description
 */
public class A015手机号码屏蔽 {
	/**
	 * 练习题：手机号码屏蔽
	 */
	public static void phonenum() {
		Scanner x = new Scanner(System.in);
		System.out.println("请输入号码：");
		String x1 = x.nextLine();
		if (x1.length() != 11) {
			System.out.println("num error");
		} else {
			// String x2 = x1.substring(3, 8);
			// String x3 = x1.replace(x2, "****");

			String x3 = x1.replace(x1.substring(3, 8), "****");
			System.out.println(x3);
		}
	}
}
