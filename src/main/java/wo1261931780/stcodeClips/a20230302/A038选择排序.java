package wo1261931780.stcodeClips.a20230302;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc055排序
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-19-33  星期四
 */
@Slf4j
public class A038选择排序 {
	public static void main(String[] args) {
		int[] x = {13, 54, 64, 7, 8};
		for (int i = 0; i < x.length - 1; i++) {
			for (int j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					int mid = x[i];
					x[i] = x[j];
					x[j] = mid;
				}
			}
		}
		log.info(Arrays.toString(x));
	}
}
