package wo1261931780.stcodeClips.a20230228.ccc006单例设计模式;

public class ccc004懒汉单例设计模式 {
	// 因为是单例设计模式，优先保证单例的属性
	// 每个类中只有一个对象
	// 因此将无参构造私有化

	private ccc004懒汉单例设计模式() {
	}

	// 懒汉的特点是，一开始的对象为null
	// 懒汉的意义在于，如果单例只需要使用类中的方法，那么就不需要创建对象
	// 相比饿汉来说，省去了对象的创建过程

	public static ccc004懒汉单例设计模式 x;

	// 在需要使用对象的时候，调用方法来获取一个实际存在的对象

	public static ccc004懒汉单例设计模式 getIns() {
		if (x == null) {
			x = new ccc004懒汉单例设计模式();
		}
		return x;
	}

	public static void show() {
		System.out.println("show方法");
	}


}
