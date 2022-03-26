package com.help.console.code.codeText;

import com.File.File_CD.Data.ProjectPath;
import com.File.Text.TextPro;
import com.System.Time.Data.Time;
import com.System.console.Scanner;
import com.System.local.get_local;
import com.System.print.cont;
import com.help.Test;
import com.help.console.code.help;
import com.set.log;
import com.variable.sum.RandomPro;

import java.io.IOException;

public class switchClass {

	public static boolean switchService(String numt) {
		switch (numt.toLowerCase()) {
			case "exit()", "exit", "stop()", "stop", "break()", "break", "quit()", "quit" -> {
				cont.print(cont.PrintKEY.End, "Bey!");
				cont.print("nutty以停止运行");
				return false;
			}

			case "lemon", "zsepecisic" -> {
				cont.print("感谢你对nutty作出的贡献");
			}

			case "getlocal", "getlocal()", "local", "local()", "getlocalhost", "getlocalhost()", "localhost", "localhost()" -> {
				cont.print("用户名:\t\t" + get_local.LocalHost.user.get_user());
				cont.print("计算机名:\t\t" + get_local.LocalHost.SystemHost.get_computer());
			}

			case "cmd", "cmd()", "sh", "sh()", "zsh", "zsh()", "bash", "bash()" -> {
				cont.print(2, "是我不好用吗？");
			}

			case "log", "log()" -> {
				cont.print(2, log.jarName + "运行日志在:" + ProjectPath.getCDFile() + "/logs/log<日期>.log");
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
				cont.print(2,"\n帮助信息");
				cont.print(2, "nutty() -help/-start\t\t显示" + log.jarName + "包的详细帮助");
				cont.print(2,"\n对于本机用户信息");
				cont.print(2,"nutty() -userName\t\t获取当前用户名");
				cont.print(2,"nutty() -userPath\t\t获取用户所在路径");
				cont.print(2,"nutty() -userOfficePath\t\t获取当前用户工作路径");
				cont.print(2,"\n对于本机系统信息");
				cont.print(2,"nutty() -SystemName\t\t获取当前系统信息");
				cont.print(2,"nutty() -SystemVersion\t\t获取当前系统版本");
				cont.print(2,"nutty() -SystemArch\t\t获取当前系统架构");
				cont.print(2,"\n对于网络信息");
				cont.print(2,"nutty() -IP\t\t获取本机的IP");
				cont.print(2,"\n对于本机信息");
				cont.print(2,"nutty() -ComputerName\t\t获取本机名称");
				cont.print(2,"\n对于JDK信息");
				cont.print(2,"nutty() -JavaVersion\t\t获取当前Java版本");
				cont.print(2,"nutty() -JavaPath\t\t获取当前Java所在路径");
				cont.print(2,"对于项目信息");
				cont.print(2,"nutty -ProjectPath/-Path\t\t获取当前项目文件夹");
			}
			case "test", "test()" -> {
				cont.print(2, "test() -help/-start\t\t显示" + log.jarName + "包的详细帮助");
			}
			case "hello", "hello()", "world", "world()", "world!", "world!()" -> {
				cont.print(2, "Hello World!");
			}
			case "null", "null()", "\"\"", " ", "\" \"" -> {
				cont.print("\"null\"");
			}
			case "0" -> {
				cont.print("\"0\"");
			}
			case "0.0" -> {
				cont.print("\"0.0\"");
			}
			case "ran", "ran()", "random", "random()" -> {
				cont.print("生成随机数:\tran()/random()\t\t<Int>");
			}
			case "cat", "cat()" -> {
				cont.print("喵~");
			}
			case "error","error()" -> {
				cont.print("error() 不要尝试");
			}
			default -> {
				cont.print("不支持["+numt+"]");
			}
		}
		return true;
	}

