package com.help;

import com.help.console.console;
import com.project.log.Project;
import com.set.log;

public class Main {
	public static void main(String[] args) {
		try {
			Project.logs_Pro(2, log.Name, "正在运行");
			console.code();
			Project.logs_Pro(2, log.Name, "以停止运行");
		} catch (Exception e) {
			Project.logs_Pro(4, log.Name, Thread.currentThread().getStackTrace()[1].getClassName() + "@" + Thread.currentThread().getStackTrace()[1].getMethodName() + "():遇到错误");
			e.printStackTrace();
		}
	}
}
