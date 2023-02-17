package com.example.stcodeClips.github.io.a20230217;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author junw
 */

@Slf4j
public class A002继承 {
	public static void main(String[] args) {
		jc1();
		log.info("结束");
	}

	public static void jc1() {
		Scanner x = new Scanner(System.in);
		log.info("请输入数字：");
		int x3 = x.nextInt();
		// ArrayList<Object> xx = new ArrayList<>();
		int[] xx = new int[x3];
		xx[0] = 1;
		xx[1] = 1;
		for (int i = 2; i < x3; i++) {
			xx[i] = xx[i - 1] + xx[i - 2];
		}
		log.info(Arrays.toString(xx));
	}

// --注释掉检查 START (2022-09-01 12:35):
//    public static int jc2(int n) {
//        if (n == 1 || n == 2) {
//            return 1;
//        } else {
//            return jc2(n - 1) + jc2(n - 2);
//        }
//
//    }
// --注释掉检查 STOP (2022-09-01 12:35)
}
