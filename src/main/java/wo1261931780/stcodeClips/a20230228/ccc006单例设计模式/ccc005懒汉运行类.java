package wo1261931780.stcodeClips.a20230228.ccc006单例设计模式;

public class ccc005懒汉运行类 {
	public static void main(String[] args) {
		ccc004懒汉单例设计模式 demo1 = ccc004懒汉单例设计模式.getIns();
		ccc004懒汉单例设计模式 demo2 = ccc004懒汉单例设计模式.getIns();// 在需要的时候再去调用获取对象的方法
		System.out.println(demo1 == demo2);// 和饿汉结果一样，都是拿到相同的对象，因此对象的地址都一样
		ccc004懒汉单例设计模式.show();// 如果不获取方法，那么直接调用内部的show方法也可以
	}
}
