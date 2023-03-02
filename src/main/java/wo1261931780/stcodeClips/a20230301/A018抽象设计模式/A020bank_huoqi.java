package wo1261931780.stcodeClips.a20230301.A018抽象设计模式;

public class A020bank_huoqi extends A019bank_abstract {
	public A020bank_huoqi(String acc, double cash) {
		super(acc, cash);
	}

	@Override
	public double caculate_rates() {
		System.out.println("override");
		double profits = getBalances() * 0.35 / 100;
		System.out.println("ÊÕÒæÎª£º" + profits);
		return profits;
	}


}
