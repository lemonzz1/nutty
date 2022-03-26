package com.System.Detection.console_code.System.macOS.File;

import com.File.File_CD.Data.ProjectPath;
import com.System.exec.ConsoleProcessing.terminal;

public class rmdir {
	public static void rmdir(String File_CD, String File_name) {
		File_CD = File_CD.replaceAll(" ", "\\\\");
		String Text = File_CD + "/" + File_name;
		terminal.set_terminal(Text);
	}

	public static void rmdir(String File_name) {
		String File_CD = ProjectPath.getCD();
		File_CD = File_CD.replaceAll(" ", "\\\\");
		String Text = File_CD + File_name;
		terminal.set_terminal(Text);
	}
}
