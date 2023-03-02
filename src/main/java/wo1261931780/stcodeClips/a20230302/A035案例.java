package wo1261931780.stcodeClips.a20230302;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc051正则表达式
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-14-11  星期日
 */
public class A035案例 {
	public static void main(String[] args) {
		show_tel();
		show_mail();
		show_phone("123");
	}

	/**
	 * 手机校验的正则表达式
	 */
	public static void show_tel() {
		Scanner x = new Scanner(System.in);
		while (true) {
			String demo_str = x.next();
			if (demo_str != null && demo_str.matches("1[3-9]\\d{9}")) {
				System.out.println("注册完成");
				return;
			} else {
				System.out.println("请重新输入");
			}
		}
	}

	/**
	 * 邮箱校验的正则表达式
	 */
	public static void show_mail() {
		Scanner x = new Scanner(System.in);
		while (true) {
			String demo_mail = x.next();
			if (demo_mail != null && demo_mail.matches("\\w[1]@[a-zA-Z0-9]{2,20}(\\.[a-zA-Z0-9]{2,20}){1,2}")) {
				System.out.println("注册完成");
				return;
			} else {
				System.out.println("请重新输入");
			}
		}
	}

	/**
	 * 手机校验的正则表达式
	 */
	public static void show_phone(String xx) {
		Scanner x = new Scanner(System.in);
		String demo_ph = x.nextLine();// 注意，所有的正则表达式都是对字符串进行校验
		if (demo_ph != null && demo_ph.matches("0\\d{2,6}-?\\d{5,8}")) {
			System.out.println("注册完成");
		} else {
			System.out.println("请重新输入");
		}
	}
}