	public static void switchServiceDouble(String numt, String DoubleText_0, String DoubleText_1) {
		switch (DoubleText_0.toLowerCase()) {
			case "nutty", "nutty()", "test", "test()" -> {
				if (DoubleText_1.equalsIgnoreCase("-help") || DoubleText_1.equalsIgnoreCase("--help") || DoubleText_1.equalsIgnoreCase("-start") || DoubleText_1.equalsIgnoreCase("--start")) {
					Test.main();
				} else if (DoubleText_1.equalsIgnoreCase("-thanks")) {
					help.HelloHelp.thanks();
				}else if (DoubleText_1.equalsIgnoreCase("-username")){
					cont.print(2,"用户名称:"+get_local.LocalHost.user.getUserName());
				}else if (DoubleText_1.equalsIgnoreCase("-userpath")){
					cont.print(2,"用户所在路径:"+get_local.LocalHost.user.getUserPath());
				}else if (DoubleText_1.equalsIgnoreCase("-userofficepath")){
					cont.print(2,"用户工作路径:"+get_local.LocalHost.user.getUserOfficePath());
				}else if (DoubleText_1.equalsIgnoreCase("-systemname")){
					cont.print(2,"系统名称:"+get_local.LocalHost.SystemHost.getSystemName());
				}else if (DoubleText_1.equalsIgnoreCase("-systemarch")){
					cont.print(2,"系统架构:"+get_local.LocalHost.SystemHost.getSystemFramework());
				}else if (DoubleText_1.equalsIgnoreCase("-systemversion")){
					cont.print(2,"系统版本:"+get_local.LocalHost.SystemHost.getSystemVersion());
				}else if (DoubleText_1.equalsIgnoreCase("-computername")){
					cont.print(2,"本机名称:"+get_local.LocalHost.SystemHost.get_computer_name());
				}else if ((DoubleText_1.equalsIgnoreCase("-ip"))){
					cont.print(2,"本机的IP:"+get_local.LocalHost.getLocalIP());
				}else if (DoubleText_1.equalsIgnoreCase("-javaversion")){
					cont.print(2,"Java版本:"+get_local.Java.getLocalHostJavaVersion());
				}else if (DoubleText_1.equalsIgnoreCase("-javapath")||DoubleText_1.equalsIgnoreCase("-javainstallpath")){
					cont.print(2,"Java所在路径:"+get_local.Java.getJavaInstallPath());
				}else if (DoubleText_1.equalsIgnoreCase("-projectpath")||DoubleText_1.equalsIgnoreCase("-path")){
					cont.print(2,"项目所在路径:"+ProjectPath.getCDFile());
				}else if (DoubleText_1.equalsIgnoreCase("-setpassword")){
					cont.print(1,"新密码:");
					log.jarPassWord = Scanner.input.PassWord();
				}
				else{
					cont.print("不支持["+numt+"]");
				}
			}
			case "nuttyconsole", "nuttyconsole()" -> {
				if (DoubleText_1.equalsIgnoreCase("-help") || DoubleText_1.equalsIgnoreCase("--help")) {
					cont.print("帮助正在编辑中");
				}else {
					cont.print("不支持["+numt+"]");
				}
			}
			case "hello", "hello()" -> {
				if (DoubleText_1.equalsIgnoreCase("world")) {
					cont.print(2, "Hello World!");
				}else{
					cont.print("不支持["+numt+"]");
				}
			}
			case "ran", "ran()", "random", "random()" -> {
				try {
					int Ran = RandomPro.nextInteger(Integer.parseInt(DoubleText_1));
					cont.print(2,Ran);
				} catch (Exception Error) {
					Error.printStackTrace();
				}
			}
			case "error","error()"->{
				if (DoubleText_1.equalsIgnoreCase("-log")||DoubleText_1.equalsIgnoreCase("-logs")){
					while (true){
						cont.print(1,"你确定要执行吗?\n(y/n)>");
						String string = Scanner.input.PassWord();
						if (string.equalsIgnoreCase("y")){
							cont.print("警告! 一但开始运行只能强制结束进程才能结束");
							cont.print(1,"PassWord:");
							String PassWord = Scanner.input.PassWord();
							if (PassWord.equals(log.jarPassWord)){
								try {
									TextPro.get_TextPro_Class(ProjectPath.getCDFile()+"/logs/[" + log.Name+"]" + Time.System_Time("yyyy-MM-dd") + ".log");
								} catch (IOException e) {
									e.printStackTrace();
									cont.print_logs(4,"打开失败");
								}
							}else{
								cont.print("密码错误退出运行");
								break;
							}
						}else if (string.equalsIgnoreCase("n")){
							break;
						}else{
							cont.print(2,"输入错误");
						}
					}
				}
			}
			default -> {
				cont.print("不支持["+numt+"]");
			}
		}
	}
}
