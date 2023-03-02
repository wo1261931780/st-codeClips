package wo1261931780.stcodeClips.a20230302.ccc082interview;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220302.ccc038demo
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-15-58  星期四
 */
@Slf4j
public class eee005 {
	public static void main(String[] args) {
		int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26};
		log.info(Arrays.toString(show1(x)));
		// int[] x1 = show1(x);
		// int[] x2 = show2(x1);
		// log.info(show3(x2));
	}


	public static int show3(int[] x) {
		int goal = 77;
		int max = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == 77) {
				return i;
			} else if (x[i] > 77) {
				max = i;
				return max;
			}
		}
		// return max;
		return x.length;
	}

	public static int[] show2(int[] x) {
		Arrays.sort(x);
		// log.info(Arrays.toString(x));
		for (int i = 0, j = 10; i < x.length; i++, j++) {
			if (i < x.length - 1 && x[i] == x[i + 1]) {
				x[i] = j;
				i++;
			}
			x[i] = j;
		}
		// log.info(Arrays.toString(x));
		return x;
	}

	public static int[] show1(int[] x) {
		int[] x1 = new int[2];
		if (x.length < 2) {
			return x;
		}// 长度不满足，返回本身

		for (int i = 0; i < x.length; i++) {
			if (x[i] < 19) {
				int result = 19 - x[i];
				for (int j = i; j < x.length; j++) {
					if (x[j] == result) {
						x[0] = i;
						x1[1] = j;
						return x1;// 符合要求，返回结果
					}
				}
			}
		}
		x1[0] = x[0];
		x1[1] = x[1];
		return x1;// 返回前两个元素
	}
}
