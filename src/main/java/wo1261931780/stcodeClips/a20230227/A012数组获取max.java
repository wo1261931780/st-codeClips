package wo1261931780.stcodeClips.a20230227;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230227
 *
 * @author liujiajun_junw
 * @Date 2023-02-17-44  星期一
 * @description
 */
public class A012数组获取max {
	public static int demo1(int[] arr) {
		// int max = 0;
		// 默认使用arr[0]位的参数，否则可能出现0大于数组所有元素的情况
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("第" + i + "次遍历");
			if (max < arr[i]) {
				max = arr[i];
			}
			// 对结果判断，将较大数据赋值给对象
		}
		return max;
	}
}
