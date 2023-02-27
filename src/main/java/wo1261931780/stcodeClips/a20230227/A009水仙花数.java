package wo1261931780.stcodeClips.a20230227;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230227
 *
 * @author liujiajun_junw
 * @Date 2023-02-10-04  星期一
 * @description
 */
public class A009水仙花数 {
	public static void main(String[] args) {
		System.out.println("输入的数据为：");
		Scanner b11 = new Scanner(System.in);
		int xx = b11.nextInt();

		int count = 0;
		for (System.out.println("循环开始于:" + xx); xx < 1000; xx++) {
			// 下面分别获取每个数位上的数字，2021年9月7日14:28:49
			int x1 = xx / 100;
			int x2 = xx / 10 % 10;
			int x3 = xx % 10;
			if (xx == x1 * x1 * x1 + x2 * x2 * x2 + x3 * x3 * x3) {
				// 水仙花数：个位十位百位数字的立方之和为原数
				// 例如153，1+125+27=153
				System.out.println(xx);
				count++;
			} else {
			}
		}
		System.out.println("水仙花数共有" + count + "个，程序结束。");
	}
}
