package wo1261931780.stcodeClips.a20230301;

import lombok.extern.slf4j.Slf4j;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230301
 *
 * @author liujiajun_junw
 * @Date 2023-03-19-43  星期三
 * @description
 */
@Slf4j
public class A032时间解析 {
	public static void main(String[] args) throws ParseException {
		Date demo = new Date();// 获取当前的时间，一个date类型的对象
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		// 获取一个时间解析器，设置指定的时间格式
		String format = simpleDateFormat.format(demo);// 用解析器，将时间解析为一个字符串
		log.info(format);// 得到一个时间字符串 ：2023-03-01 19-44-40
		log.info("我是分割线------------------------");
		String time = "2023年3月1日19:46:40";
		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日HH:mm:ss");
		Date resultDate = simpleDateFormat1.parse(time);
		log.info("我是解析结果：" + resultDate);// Wed Mar 01 19:46:40 CST 2023
	}
}
