package wo1261931780.stcodeClips.a20230227;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230227
 *
 * @author liujiajun_junw
 * @Date 2023-02-10-14  星期一
 * @description
 */
public class A010计时器 {
	public static void main(String[] args) {
		Scanner b11 = new Scanner(System.in);
		System.out.println("请输入分钟：");
		int minute = b11.nextInt();
		// int minute = 0;
		int hours = 0;
		int twentyFour = 1;
		// 如果没有定义24的来源，直接写24，那么24会变成一个魔法值（数据被写死）
		// 定义后可以寻找来源，代码健壮
		int sixty = 61;
		if (minute > sixty) {
			System.out.println("时间错误，请重新输入");
		} else {
			for (System.out.println("开始计时---------"); hours < twentyFour; minute++) {
				if (minute == 60) {
					hours++;
					minute = 0;
					System.out.println("时间是：" + hours + "时" + minute + "分");
					System.out.println("一小时过去了------------------");
				} else {
					System.out.println("时间是：" + hours + "时" + minute + "分");
				}
				// 下面是简洁版，但是无法自定义输入的时间。
			/*for(System.out.println("开始计时---------");hours < 24;hours++){
				for(minute = 0;minute < 60;minute++){
					System.out.println("时间是："+hours+"时"+minute+"分");
				}*/
			}
			System.out.println("时间上限，程序结束");
		}
	}
}
