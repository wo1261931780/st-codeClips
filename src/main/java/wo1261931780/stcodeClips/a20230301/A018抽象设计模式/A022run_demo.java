package wo1261931780.stcodeClips.a20230301.A018抽象设计模式;

public class A022run_demo {
	public static void main(String[] args) {
		// A020bank_huoqi x=new A020bank_huoqi();
		// x.caculate_rates();
		// 这里的账号还是在子类中创建，但是使用的get和set还是在父类
		// 那么就需要在子类中使用super等方法来调用有参构造对象
		A020bank_huoqi x = new A020bank_huoqi("111", 100000);
		x.caculate_rates();
		x.login("111", "100000");
		A021bank_dingqi x1 = new A021bank_dingqi("222", 100000);
		x1.caculate_rates();
	}
}
