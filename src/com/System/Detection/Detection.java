package com.System.Detection;

import com.System.Detection.console_code.System.File.rmdir;
import com.System.Detection.console_code.System.print.echo;
import com.System.Detection.console_code.System.File.mkdir;
import com.System.Detection.console_code.System.web.ping;

public class Detection {
	public static class macOS {
		public static class code {
			public static void ping(int i, String ip) {
				ping.ping(i, ip);
			}

			public static void ping(String ip) {
				ping.ping(ip);
			}

			public static void echo(String echo_Print) {
				echo.echo(echo_Print);
			}

			public static void mkdir(String File_CD, String File_name) {
				mkdir.mkdir(File_CD, File_name);
			}

			public static void mkdir(String File_name) {
				mkdir.mkdir(File_name);
			}
		}

		public static void rmdir(String File_CD,String File_name){
			rmdir.rmdir(File_CD, File_name);
		}
		public static void rmdir(String File_name){
			rmdir.rmdir(File_name);
		}
	}
}
