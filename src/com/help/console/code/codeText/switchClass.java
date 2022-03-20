package com.help.console.code.codeText;

import com.File.File_CD.Data.FileCD;
import com.System.exec.Console_processing.terminal;
import com.System.local.get_local;
import com.System.print.cont;
import com.help.Test;
import com.help.console.code.help;
import com.set.log;
import com.variable.sum.RandomPro;

public class switchClass {

	public static boolean switchService(String numt) {
		switch (numt.toLowerCase()) {
			case "exit()", "exit", "stop()", "stop", "break()", "break", "quit()", "quit" -> {
				cont.print(cont.PrintKEY.End,"Bey!");
				cont.print("nutty以停止运行");
				return false;
			}

			case "lemon", "zsepecisic" -> {
				cont.print("感谢你对nutty作出的贡献");
			}

			case "getlocal", "getlocal()", "local", "local()", "getlocalhost", "getlocalhost()", "localhost", "localhost()" -> {
				cont.print("用户名:\t\t" + get_local.get_user());
				cont.print("计算机名:\t\t" + get_local.get_computer());
			}

			case "cmd", "cmd()", "sh", "sh()", "zsh", "zsh()", "bash", "bash()" -> {
				cont.print(2, "是我不好用吗？");
			}

			case "log", "log()" -> {
				cont.print(2, log.jarName + "运行日志在:" + FileCD.getCDFile() + "/logs/log<日期>.log");
			}

			case "help", "help()" -> {
				cont.print(2, log.jarName + "控制台帮助");
				cont.print(2, "nutty() -help\t\t显示" + log.jarName + "包的详细帮助");
				cont.print(2, "nuttyConsole() -help\n\n显示" + log.jarName + "的帮助");
			}

			case "code", "code()" -> {
				cont.print(2, log.jarMainFile);
			}

			case "nuttyconsole", "nuttyconsole()", "console", "console()" -> {
				cont.print(2, log.jarName + "已在运行");
			}

			case "nutty", "nutty()" -> {
				cont.print(2, "nutty() -help/-start\t\t显示" + log.jarName + "包的详细帮助");
			}
			case "test", "test()" -> {
				cont.print(2, "test() -help/-start\t\t显示" + log.jarName + "包的详细帮助");
			}
			case "hello", "hello()","world","world()","world!","world!()" -> {
				cont.print(2, "Hello World!");
			}
			case "null", "null()","\"\""," ","\" \"" -> {
				cont.print("\"null\"");
			}
			case "0" -> {
				cont.print("\"0\"");
			}
			case "0.0" -> {
				cont.print("\"0.0\"");
			}
			case "ran","ran()","random","random()" -> {
				cont.print("生成随机数:\tran()/random()\t\t<Int>");
			}
			case "cat","cat()" -> {
				cont.print("喵~");
			}
			default -> {
				terminal.set_terminal(numt);
			}
		}
		return true;
	}

	public static void switchServiceDouble(String numt, String DoubleText_0, String DoubleText_1) {
		switch (DoubleText_0.toLowerCase()) {
			case "nutty", "nutty()","test", "test()" -> {
				if (DoubleText_1.equalsIgnoreCase("-help") || DoubleText_1.equalsIgnoreCase("--help") || DoubleText_1.equalsIgnoreCase("-start") || DoubleText_1.equalsIgnoreCase("--start")) {
					Test.main();
				} else if (DoubleText_1.equalsIgnoreCase("-thanks")) {
					help.HelloHelp.thanks();
				}
			}
			case "nuttyconsole", "nuttyconsole()" -> {
				if (DoubleText_1.equalsIgnoreCase("-help") || DoubleText_1.equalsIgnoreCase("--help")) {
					cont.print("帮助正在编辑中");
				}
			}
			case "hello", "hello()" -> {
				if (DoubleText_1.equalsIgnoreCase("world")) {
					cont.print(2, "Hello World!");
				}
			}
			case "ran","ran()","random","random()" -> {
				try{
					int i = RandomPro.nextInteger(Integer.parseInt(DoubleText_1));
					cont.print(i);
				}catch (Exception Error){
					cont.print(cont.PrintKEY.End,"只能输入<int>值");
					Error.printStackTrace();
				}
			}
			default -> {
				terminal.set_terminal(numt);
			}
		}
	}


}
