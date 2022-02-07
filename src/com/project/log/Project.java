package com.project.log;

import com.File.File_CD.File_CD;
import com.File.Text.set_Text_Pro;
import com.System.Time.Data.Time;
import com.System.local.get_local;
import com.System.print.List;
import com.System.print.console;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Project {
	public static void logs(String logs_Text) {
		try {
			logs_Text = logs_Text.replaceAll("\n", "[\\\\n]");
			if (File_list(File_CD.get_CD_File() + "/logs")) {
				FileWriter fileWriter = new FileWriter(File_CD.get_CD_File() + "/logs/log" + Time.System_Time("yyyy-MM-dd") + ".log", true);
				logs_Text = "[" + get_local.get_computer_name() + "@" + get_local.get_user_name() + "|" + Time.System_Time() + "]:" + logs_Text;
				set_Text_Pro setTextPro = new set_Text_Pro(File_CD.get_CD_File() + "/logs/log" + Time.System_Time("yyyy-MM-dd") + ".log", logs_Text + "\n", true);
			} else {
				console.print_logs(4, List.getHashMap(23) + "@" + List.getHashMap(24));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
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
