package com.System.exec.Console_processing;

import com.System.print.List;
import com.project.log.Project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static com.System.print.console.Class_Print;

public class terminal {
	public static void set_string_terminal(String command_code) {
		set_command(command_code);
	}

	public static void set_terminal(String command_code) {
		set_command(command_code);
	}

	public static void set_terminal_print(Object object) {
		set_command("echo " + object);
	}

	public static void set_string_terminal_print(Object object) {
		set_command("echo " + object);
	}

	private static void set_command(String commandStr) {
		BufferedReader br = null;
		try {
			Process process = null;
			try {
				process = Runtime.getRuntime().exec(commandStr);
				Project.logs("terminal.set_command():运行终端代码[" + commandStr + "]");
			} catch (IOException Error) {
				//System.out.println(List.getHashMap(20) + "[" + commandStr + "]" + List.getHashMap(21));
				Class_Print(2, List.getHashMap(20) + "[" + commandStr + "]" + List.getHashMap(21));
			}
			if (process != null) {
				br = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
				String line;
				StringBuilder STringBuilder = new StringBuilder();
				while ((line = br.readLine()) != null) {
					STringBuilder.append(line).append("\n");
				}
				System.out.println(STringBuilder);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
