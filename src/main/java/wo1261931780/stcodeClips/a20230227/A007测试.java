package wo1261931780.stcodeClips.a20230227;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230227
 *
 * @author liujiajun_junw
 * @Date 2023-02-09-49  星期一
 * @description
 */
public class A007测试 {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int k = 3;
		int rsMax1 = i > j ? (i > k ? i : k) : (j > k ? j : k);
		// 三个数据比较直接用一行代码表示

		System.out.println(rsMax1);
	}
}
