package wo1261931780.stcodeClips.a20230301;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Intellij IDEA.
 * Project:st-codeClips
 * Package:wo1261931780.stcodeClips.a20230301
 *
 * @author liujiajun_junw
 * @Date 2023-03-17-18  星期三
 * @description
 */
@Slf4j
public class A030测试cpu性能 {
	public static void main(String[] args) {
		// 这个是和1970年之间的毫秒值

		long x1 = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			log.info(String.valueOf(i));
		}
		long x2 = System.currentTimeMillis();
		log.info("total:" + (x2 - x1) + "ms");
		// 2023年3月1日17:35:52
		// 笔记本5700U的性能：127ms
		// 阿里云主机的性能：1238ms
		// 台式机待测试
	}
}
