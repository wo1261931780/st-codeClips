package wo1261931780.stcodeClips.a20230302.eee039斗地主案例;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 斗地主，一副牌54张，四种花色，1-13，两个王
 * <p>
 * 玩家四个人，每个人13张。两副牌就是26张。
 */
@Slf4j
public class eee041课堂案例 {
	public static void main(String[] args) {
		// String[] x1 = {"?", "?", "?", "?"};
		String[] x1 = {"方片", "梅花", "红桃", "黑桃"};
		String[] x2 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] x3 = {"大joker", "小joker"};
		ArrayList<String> x = new ArrayList<>();
		for (String i : x1) {
			for (String i2 : x2) {
				String xx = i + i2;
				x.add(xx);

			}
		}
		x.add(x3[0]);
		x.add(x3[1]);
		Collections.shuffle(x);
		log.info(x + "--" + x.size());
		log.info("-------------------");
		// log.info(ran(x));
		// fp(x);
		// ArrayList<String> s1 = fp(x);
		// Collections.sort(s1);
		// log.info(fp(x));
		// log.info(fp(x));
		// log.info(fp(x));
		// 其实这里需要一个校验，一副牌最多四个一模一样的数字
		// ArrayList<String> x4 = new ArrayList<>();
		// ArrayList<String> x5 = new ArrayList<>();
		// ArrayList<String> x6 = new ArrayList<>();
		ArrayList<String> x4 = new ArrayList<>();
		ArrayList<String> x5 = new ArrayList<>();
		ArrayList<String> x6 = new ArrayList<>();
		ArrayList<String> x7 = new ArrayList<>();
		// for (int i = 0; i < 54; i++) {
		for (int i = 0; i < x.size(); i++) {
			// x4.add(ran(x));
			if (i > (x.size() - 4)) {
				x7.add(x.get(i));
			} else if (i % 3 == 0) {
				x4.add(x.get(i));
			} else if (i % 3 == 1) {
				x5.add(x.get(i));
			} else if (i % 3 == 2) {
				x6.add(x.get(i));
			}
		}
		Collections.sort(x4);
		Collections.sort(x5);
		Collections.sort(x6);
		Collections.sort(x7);
		log.info(x4 + "--" + x4.size());
		log.info(x5 + "--" + x5.size());
		log.info(x6 + "--" + x6.size());
		log.info(x7 + "--" + x7.size());
	}

	public static ArrayList<String> fp(ArrayList<String> x) {
		ArrayList<String> x4 = new ArrayList<>();
		ArrayList<String> x5 = new ArrayList<>();
		ArrayList<String> x6 = new ArrayList<>();
		ArrayList<String> x7 = new ArrayList<>();
		// for (int i = 0; i < 54; i++) {
		for (int i = 0; i < x.size(); i++) {
			// x4.add(ran(x));
			if (i > (x.size() - 3)) {
				x7.add(x.get(i));
			} else if (i % 3 == 0) {
				x4.add(x.get(i));
			} else if (i % 3 == 1) {
				x5.add(x.get(i));
			} else if (i % 3 == 2) {
				x6.add(x.get(i));
			}
		}
		Collections.sort(x4);
		Collections.sort(x5);
		Collections.sort(x6);
		Collections.sort(x7);
		return x4;
	}

	public static String ran(ArrayList<String> x) {
		Random xx = new Random();
		int xx1 = xx.nextInt(54);
		String xx3 = x.get(xx1);
		return xx3;
	}

}
