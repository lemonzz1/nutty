package com.System.print;

import com.project.log.Project;
import com.set.log;

import static com.System.Time.Data.Time.System_Time;
import static com.System.local.get_local.get_local_computer_name;
import static com.System.local.get_local.get_local_user_name;

public class cont {

	public enum PrintKEY{
		NotEnd,End,ErrorNotEnd,ErrorEnd
	}

	public cont(int i, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + i + "," + print_Text + "]");
		Print(i, print_Text);
	}

	public cont(PrintKEY printKEY, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + printKEY + "," + print_Text + "]");
		Print(printKEY, print_Text);
	}

	public cont(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		Print(2, print_Text);
	}

	public static void Class_Print(int i, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + i + "," + print_Text + "]");
		Print(i, print_Text);
	}

	public static void Class_Print(PrintKEY printKEY, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + printKEY + "," + print_Text + "]");
		Print(printKEY, print_Text);
	}

	public static void Class_Print(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		Print(2, print_Text);
	}

	public static void Class_Println(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		Print(2, print_Text);
	}

	public static void System_Print(int i, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + i + "," + print_Text + "]");
		Print(i, print_Text);
	}

	public static void System_Print(PrintKEY printKEY, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + printKEY + "," + print_Text + "]");
		Print(printKEY, print_Text);
	}

	public static void System_Print(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		Print(2, print_Text);
	}

	public static void System_Println(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		Print(2, print_Text);
	}

	public static void System_Print_logs(int i, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + i + "," + print_Text + "]");
		logs(i, print_Text);
	}

	public static void System_Print_logs(PrintKEY printKEY, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + printKEY + "," + print_Text + "]");
		logs(printKEY, print_Text);
	}

	public static void System_Print_logs(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		logs(2, print_Text);
	}

	public static void System_Println_logs(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		logs(2, print_Text);
	}

	public static void Class_Print_logs(int i, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + i + "," + print_Text + "]");
		logs(i, print_Text);
	}

	public static void Class_Print_logs(PrintKEY printKEY, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + printKEY + "," + print_Text + "]");
		logs(printKEY, print_Text);
	}

	public static void Class_Print_logs(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		logs(2, print_Text);
	}

	public static void Class_Println_logs(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		logs(2, print_Text);
	}

	public static void print(int i, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + i + "," + print_Text + "]");
		Print(i, print_Text);
	}

	public static void print(PrintKEY printKEY, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + printKEY + "," + print_Text + "]");
		Print(printKEY, print_Text);
	}

	public static void print(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		Print(2, print_Text);
	}

	public static void print(int i) {
		Project.logs_Pro_file(log.Name, "打印:[默认,空值]");
		print(i, "");
	}

	public static void print(PrintKEY printKEY) {
		Project.logs_Pro_file(log.Name, "打印:[默认,空值]");
		print(printKEY, "");
	}

	public static void print() {
		Project.logs_Pro_file(log.Name, "打印:[默认,空值]");
		print(2, "");
	}

	public static void println(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		Print(2, print_Text);
	}

	public static void print_logs(int i, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + i + "," + print_Text + "]");
		logs(i, print_Text);
	}

	public static void print_logs(PrintKEY printKEY, Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[" + printKEY + "," + print_Text + "]");
		logs(printKEY, print_Text);
	}

	public static void print_logs(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		logs(2, print_Text);
	}

	public static void println_logs(Object print_Text) {
		Project.logs_Pro_file(log.Name, "打印:[默认," + print_Text + "]");
		logs(2, print_Text);
	}

	private static void logs(int i, Object object) {
		Print(i, "[" + get_local_computer_name() + "@" + System_Time("yyyy-MM-dd|HH:mm:ss") + "->" + get_local_user_name() + "]:" + object);
	}

	private static void logs(PrintKEY printKEY, Object object) {
		Print(printKEY, "[" + get_local_computer_name() + "@" + System_Time("yyyy-MM-dd|HH:mm:ss") + "->" + get_local_user_name() + "]:" + object);
	}

	private static void Print(int i, Object object){
		PrintText(i,object);
	}

	private static void Print(PrintKEY printKEY,Object object){
		switch (printKEY){
			case NotEnd -> {
				PrintText(1,object);
			}
			case End -> {
				PrintText(2,object);
			}
			case ErrorNotEnd -> {
				PrintText(3,object);
			}
			case ErrorEnd -> {
				PrintText(4,object);
			}
		}
	}

	private static void PrintText(int KEY, Object object) {
		if (KEY > 4 || KEY <= 0) {
			KEY = 2;
		}
		switch (KEY) {
			case 1 -> {
				System.out.print(object);
			}
			case 2 -> {
				System.out.println(object);
			}
			case 3 -> {
				System.err.print(object);
			}
			case 4 -> {
				System.err.println(object);
			}
		}
	}
}
