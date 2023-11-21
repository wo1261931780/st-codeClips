package wo1261931780.stcodeClips.a20231121;

import java.util.Scanner;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20231121
 *
 * @author liujiajun_junw
 * @Date 2023-11-13-30  星期二
 * @Description
 */
public class lanqiao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), ans = 0;
		for (int i = 1; i <= n; ++i) {
			int t = i;
			boolean ok = false;
			while (t == 0) {
				int g = t % 10;
				if (g == 2 || g == 0 || g == 1 || g == 9) {
					ok = true;
				}
				t = t / 10;
			}
			if (ok) {
				ans += i;
			}
		}
		System.out.println(ans);
	}
}
