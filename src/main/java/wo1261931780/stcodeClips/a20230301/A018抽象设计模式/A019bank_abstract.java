package wo1261931780.stcodeClips.a20230301.A018抽象设计模式;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class A019bank_abstract {
	private String account;
	private String passwords;
	private double rates;
	private double balances;

	public A019bank_abstract(String account, double balances) {
		this.account = account;
		this.balances = balances;
	}
	// 之后子类会使用super关键字调用有参构造
	// 因此需要提前准备好

	public A019bank_abstract() {
	}

	public void login(String acc, String paw) {// 需要注意的是，模板方法要加final防止被重写
		while (true) {
			if (acc.equals(account) && paw.equals(passwords)) {
				log.info("login success");
				// 模板方法的不同之处在于，会调用一个内部的抽象方法
				// 而这个抽象方法是需要子类重写的
				// 这里调用，直接
				double x = caculate_rates();
				// 这里因为创建的是子类的对象，也是在子类中调用login方法
				// 所以优先会使用子类中，重写过的方法
				log.info("利息是：" + x);
				return;
			} else {
				log.info("please retry");
			}
		}
	}

	public abstract double caculate_rates();

	public void show_rates() {
		log.info("金额为：" + getBalances() + "，利率：" + getRates());
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPasswords() {
		return passwords;
	}

	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}

	public double getRates() {
		return rates;
	}

	public void setRates(double rates) {
		this.rates = rates;
	}

	public double getBalances() {
		return balances;
	}

	public void setBalances(double balances) {
		this.balances = balances;
	}
}
