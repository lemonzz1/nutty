package com.System.console;

import com.System.print.cont;
import com.project.log.Project;

public class Scanner implements Console_Scanner {

	public static class input_title {

		public static String PassWord(String title) {
			String input_PassWord = input__.PassWord(title);
			Project.logs("Scanner.input_title.PassWord()[String:PassWord]输入:处于安全考虑，不能打印PassWord");
			return input_PassWord;
		}

		public static String String(String title) {
			String input_text = input__.String(title);
			Project.logs("Scanner.input_title.String()[String]输入:" + title + input_text);
			return input_text;
		}

		public static int Int(String title) {
			int input_text = input__.Int(title);
			Project.logs("Scanner.input_title.Int()[int]输入:" + title + input_text);
			return input_text;
		}


		public static boolean Boolean(String title) {
			boolean input_text = input__.Boolean(title);
			Project.logs("Scanner.input_title.Boolean()[boolean]输入:" + title + input_text);
			return input_text;
		}


		public static double Double(String title) {
			double input_text = input__.Double(title);
			Project.logs("Scanner.input_title.Double()[double]输入:" + title + input_text);
			return input_text;
		}


		public static byte Byte(String title) {
			byte input_text = input__.Byte(title);
			Project.logs("Scanner.input_title.Byte()[byte]输入:" + title + input_text);
			return input_text;
		}


		public static float Float(String title) {
			float input_text = input__.Float(title);
			Project.logs("Scanner.input_title.Float()[float]输入:" + title + input_text);
			return input_text;
		}
	}

	public static class input {

		public static String PassWord() {
			String input_PassWord = input__.PassWord();
			Project.logs("Scanner.input.PassWord()[String:PassWord]输入:处于安全考虑，不能打印PassWord");
			return input_PassWord;
		}

		public static String String() {
			String input_text = input__.String();
			Project.logs("Scanner.input.String()[String]输入:" + input_text);
			return input_text;
		}

		public static int Int() {
			int input_text = input__.Int();
			Project.logs("Scanner.input.Int()[int]输入:" + input_text);
			return input_text;
		}

		public static boolean Boolean() {
			boolean input_text = input__.Boolean();
			Project.logs("Scanner.input.Boolean()[boolean]输入:" + input_text);
			return input_text;
		}

		public static double Double() {
			double input_text = input__.Double();
			Project.logs("Scanner.input.Double()[double]输入:" + input_text);
			return input_text;
		}

		public static byte Byte() {
			byte input_text = input__.Byte();
			Project.logs("Scanner.input.Byte()[byte]输入:" + input_text);
			return input_text;
		}

		public static float Float() {
			float input_text = input__.Float();
			Project.logs("Scanner.input.Float()[float]输入:" + input_text);
			return input_text;
		}


		public static String PassWord(String title) {
			String input_PassWord = input__.PassWord(title);
			Project.logs("Scanner.input.PassWord()[String:PassWord]输入:处于安全考虑，不能打印PassWord");
			return input_PassWord;
		}

		public static String String(String title) {
			String input_text = input__.String(title);
			Project.logs("Scanner.input.String()[String]输入:" + title + input_text);
			return input_text;
		}

		public static int Int(String title) {
			int input_text = input__.Int(title);
			Project.logs("Scanner.input.Int()[int]输入:" + title + input_text);
			return input_text;
		}


		public static boolean Boolean(String title) {
			boolean input_text = input__.Boolean(title);
			Project.logs("Scanner.input.Boolean()[boolean]输入:" + title + input_text);
			return input_text;
		}


		public static double Double(String title) {
			double input_text = input__.Double(title);
			Project.logs("Scanner.input.Double()[double]输入:" + title + input_text);
			return input_text;
		}


		public static byte Byte(String title) {
			byte input_text = input__.Byte(title);
			Project.logs("Scanner.input.Byte()[byte]输入:" + title + input_text);
			return input_text;
		}


		public static float Float(String title) {
			float input_text = input__.Float(title);
			Project.logs("Scanner.input.Float()[float]输入:" + title + input_text);
			return input_text;
		}
	}

	private static class input__ {
		public static String PassWord(String title) {
			try {
				cont.print(1, title);
				return input_class.next();
			} catch (Exception e) {
				cont.print(4, "input__.PassWorld(" + title + ")遇到致命错误");
				e.printStackTrace();
			}
			return null;
		}

		public static String String(String title) {
			try {
				cont.print(1, title);
				return input_class.next();
			} catch (Exception e) {
				cont.print(4, "input__.String(" + title + ")遇到致命错误");
				e.printStackTrace();
			}
			return null;
		}

		public static int Int(String title) {
			try {
				cont.print(1, title);
				return input_class.nextInt();
			} catch (Exception e) {
				cont.print(4, "input__.Int(" + title + ")遇到致命错误");
				e.printStackTrace();
			}
			return 0;
		}

		public static boolean Boolean(String title) {
			try {
				cont.print(1, title);
				return input_class.hasNext();
			} catch (Exception e) {
				cont.print(4, "input__.Boolean(" + title + ")遇到致命错误");
				e.printStackTrace();
			}
			return false;
		}

		public static double Double(String title) {
			try {
				cont.print(1, title);
				return input_class.nextDouble();
			} catch (Exception e) {
				cont.print(4, "input__.Double(" + title + ")遇到致命错误");
				e.printStackTrace();
			}
			return 0;
		}

		public static byte Byte(String title) {
			try {
				cont.print(1, title);
				return input_class.nextByte();
			} catch (Exception e) {
				cont.print(4, "input__.Byte(" + title + ")遇到致命错误");
				e.printStackTrace();
			}
			return 0;

		}

		public static float Float(String title) {
			try {
				cont.print(1, title);
				return input_class.nextFloat();
			} catch (Exception e) {
				cont.print(4, "input__.Float(" + title + ")遇到致命错误");
				e.printStackTrace();
			}
			return 0;
		}

		public static String PassWord() {
			try {
				return input_class.next();
			} catch (Exception e) {
				cont.print(4, "input__.PassWorld()遇到致命错误");
				e.printStackTrace();
			}
			return null;
		}

		public static String String() {
			try {
				return input_class.next();
			} catch (Exception e) {
				cont.print(4, "input__.String()遇到致命错误");
				e.printStackTrace();
			}
			return null;
		}

		public static int Int() {
			try {
				return input_class.nextInt();
			} catch (Exception e) {
				cont.print(4, "input__.Int()遇到致命错误");
				e.printStackTrace();
			}
			return 0;
		}

		public static boolean Boolean() {
			try {
				return input_class.hasNext();
			} catch (Exception e) {
				cont.print(4, "input__.Boolean()遇到致命错误");
				e.printStackTrace();
			}
			return false;
		}

		public static double Double() {
			try {
				return input_class.nextDouble();
			} catch (Exception e) {
				cont.print(4, "input__.Double()遇到致命错误");
				e.printStackTrace();
			}
			return 0;
		}

		public static byte Byte() {
			try {
				return input_class.nextByte();
			} catch (Exception e) {
				cont.print(4, "input__.Byte()遇到致命错误");
				e.printStackTrace();
			}
			return 0;
		}

		public static float Float() {
			try {
				return input_class.nextFloat();
			} catch (Exception e) {
				cont.print(4, "input__.Float()遇到致命错误");
				e.printStackTrace();
			}
			return 0;
		}
	}

}
