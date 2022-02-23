package com.System.console;

import com.System.print.cont;
import com.project.log.Project;

import java.util.Objects;

public class Scanner {
	protected static java.util.Scanner input_Scanner_Class() {
		try {
			Project.logs_Pro_file("调用Scanner类");
			return new java.util.Scanner(System.in);
		} catch (Exception e) {
			Project.logs_Pro("Scanner未调用成功" + e);
			Project.logs_Pro("遇到致命错误:" + e);
			e.printStackTrace();
		}
		return null;
	}

	public static class input_title {

		public static String PassWord(String title) {
			String input_PassWord = null;
			try {
				cont.print(1, title);
				input_PassWord = Objects.requireNonNull(Scanner.input_Scanner_Class()).next();
				Project.logs_Pro_file("[String:PassWord]输入:处于安全考虑，不能打印PassWord");
				return input_PassWord;
			} catch (Exception e) {
				Project.logs_Pro("[String:PassWord]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_PassWord;
		}

		public static String String(String title) {
			String input_text = null;
			try {
				cont.print(1, title);
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextLine();
				Project.logs_Pro_file("[String]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[String]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_text;
		}

		public static int Int(String title) {
			int input_text = 0;
			try {
				cont.print(1, title);
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextInt();
				Project.logs_Pro_file("[int]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[int]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_text;

		}


		public static boolean Boolean(String title) {
			boolean input_text = false;
			try {
				cont.print(1, title);
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextBoolean();
				Project.logs_Pro_file("[boolean]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[boolean]遇到致命错误" + e);
				e.printStackTrace();
			}
			return input_text;
		}


		public static double Double(String title) {
			double input_text = 0;
			try {
				cont.print(1, title);
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextDouble();
				Project.logs_Pro_file("[double]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[double]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_text;
		}


		public static byte Byte(String title) {
			byte input_text = 0;
			try {
				cont.print(1, title);
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextByte();
				Project.logs_Pro_file("[byte]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[byte]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_text;
		}


		public static float Float(String title) {
			float input_text = 0;
			try {
				cont.print(1, title);
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextFloat();
				Project.logs_Pro_file("[float]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[float]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_text;
		}
	}

	public static class input {

		public static String PassWord() {
			String input_PassWord = null;
			try {
				input_PassWord = Objects.requireNonNull(Scanner.input_Scanner_Class()).next();
				Project.logs_Pro_file("[String:PassWord]输入:处于安全考虑，不能打印PassWord");
				return input_PassWord;
			} catch (Exception e) {
				Project.logs_Pro("[String:PassWord]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_PassWord;
		}

		public static String String() {
			String input_text = null;
			try {
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextLine();
				Project.logs_Pro_file("[String]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[String]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_text;
		}

		public static int Int() {
			int input_text = 0;
			try {
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextInt();
				Project.logs_Pro_file("[int]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[int]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_text;

		}

		public static boolean Boolean() {
			boolean input_text = false;
			try {
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextBoolean();
				Project.logs_Pro_file("[boolean]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[boolean]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_text;
		}

		public static double Double() {
			double input_text = 0;
			try {
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextDouble();
				Project.logs_Pro_file("[double]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[double]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_text;
		}

		public static byte Byte() {
			byte input_text = 0;
			try {
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextByte();
				Project.logs_Pro_file("[byte]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[byte]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_text;
		}

		public static float Float() {
			float input_text = 0;
			try {
				input_text = Objects.requireNonNull(Scanner.input_Scanner_Class()).nextFloat();
				Project.logs_Pro_file("[float]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs_Pro("[float]遇到致命错误:" + e);
				e.printStackTrace();
			}
			return input_text;
		}

	}

}
