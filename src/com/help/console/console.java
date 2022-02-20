package com.help.console;

import com.System.console.Scanner;
import com.System.exec.Console_processing.terminal;
import com.project.log.Project;

public class console {
	public static void code() {
		Project.logs_Pro(2, "正在运行");
		while (true) {
			String code_Text = Scanner.input_title.String("Java>>>");
			if (code_Text.equalsIgnoreCase("exit")) {
				Project.logs_Pro(2, "以退出运行");
				break;
			}
			terminal.set_terminal(code_Text);
		}
	}
}
