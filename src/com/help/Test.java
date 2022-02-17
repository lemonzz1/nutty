package com.help;

import com.System.console.Scanner;
import com.System.print.cont;
import com.help.console.console;
import com.set.log;

import javax.swing.*;

public class Test {
	public static void main() {
		cont.print(2, "有什么需要帮助的吗?");
		int i = 0;
		while (true) {
			cont.print(2, "1.帮助\t2.简介\t3.运行终端代码\t4.弹出弹出对话框\t5.退出");
			i = Scanner.input_title.Int("1~4>>>");
			if (i > 5 || i <= 0) {
				cont.print(2,"只能输入1-4之内的整数");
				i = 0;
			}else if (i == 4){
				Object[] options ={ "帮助", "简介", "运行终端代码","退出"};
				String s = (String) JOptionPane.showInputDialog(null,"选择你要的功能:\n", log.jarName, JOptionPane.PLAIN_MESSAGE, new ImageIcon("xx.png"), options, "xx");
				if (s.equals("帮助")){
					i = 1;
				}else if (s.equals("简介")){
					i = 2;
				}else if (s.equals("运行终端代码")) {
					i = 3;
				}else if (s.equals("退出")) {
					i = 5;
				}
			}
			switch (i) {
				case 1 -> {
					cont.print(2,"帮助请查看:" + log.jarUrl);
				}
				case 2 -> {
					cont.print(2,"包名称:\t\t" + log.jarName);
					cont.print(2,"包版本:\t\t" + log.jarVersion);
					cont.print(2,"包作者:\t\t" + log.jarAuthor);
					cont.print(2,log.jarAuthor+"联系方式:\t\t"+log.jarEmail);
					cont.print(2,"包网站:\t\t" + log.jarUrl);
					cont.print(2,"main位置:\t\t" + log.jarMainFile);
				}
				case 3 -> {
					console.code();
				}
				case 5 -> {
					System.exit(0);
				}
				default -> {
					cont.print_logs("Test.main():变量i遇到不可用的值");
				}
			}

		}
	}
}
