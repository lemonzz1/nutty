package com.System.Detection.console_code.System.File;

import com.File.File_CD.Data.FileCD;
import com.System.exec.Console_processing.terminal;

public class rmdir {
	public static void rmdir(String File_CD, String File_name) {
		File_CD = File_CD.replaceAll(" ", "\\\\");
		String Text = File_CD + "/" + File_name;
		terminal.set_terminal(Text);
	}

	public static void rmdir(String File_name) {
		String File_CD = FileCD.get_CD();
		File_CD = File_CD.replaceAll(" ", "\\\\");
		String Text = File_CD + File_name;
		terminal.set_terminal(Text);
	}
}
