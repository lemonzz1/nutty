package com.System.Detection.console_code.System.File;

import com.File.File_CD.Data.FileCD;
import com.System.exec.Console_processing.terminal;

public class mkdir {
	public static void mkdir(String File_CD, String File_name) {
		File_CD = File_CD.replaceAll(" ", " \\\\ ");
		String code = "mkdir \"" + File_CD + "/" + File_name + "\"";
		terminal.set_terminal(code);
	}

	public static void mkdir(String File_name) {
		String File_CD = FileCD.getCD();
		File_CD = File_CD.replaceAll(" ", "\\\\ ");
		String code = "mkdir \"" + File_CD + "/" + File_name + "\"";
		terminal.set_terminal(code);
	}

}
