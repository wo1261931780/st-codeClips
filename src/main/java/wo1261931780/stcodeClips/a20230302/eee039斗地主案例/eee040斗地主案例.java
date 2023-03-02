package wo1261931780.stcodeClips.a20230302.eee039斗地主案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 2021年10月10日11:33:35，
 * 我做的这个案例其实有问题，
 *
 * 相当于，随机抽了12张牌，然后分成三组，对三组进行打乱，再分给三个人
 *
 * 首先没有对牌进行分类，其次没有在抽取的时候随机，
 *
 * 最后，分组的时间出问题
 */
public class eee040斗地主案例 {
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> x = new ArrayList<>();
		// ArrayList<Integer> x1 = new ArrayList<>();
		// x1.add(ran());
		// x1.add(ran());
		// x1.add(ran());
		// x1.add(ran());
		// ArrayList<Integer> x2 = new ArrayList<>();
		// x2.add(ran());
		// x2.add(ran());
		// x2.add(ran());
		// x2.add(ran());
		// ArrayList<Integer> x3 = new ArrayList<>();
		// x3.add(ran());
		// x3.add(ran());
		// x3.add(ran());
		// x3.add(ran());
		// x.add(x1);
		// x.add(x2);
		// x.add(x3);
		x.add(sz());
		x.add(sz());
		x.add(sz());
		// -----------------------------------------------
		Collections.shuffle(x);
		System.out.println(x);
		for (ArrayList<Integer> i : x) {
			System.out.println("-------------------");
			System.out.println(i);
			for (int i2 : i) {
				System.out.println(i2);
			}
		}
	}

	public static int ran() {
		Random x = new Random();
		int x1 = x.nextInt(14) + 1;
		return x1;
	}

	public static ArrayList<Integer> sz() {
		ArrayList<Integer> x1 = new ArrayList<>();
		x1.add(ran());
		x1.add(ran());
		x1.add(ran());
		x1.add(ran());
		return x1;
	}
}
