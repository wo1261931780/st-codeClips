package wo1261931780.stcodeClips.a20230302;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc055排序
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-19-41  星期五
 */
@Slf4j
public class A039二分查找的实现 {
	public static void main(String[] args) {
		int[] x = {1, 35, 4, 564, 8, 789, 7, 98, 687};
		Scanner x1 = new Scanner(System.in);
		int demonum = x1.nextInt();
		log.info("结果：" + show(x, demonum));
	}

	public static int show(int[] x, int demo) {
		Arrays.sort(x);
		int start = 0;
		int end = x.length - 1;
		while (end >= start) {
			int mid = (start + end) / 2;
			if (demo > x[mid]) {
				start = mid + 1;// 在右侧，中间值加1
			} else if (demo < x[mid]) {
				end = mid - 1;// 首位的索引需要加减，将数据集中到中间
			} else {
				log.info(Arrays.toString(x));
				log.info(demo + "," + mid);
				return mid;
			}
		}
		return -1;
	}
}
