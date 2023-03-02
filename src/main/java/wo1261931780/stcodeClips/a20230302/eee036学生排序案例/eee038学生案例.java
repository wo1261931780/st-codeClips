package wo1261931780.stcodeClips.a20230302.eee036学生排序案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class eee038学生案例 {
	public static void main(String[] args) {
		ArrayList<eee037学生类> x = new ArrayList<>();
		eee037学生类 x1 = new eee037学生类("y1", 11, 001);
		eee037学生类 x2 = new eee037学生类("a2", 63, 002);
		eee037学生类 x3 = new eee037学生类("r3", 33, 003);
		eee037学生类 x4 = new eee037学生类("d4", 54, 004);
		eee037学生类 x5 = new eee037学生类("f5", 11, 005);
		x.add(x1);
		x.add(x2);
		x.add(x3);
		x.add(x4);
		x.add(x5);
		Collections.sort(x, new Comparator<eee037学生类>() {
			@Override
			public int compare(eee037学生类 o1, eee037学生类 o2) {
				int num1 = o1.getAge() - o2.getAge();
				return num1 == 0 ? o1.getName().compareTo(o2.getName()) : num1;
			}
		});
		for (eee037学生类 i : x) {
			System.out.println(i.getName() + "--" + i.getAge() + "--" + i.getNum());
		}
	}
}
