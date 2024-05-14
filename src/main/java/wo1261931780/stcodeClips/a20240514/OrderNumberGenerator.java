package wo1261931780.stcodeClips.a20240514;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20240425
 *
 * @author liujiajun_junw
 * @Date 2024-05-21-27  星期二
 * @Description 简单的Java示例，展示了如何结合时间戳、随机数和业务前缀生成订单号
 */
public class OrderNumberGenerator {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	private static final int RANDOM_NUM_BOUND = 10000; // 定义随机数范围

	public static String generateOrderNumber(String prefix) {
		// 生成时间戳部分
		String timestamp = dateFormat.format(new Date());

		// 生成随机数部分
		int randomNumber = ThreadLocalRandom.current().nextInt(RANDOM_NUM_BOUND);

		// 组合成订单号
		return prefix + timestamp + String.format("%04d", randomNumber);
	}

	public static void main(String[] args) {
		// 示例：生成订单号，假设业务前缀为"ORD"
		String orderNumber = generateOrderNumber("ORD");
		System.out.println("Generated Order Number: " + orderNumber);
	}

}
