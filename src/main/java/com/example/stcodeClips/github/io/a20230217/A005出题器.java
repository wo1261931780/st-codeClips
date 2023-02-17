package com.example.stcodeClips.github.io.a20230217;

import lombok.extern.slf4j.Slf4j;

import java.security.SecureRandom;
/**
 * @author junw
 */

@Slf4j
public class A005出题器 {
	public static void main(String[] args) {
		// Random x = new Random();
		SecureRandom x = new SecureRandom();
		for (int i = 0; i < 3; i++) {
			int x1 = x.nextInt(44);
			log.info(String.valueOf(x1));
		}
		// 2021年10月29日19:10:05
		// ===========4，7，17
		// 学生管理系统，重写一遍
		// for循环计算阶乘，一共四种循环方法
		// 写一个方法重载的案例
		// ****************************************************************
		// 2021年10月31日09:10:45
		// ===========2，12，22
		// 随机生成五个数字，自动判断最值，然后输出
		// 获得两个随机数字，参与数组排序，并展示结果
		// 数组中，不包含7的所有元素求和
	}
}
