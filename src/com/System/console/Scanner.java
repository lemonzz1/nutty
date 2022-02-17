package com.System.console;

import com.System.print.cont;
import com.project.log.Project;

public class Scanner implements Console_Scanner {

	public static class input_title {

		public static String PassWord(String title) {
			String input_PassWord = null;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				cont.print(1, title);
				input_PassWord = input.next();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String:PassWord]输入:处于安全考虑，不能打印PassWord");
				return input_PassWord;
			} catch (Exception e) {
				cont.print_logs(4, Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String:PassWord]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String:PassWord]遇到致命错误");
				e.printStackTrace();
			}
			return input_PassWord;
		}

		public static String String(String title) {
			String input_text = null;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				cont.print(1, title);
				input_text = input.nextLine();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				cont.print_logs(4, Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;
		}

		public static int Int(String title) {
			int input_text = 0;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				cont.print(1, title);
				input_text = input.nextInt();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[int]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				cont.print_logs(4, Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[int]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[int]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;

		}


		public static boolean Boolean(String title) {
			boolean input_text = false;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				cont.print(1, title);
				input_text = input.nextBoolean();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[boolean]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				cont.print_logs(4, Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[boolean]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[boolean]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;
		}


		public static double Double(String title) {
			double input_text = 0;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				cont.print(1, title);
				input_text = input.nextDouble();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[double]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				cont.print_logs(4, Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[double]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[double]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;
		}


		public static byte Byte(String title) {
			byte input_text = 0;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				cont.print(1, title);
				input_text = input.nextByte();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[byte]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				cont.print_logs(4, Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[byte]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[byte]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;
		}


		public static float Float(String title) {
			float input_text = 0;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				cont.print(1, title);
				input_text = input.nextFloat();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[float]输入:" + title + input_text);
				return input_text;
			} catch (Exception e) {
				cont.print_logs(4, Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[float]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[float]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;
		}
	}

	public static class input {

		public static String PassWord() {
			String input_PassWord = null;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				input_PassWord = input.next();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String:PassWord]输入:处于安全考虑，不能打印PassWord");
				return input_PassWord;
			} catch (Exception e) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String:PassWord]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String:PassWord]遇到致命错误");
				e.printStackTrace();
			}
			return input_PassWord;
		}

		public static String String() {
			String input_text = null;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				input_text = input.nextLine();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[String]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;
		}

		public static int Int() {
			int input_text = 0;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				input_text = input.nextInt();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[int]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[int]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[int]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;

		}

		public static boolean Boolean() {
			boolean input_text = false;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				input_text = input.nextBoolean();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[boolean]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[boolean]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[boolean]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;
		}

		public static double Double() {
			double input_text = 0;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				input_text = input.nextDouble();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[double]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[double]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[double]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;
		}

		public static byte Byte() {
			byte input_text = 0;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				input_text = input.nextByte();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[byte]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[byte]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[byte]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;
		}

		public static float Float() {
			float input_text = 0;
			try {
				java.util.Scanner input = new java.util.Scanner(System.in);
				input_text = input.nextFloat();
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[float]输入:" + input_text);
				return input_text;
			} catch (Exception e) {
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[float]遇到致命错误");
				Project.logs(Thread.currentThread().getStackTrace()[1].getClassName() + "():" + "[float]遇到致命错误");
				e.printStackTrace();
			}
			return input_text;
		}

	}

}
