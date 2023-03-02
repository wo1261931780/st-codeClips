package wo1261931780.stcodeClips.a20230302.eee039斗地主案例;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

@Slf4j
public class eee042斗地主排序版 {
	public static void main(String[] args) {
		ArrayList<String> x1 = new ArrayList<>();
		String[] p1 = {"方片", "梅花", "红桃", "黑桃"};
		String[] p2 = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		String[] p3 = {"大joker", "小joker"};
		for (String i : p1) {
			for (String i2 : p2) {
				String pp = i + i2;
				x1.add(pp);
			}
		}
		x1.add(p3[0]);
		x1.add(p3[1]);
		// log.info(x1);
		// ----------------------------------------------------------------------------------------
		ArrayList<Integer> x2 = new ArrayList<>();
		for (int i = 0; i < 54; i++) {
			x2.add(i);
			// x2.set(i, i);
			// log.info(x2.get(i));
		}
		// HashMap<ArrayList<Integer>, ArrayList<String>> x = new HashMap<>();
		Collections.shuffle(x2);
		// log.info(x2);
		HashMap<Integer, String> x = new HashMap<>();
		// ----------------------------------------------------------------------------------------
		for (Integer x3 : x2) {
			x.put(x2.get(x3), x1.get(x3));
		}
		// log.info(x);
		TreeSet<Integer> x4 = new TreeSet<>();
		Set<Integer> x5 = x.keySet();
		ArrayList<String> xx1 = new ArrayList<>();
		ArrayList<String> xx2 = new ArrayList<>();
		ArrayList<String> xx3 = new ArrayList<>();
		for (Integer i : x5) {
			x4.add(i);
			String re = x.get(i);
			if (i > (x.size() - 4)) {
				xx3.add(re);
			} else if (i % 3 == 0) {
				xx1.add(re);
			} else if (i % 3 == 1) {
				xx2.add(re);
			} else if (i % 3 == 2) {
				xx3.add(re);
			}
		}
		// log.info(x4);
		Collections.sort(xx1);
		Collections.sort(xx2);
		Collections.sort(xx3);
		log.info(xx1 + "" + xx1.size());
		log.info(xx2 + "" + xx2.size());
		log.info(xx3 + "" + xx3.size());

		// x.put(x2, x1);
	}

	public static void rank(TreeSet<Integer> x4, HashMap<Integer, String> x) {
		for (int s : x4) {
			// x.get(s);
			log.info(x.get(s));
		}


	}
}
