package com.help.console.code.codeText.code;

import com.System.exec.Console_processing.terminal;

public class ConsoleCodeClass {

	public static class WebIP {

		public static void ping(String IP) {
			terminal.set_terminal("ping -c10 " + IP);
		}

		public static void ping(int KEY, String IP) {
			terminal.set_terminal("ping -c" + KEY + " " + IP);
		}

	}

	public static class FileService {

		public static void rmdir(String FileCD) {
			terminal.set_terminal("rmdir " + FileCD);
		}

		public static void mkdir(String FileCD) {
			terminal.set_terminal("mkdir " + FileCD);
		}

	}


}
