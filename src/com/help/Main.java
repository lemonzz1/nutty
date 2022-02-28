package com.help;

import com.help.console.console;
import com.project.log.Project;

public class Main {
	public static void main(String[] args) {
		try {
			Project.logs_Pro(2, "正在运行");
			console.code();
			Project.logs_Pro(2, "以停止运行");
		} catch (Exception e) {
			Project.logs_Pro(4, Thread.currentThread().getStackTrace()[1].getClassName() + "@" + Thread.currentThread().getStackTrace()[1].getMethodName() + "():遇到错误");
			e.printStackTrace();
		}
	}
}
