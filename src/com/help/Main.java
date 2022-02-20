package com.help;

import com.project.log.Project;

public class Main {
	public static void main(String[] args) {
		try {
			Project.logs_Pro(2, "正在运行");
			int error_int = Test.main();
			Project.logs_Pro(2, "以停止运行 退出代码[" + error_int + "]");
			System.exit(error_int);
		} catch (Exception e) {
			Project.logs_Pro(4, Thread.currentThread().getStackTrace()[1].getClassName() + "@" + Thread.currentThread().getStackTrace()[1].getMethodName() + "():遇到错误");
			e.printStackTrace();
		}
	}
}
