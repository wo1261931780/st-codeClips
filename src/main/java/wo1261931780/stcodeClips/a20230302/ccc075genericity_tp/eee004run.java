package wo1261931780.stcodeClips.a20230302.ccc075genericity_tp;

import java.util.ArrayList;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220220.ccc075genericity_tp
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-12-51  星期日
 */
public class eee004run {
	public static void main(String[] args) {
		ArrayList<eee002BMWDemo> x = new ArrayList<>();
		x.add(new eee002BMWDemo());
		x.add(new eee002BMWDemo());
		x.add(new eee002BMWDemo());
		ArrayList<eee003BENZDemo> x1 = new ArrayList<>();
		x1.add(new eee003BENZDemo());
		x1.add(new eee003BENZDemo());
		x1.add(new eee003BENZDemo());
		// comp(x1);// 直接使用会报错，因为方法中设置的类型不同
		// 换句话说，方法中的设置，使得调用的时候灵活性下降
		competition(x);
		competition(x1);
	}

	public static void comp(ArrayList<eee002BMWDemo> x) {
		System.out.println("no");
	}

	public static void competition(ArrayList<?> x) {// 用问号替代，可以提高灵活性
		// 但是会出现问题
		// 比如我默认只有car可以使用该类型，但是来了个dog，没有限制方法，会导致dog也调用了这个功能
		System.out.println("ok");
	}

	public static void comps(ArrayList<? extends eee001demo> x) {
		// 使用extends设置上限
		System.out.println("必须是子类才能使用该方法");
	}
}
