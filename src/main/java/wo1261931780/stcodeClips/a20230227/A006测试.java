package wo1261931780.stcodeClips.a20230227;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230227
 *
 * @author liujiajun_junw
 * @Date 2023-02-09-44  星期一
 * @description
 */
public class A006测试 {
	public static void main(String[] args) {
		// 算术运算符案例
		int k = 3;
		int p = 5;
		// k  3 4 5 4
		// p  5 4 3 4
		// rs    3  +  5  -   4  + 4   - 5   +  4 + 2
		int rs = k++ + ++k - --p + p-- - k-- + ++p + 2;
		// 运算过程中，x++，就按照x的初试数据放入过程，否则就放入x增加以后的数据
		System.out.println(k); // 4
		System.out.println(p); // 4
		System.out.println(rs); // 9
	}
}
