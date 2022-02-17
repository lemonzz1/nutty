package com.help.console;

import com.System.console.Scanner;
import com.System.exec.Console_processing.terminal;
import com.System.print.cont;

public class console {
	public static void code() {
		while (true) {
			String code_Text = Scanner.input_title.String("Java>>>");
			if (code_Text.equalsIgnoreCase("exit")) {
				cont.print("console.code()以退出");
				break;
			}
			terminal.set_terminal(code_Text);
		}
	}
}
