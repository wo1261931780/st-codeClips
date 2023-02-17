package com.github.stcodeClips.github.io.a20230217;

import lombok.extern.slf4j.Slf4j;
/**
 * @author junw
 */


@Slf4j
public class A001方法重载 {
	public static void main(String[] args) {
		show(1);
		show(1, 2);
		show(1, 2, 3);
		log.info("结束");
	}

	public static void show(int x) {
		log.info(String.valueOf(x));
	}

	public static void show(int x, int y) {
		log.info(String.valueOf(x + y));
	}

	public static void show(int x, int y, int z) {
		log.info(String.valueOf(x + y + z));
	}
}
