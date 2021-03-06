package com.project.log;

import com.File.File_CD.Data.ProjectPath;
import com.File.Text.setTextPro;
import com.System.Time.Data.Time;
import com.System.local.get_local;
import com.System.print.List;
import com.System.print.console;
import com.System.print.cont;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Project {
	private final static String defTitle = "log";

	public static void logs(String title, String logs_Text) {
		try {
			logs_Text = logs_Text.replaceAll("\n", "[\\\\n]");
			if (File_list(ProjectPath.getCDFile() + "/logs")) {
				FileWriter fileWriter = new FileWriter(ProjectPath.getCDFile() + "/logs/[" + title + "]" + Time.System_Time("yyyy-MM-dd") + ".log", true);
				logs_Text = "[" + get_local.LocalHost.SystemHost.get_computer_name() + "@" + get_local.LocalHost.user.get_user_name() + "|" + Time.System_Time() + "#"+get_local.LocalHost.getLocalIP()+"]:" + logs_Text;
				setTextPro setTextPro = new setTextPro(ProjectPath.getCDFile() + "/logs/[" + title + "]" + Time.System_Time("yyyy-MM-dd") + ".log", logs_Text + "\n", true);
			} else {
				console.print_logs(4, List.getHashMap(23) + "@" + List.getHashMap(24));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void logs_file_class(int i, String logs_Text) {
		logs(defTitle, logs_Text);
		cont.print_logs(i, logs_Text);

	}

	private static void logs_file_class(int i, String title, String logs_Text) {
		logs(title, logs_Text);
		cont.print_logs(i, logs_Text);

	}

	public static void logs_file(String logs_text) {
		logs_file_class(4, logs_text);
	}

	public static void logs_file(int i, String title, String logs_text) {
		logs_file_class(i, title, logs_text);
	}

	public static void logs_file(String title, String logs_text) {
		logs_file_class(4, title, logs_text);
	}

	public static void logs_file(int i, String logs_text) {
		logs_file_class(i, logs_text);
	}

	public static void logs_Pro(int i, String logs_text) {
		String class_name = new Exception().getStackTrace()[1].getClassName() + "@" + new Exception().getStackTrace()[1].getMethodName() + "():" + logs_text;
		logs_file_class(i, class_name);
	}

	public static void logs_Pro(String logs_text) {
		String class_name = new Exception().getStackTrace()[1].getClassName() + "@" + new Exception().getStackTrace()[1].getMethodName() + "():" + logs_text;
		logs_file_class(4, class_name);
	}

	public static void logs_Pro(String title, String logs_text) {
		String class_name = new Exception().getStackTrace()[1].getClassName() + "@" + new Exception().getStackTrace()[1].getMethodName() + "():" + logs_text;
		logs_file_class(4, title, class_name);
	}

	public static void logs_Pro(int i, String title, String logs_text) {
		String class_name = new Exception().getStackTrace()[1].getClassName() + "@" + new Exception().getStackTrace()[1].getMethodName() + "():" + logs_text;
		logs_file_class(i, title, class_name);
	}

	public static void logs_Pro_file(String logs_text) {
		String class_name = new Exception().getStackTrace()[1].getClassName() + "@" + new Exception().getStackTrace()[1].getMethodName() + "():" + logs_text;
		logs(defTitle, class_name);
	}

	public static void logs_Pro_file(String title, String logs_text) {
		String class_name = new Exception().getStackTrace()[1].getClassName() + "@" + new Exception().getStackTrace()[1].getMethodName() + "():" + logs_text;
		logs(title, class_name);
	}

	private static boolean File_list(String file_CD) {
		File file = new File(file_CD);
		if (file.exists()) {
			return true;
		} else {
			return file.mkdirs();
		}
	}
}
