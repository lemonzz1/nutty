package com.variable.sum;

import com.project.log.Project;
import com.set.log;

import java.util.Random;

public class RandomPro {
	public static int nextInteger(int MAX) {
		try {
			Random random = new Random();
			int sum = random.nextInt(MAX);
			Project.logs_Pro_file(log.Name, "生成随机数:" + sum);
			return sum;
		} catch (Exception Error) {
			Error.printStackTrace();
			Project.logs_Pro(log.Name, "随机数生成失败:" + Error);
			return 0;
		}
	}

	public static int[] nextInteger(int length, int MAX) {
		int[] sum = new int[length];
		try {
			Random random = new Random();
			for (int i = 0; i < sum.length; i++) {
				sum[i] = random.nextInt(MAX);
				Project.logs_Pro_file(log.Name, "生成随机数:" + sum[i]);
			}
			return sum;
		} catch (Exception Error) {
			Error.printStackTrace();
			Project.logs_Pro(log.Name, "随机数生成失败:" + Error);
			return null;
		}
	}

	public static double nextDouble() {
		try {
			Random random = new Random();
			double sum = random.nextDouble();
			Project.logs_Pro_file(log.Name, "生成随机数:" + sum);
			return sum;
		} catch (Exception Error) {
			Error.printStackTrace();
			Project.logs_Pro(log.Name, "随机数生成失败:" + Error);
			return 0.0;
		}
	}

	public static double[] nextDouble(int length) {
		double[] sum = new double[length];
		try {
			Random random = new Random();
			for (int i = 0; i < sum.length; i++) {
				sum[i] = random.nextDouble();
				Project.logs_Pro_file(log.Name, "生成随机数:" + sum[i]);
			}
			return sum;
		} catch (Exception Error) {
			Error.printStackTrace();
			Project.logs_Pro(log.Name, "随机数生成失败:" + Error);
			return null;
		}
	}
}
