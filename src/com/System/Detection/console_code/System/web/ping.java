package com.System.Detection.console_code.System.web;

import com.System.Detection.Detection;
import com.System.exec.Console_processing.terminal;
import com.System.print.cont;

public class ping extends Detection {
	private static int fi;
	private static String fip;

	public static void ping(int i, String ip) {
		if (i >= 100) {
			cont.print_logs("参数1数值过大[" + i + "]已设置为10)");
			i = 10;
		}
		fi = i;
		fip = ip;
		ping_code();
	}

	public static void ping(String ip) {
		fip = ip;
	}

	private static void ping_code() {
		if (fi == 0||fi >=100) {
			fi = 10;
		}
		String code = "ping -c" + fi + " " + fip;
		terminal.set_terminal(code);
	}
}
