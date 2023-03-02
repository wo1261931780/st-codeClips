package wo1261931780.stcodeClips.a20230302;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220213.ccc051正则表达式
 * User:  wo1261931780@gmail.com
 * Time:  2022-02-13-39  星期日
 */
@Slf4j
public class A034规则 {
	public static void main(String[] args) {

		// public boolean matches(String regex):判断是否与正则表达式匹配, 匹配返回true
		// 只能是 a  b  c
		log.info(String.valueOf("a".matches("[abc]"))); // true
		log.info(String.valueOf("z".matches("[abc]"))); // false

		// 不能出现a  b  c
		log.info(String.valueOf("a".matches("[^abc]"))); // false
		log.info(String.valueOf("z".matches("[^abc]"))); // true

		log.info(String.valueOf("a".matches("\\d"))); // false
		log.info(String.valueOf("3".matches("\\d"))); // true
		log.info(String.valueOf("333".matches("\\d"))); // false
		log.info(String.valueOf("z".matches("\\w"))); // true
		log.info(String.valueOf("2".matches("\\w"))); // true
		log.info(String.valueOf("21".matches("\\w"))); // false
		log.info(String.valueOf("你".matches("\\w"))); // false
		log.info(String.valueOf("你".matches("\\W"))); // true
		log.info("---------------------------------");
		//  以上正则匹配只能校验单个字符。

		// 校验密码
		// 必须是数字 字母 下划线 至少 6位
		log.info(String.valueOf("2442fsfsf".matches("\\w{6,}")));
		log.info(String.valueOf("244f".matches("\\w{6,}")));

		// 验证码 必须是数字和字符  必须是4位
		log.info(String.valueOf("23dF".matches("[a-zA-Z0-9]{4}")));
		log.info(String.valueOf("23_F".matches("[a-zA-Z0-9]{4}")));
		// log.info("23dF".matches("[\\w && ^_]{4}"));
		// 报错，首先不能带括号
		// 其次这里的^_需要放置在[]中间
		log.info(String.valueOf("23dF".matches("[\\w&&[^_]]{4}")));
		log.info(String.valueOf("23_F".matches("[\\w&&[^_]]{4}")));
	}
}
