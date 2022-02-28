package com.help.console;

import com.System.console.Scanner;
import com.System.exec.Console_processing.terminal;
import com.System.print.cont;
import com.help.Test;
import com.project.log.Project;
import com.set.log;

public class console {
	public static void code() {
		Project.logs_Pro(2, "正在运行");
		cont.print(2, log.jarName+"控制台\n输入:nutty -help\n显示详细帮助");
		boolean c = true;
		while (c) {
			String code_Text = Scanner.input_title.String("nutty>>>");
			int code_Text_FG_i_1 = code_Text.length();
			int code_Text_FG_i_2 = code_Text.indexOf(" ");
			if (code_Text_FG_i_2<=0){
				switch (code_Text.toLowerCase()){
					case "exit","stop","quit","break" -> {
						cont.print(2,"退出代码为exit(),stop(),quit(),break()");
					}

					case "exit()","stop()","break()","quit()" -> {
						Project.logs_Pro(2, "以退出运行");
						c = false;
					}

					case "help()" -> {
						cont.print(2, log.jarName+"控制台帮助");
						cont.print(2,"nutty -help\t\t显示"+log.jarName+"包的详细帮助");
						cont.print(2,"nuttyConsole -help\n\n显示"+log.jarName+"的帮助");
					}
					case "nuttyconsole" -> {
						cont.print(2,log.jarName+"已在运行");
					}
					default -> {
						terminal.set_terminal(code_Text);
					}
				}
			}else{
				String code_Text_FG_0 = code_Text.substring(0,code_Text_FG_i_2);
				String code_Text_FG_1 = code_Text.substring((code_Text_FG_i_2+1));
				int code_text_FG_i_3 = code_Text_FG_1.indexOf(" ");
				String code_Text_FG_2 = null;
				if (code_text_FG_i_3>0){
					code_Text_FG_2 = code_Text_FG_1.substring(code_text_FG_i_3+1);
					cont.print(2,code_Text_FG_2);
				}
				switch (code_Text_FG_0.toLowerCase()){
					case "ping" -> {
						String code = "ping -c10 "+code_Text_FG_1;
						terminal.set_terminal(code);
					}
					case "nutty" -> {
						if (code_Text_FG_1.equalsIgnoreCase("-help")){
							Test.main();
						}
					}
					case "nuttyconsole" -> {
						if (code_Text_FG_1.equalsIgnoreCase("-help")){
							cont.print("帮助正在编辑中");
						}
					}
					default -> {
						terminal.set_terminal(code_Text);
					}
				}
			}

		}
	}
}
