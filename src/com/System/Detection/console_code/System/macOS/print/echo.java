package com.System.Detection.console_code.System.macOS.print;

import com.System.Detection.console_code.System.macOS.Detection;
import com.System.exec.ConsoleProcessing.terminal;

public class echo extends Detection {
	public static void echo(String echo_Print) {
		String code = "echo " + echo_Print;
		terminal.set_terminal(code);
	}
}
