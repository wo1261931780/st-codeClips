package wo1261931780.stcodeClips.a20230228.ccc006单例设计模式;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ccc003饿汉运行类 {
	public static void main(String[] args) {
		// ccc002饿汉设计模式 x=new ccc002饿汉设计模式();// 不能直接新建对象
		ccc002饿汉设计模式 demo1 = ccc002饿汉设计模式.x;// 直接调用类中已经存在的对象
		// 然后将对象赋值给新的demo1
		ccc002饿汉设计模式 demo2 = ccc002饿汉设计模式.x;
		ccc002饿汉设计模式 demo3 = ccc002饿汉设计模式.x;
		log.info(String.valueOf(demo1 == demo2));// true
		log.info(String.valueOf(demo2 == demo3));// true
		// 因为demo1和demo2都是x的对象地址，二者本质上指向的就是同一个对象
	}
}
