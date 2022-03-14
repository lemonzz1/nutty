package com.help.console;

import com.System.console.Scanner;
import com.System.print.cont;
import com.help.console.code.codeText.switchClass;
import com.project.log.Project;
import com.set.log;

public class console {
	public static void code() {
		Project.logs_Pro(2, log.Name, "正在运行");
		cont.print(2, log.jarName + "控制台\n输入:nutty -help\n显示详细帮助");
		boolean c = true;
		while (c) {
			String code_Text = Scanner.inputTitle.String("nutty>>>");
			if (!code_Text.equals("")) {
				int code_Text_FG_i_2 = code_Text.indexOf(" ");
				if (code_Text_FG_i_2 <= 0) {
					c = switchClass.switchService(code_Text);
					if (!c) {
						Project.logs_Pro(2, log.Name, "以停止运行");
					}
				} else {
					String code_Text_FG_0 = code_Text.substring(0, code_Text_FG_i_2);
					String code_Text_FG_1 = code_Text.substring((code_Text_FG_i_2 + 1));
					switchClass.switchServiceDouble(code_Text, code_Text_FG_0, code_Text_FG_1);
				}
			}
		}
	}
}
