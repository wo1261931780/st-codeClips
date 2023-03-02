package wo1261931780.stcodeClips.a20230228;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230228
 *
 * @author liujiajun_junw
 * @Date 2023-02-19-15  星期二
 * @description
 */
public class A017集合索引越界 {
	public static void main(String[] args) {
		ArrayList<Integer> strings = new ArrayList<>();
		strings.add(1);
		strings.add(1);
		strings.add(1);
		strings.add(1);
		strings.add(1);
		ArrayList<Integer> show2 = show(strings);
		// System.out.println(show2);
		// Arrays.toString(show(strings)
	}

	public static ArrayList<Integer> show(ArrayList<Integer> x) {
		// 集合的大小可变，从前删除会出现数组长度缩小和index发生变化的问题
		// 直接倒着删除即可

		for (int i = x.size() - 1; i > 0; i--) {
			if (x.get(i) < 80) {
				x.remove(i);
			}
		}
		return x;
	}
}
