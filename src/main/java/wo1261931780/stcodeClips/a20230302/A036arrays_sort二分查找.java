package wo1261931780.stcodeClips.a20230302;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc052arrays
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-22-55  星期二
 */
@Slf4j
public class A036arrays_sort二分查找 {
	public static void main(String[] args) {
		int[] x = {23, 12, 3, 5, 4, 54, 98, 789};
		Arrays.sort(x);
		log.info("数组详情：" + Arrays.toString(x));// [3, 4, 5, 12, 23, 54, 98, 789]
		// ******************************************
		int indexDemo = Arrays.binarySearch(x, 5);// 2，这里返回的就是index，不是常规意义上的第几个数字
		log.info("5的索引：" + indexDemo);
		int testIndex = Arrays.binarySearch(x, 100);
		log.info("100的索引：" + testIndex);// -8，不存在的数字，就是应该插入位置-1
		// 举例：
		// 100在98后面，index是应该是顺序7，实际上7号是789，
		// 这里100不存在，就设置index为-7，但是给出-7-1=-8
	}
}
