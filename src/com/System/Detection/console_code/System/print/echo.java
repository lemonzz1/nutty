package com.System.Detection.console_code.System.print;

import com.System.Detection.Detection;
import com.System.exec.Console_processing.terminal;

public class echo extends Detection {
	public static void echo(String echo_Print) {
		String code = "echo " + echo_Print;
		terminal.set_terminal(code);
	}
}
