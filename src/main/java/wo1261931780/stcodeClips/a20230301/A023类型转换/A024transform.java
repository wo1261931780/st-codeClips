package wo1261931780.stcodeClips.a20230301.A023类型转换;

public class A024transform {
	public static void main(String[] args) {
		A025animal x = new A026cat();// 多态的方式创建对象，对象调用cat中的方法
		x.run();
		if (x instanceof A028dog) {// 判断对象的类型指向，到底是不是dog类
			// 如果是dog类，那么就直接为true，继续执行内部的方法
			A028dog xx = (A028dog) x;// 因为x是animal中的地址，这里进行强转，变成dog类的地址
			// 将强转后的地址赋值给dog类的新对象xx
			xx.run();// 然后调用dog类中的方法
		} else if (x instanceof A026cat) {// 如果是cat类的地址，那么继续执行
			A026cat xx = (A026cat) x;// 同样的强转地址，将animal的cat类型地址，赋值新对象xx
			xx.run();
			xx.coach();// 赋值后，相当于新对象xx是cat类，因此可以直接调用子类cat中的特有方法

			// 上面的执行流程，换句话说，如果通过多态的方式创建的对象想要调用子类特有方法
			// 那么必须执行一次强制转化
			// 而强制转化，也相当于新建了一个cat类型的对象，用这个新对象调用子类的方法
		}
		// 上面几个知识点：
		// 判断语句
		// 强制转化的原理
		// 强制转化的过程
	}
}
