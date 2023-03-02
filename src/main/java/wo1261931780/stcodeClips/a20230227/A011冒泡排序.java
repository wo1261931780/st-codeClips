package wo1261931780.stcodeClips.a20230227;

import wo1261931780.stcodeClips.a20230302.A037冒泡排序;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230227
 *
 * @author liujiajun_junw
 * @Date 2023-02-15-29  星期一
 * @description
 */
public class A011冒泡排序 {
	public static void main(String[] args) {
		int[] x = {1, 1, 1, 321, 5, 54, 4, 85, 64};
		for (int i = 0, mid = 0; i < x.length - 1; i++) {
			// if (x[i]>x[i+1]){
			//     mid=x[i];
			//     x[i]=x[i+1];
			//     x[i+1]=mid;
			// }
			// i == 0  比较的次数 3  j = 0 1 2
			// i == 1  比较的次数 2  j = 0 1
			// i == 2  比较的次数 1  j = 0
			// 3、定义一个循环控制每轮比较的次数，占位
			// 如果只有单个循环，只会遍历一遍，两两交换，循环嵌套则可以实现从小到大的排序
			A037冒泡排序.algorithm(x, i);
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "--");
		}
	}
}
