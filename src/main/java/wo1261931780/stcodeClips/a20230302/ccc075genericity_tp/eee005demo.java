package wo1261931780.stcodeClips.a20230302.ccc075genericity_tp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc075genericity_tp
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-11-23  星期六
 * 个人联系案例
 */
public class eee005demo {
	public static void main(String[] args) {
		List<eee002BMWDemo> x = new ArrayList<>();
		x.add(new eee002BMWDemo());
		x.add(new eee002BMWDemo());
		x.add(new eee002BMWDemo());
		List<eee003BENZDemo> x1 = new ArrayList<>();
		x1.add(new eee003BENZDemo());
		x1.add(new eee003BENZDemo());
		x1.add(new eee003BENZDemo());
		Iterator<eee002BMWDemo> demo1 = x.iterator();
		// Iterator<eee003BENZDemo> demo2 = x1.iterator();
		for (int i = 0; i < x.size(); i++) {
			System.out.println(demo1.next());
		}
		System.out.println("while循环----------------------------");
		while (demo1.hasNext()) {
			System.out.println(demo1.next());
		}
	}

	public static void show(List<? extends eee002BMWDemo> x) {
		Iterator<? extends eee002BMWDemo> demo = x.iterator();
		while (demo.hasNext()) {
			System.out.println(demo.next());
		}
	}

	public static void show2(List<? extends eee003BENZDemo> x) {
		x.forEach(new Consumer<eee003BENZDemo>() {
			@Override
			public void accept(eee003BENZDemo s) {
				System.out.println(s);
			}
		});
		x.forEach(s -> System.out.println(s));
		x.forEach(System.out::println);// 直接soutc就可以使用lambda表达式去写
	}
}
