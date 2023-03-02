package wo1261931780.stcodeClips.a20230301;

import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230301
 *
 * @author liujiajun_junw
 * @Date 2023-03-17-42  星期三
 * @description
 */
@Slf4j
public class A031获取时间 {
	public static void main(String[] args) {
		show();
	}

	public static void show() {
		// 获取系统时间的几种方式：
		Date demo1 = new Date();
		long millis = System.currentTimeMillis(); // 直接获取当前ms值
		log.info(String.valueOf(millis));
		demo1.setTime(millis);// 将其转化为date类型输出
		log.info(String.valueOf(demo1));
		log.info(String.valueOf(new Date(System.currentTimeMillis())));// 直接这样写也可以
	}
}
