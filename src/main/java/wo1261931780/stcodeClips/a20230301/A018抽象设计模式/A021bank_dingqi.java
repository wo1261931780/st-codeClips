package wo1261931780.stcodeClips.a20230301.A018抽象设计模式;

public class A021bank_dingqi extends A019bank_abstract {
	public A021bank_dingqi(String account, double balances) {
		super(account, balances);
	}

	@Override
	public double caculate_rates() {
		double profits = getBalances() * 1.75 / 100;
		if (getBalances() <= 100000) {
			System.out.println("定期账户");
			System.out.println("收益为：" + profits);
		} else {
			System.out.println("收益为：" + profits);
		}
		return profits;
	}
}
