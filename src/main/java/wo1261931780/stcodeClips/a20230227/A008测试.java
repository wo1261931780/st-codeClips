package wo1261931780.stcodeClips.a20230227;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230227
 *
 * @author liujiajun_junw
 * @Date 2023-02-09-54  星期一
 * @description
 */
public class A008测试 {
	public static void main(String[] args) {
		show2();
	}

	/**
	 * 录入一个char字符，将其转化为int类型的数据输出
	 */
	public static void show2() {
		Scanner x = new Scanner(System.in);
		char x3 = '我';
		char x4 = '爱';
		char x5 = '你';
		// System.out.println((int)x1+" "+(int)x2+" "+(int)x3+" "+(int)x4+" "+(int)x5);

		System.out.println((int) x3 + " " + (int) x4 + " " + (int) x5);
		// 结果为25105 29233 20320
	}
}
