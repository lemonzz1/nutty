package com.System.console;

import com.System.print.cont;
import com.project.log.Project;

public class Scanner implements Console_Scanner {

	public static class input_title {

		public static String PassWord(String title) {
			cont.print(1, title);
			String input_PassWord = input_class.next();
			Project.logs("Scanner.input_title.PassWord()[String:PassWord]输入:处于安全考虑，不能打印PassWord");
			return input_PassWord;
		}

		public static String String(String title) {
			cont.print(1, title);
			String input_text = input_class.next();
			Project.logs("Scanner.input_title.String()[String]输入:" + input_text);
			return input_text;
		}

		public static int Int(String title) {
			cont.print(1, title);
			int input_text = input_class.nextInt();
			Project.logs("Scanner.input_title.Int()[int]输入:" + input_text);
			return input_text;
		}


		public static boolean Boolean(String title) {
			cont.print(1, title);
			boolean input_text = input_class.hasNext();
			Project.logs("Scanner.input_title.Boolean()[boolean]输入:" + input_text);
			return input_text;
		}


		public static double Double(String title) {
			cont.print(1, title);
			double input_text = input_class.nextDouble();
			Project.logs("Scanner.input_title.Double()[double]输入:" + input_text);
			return input_text;
		}


		public static byte Byte(String title) {
			cont.print(1, title);
			byte input_text = input_class.nextByte();
			Project.logs("Scanner.input_title.Byte()[byte]输入:" + input_text);
			return input_text;
		}


		public static float Float(String title) {
			cont.print(1, title);
			float input_text = input_class.nextFloat();
			Project.logs("Scanner.input_title.Float()[float]输入:" + input_text);
			return input_text;
		}
	}

	public static class input {

		public static String PassWord() {
			String input_PassWord = input_class.next();
			Project.logs("Scanner.input.PassWord()[String:PassWord]输入:处于安全考虑，不能打印PassWord");
			return input_PassWord;
		}

		public static String String() {
			String input_text = input_class.next();
			Project.logs("Scanner.input.String()[String]输入:" + input_text);
			return input_text;
		}

		public static int Int() {
			int input_text = input_class.nextInt();
			Project.logs("Scanner.input.Int()[int]输入:" + input_text);
			return input_text;
		}

		public static boolean Boolean() {
			boolean input_text = input_class.hasNext();
			Project.logs("Scanner.input.Boolean()[boolean]输入:" + input_text);
			return input_text;
		}

		public static double Double() {
			double input_text = input_class.nextDouble();
			Project.logs("Scanner.input.Double()[double]输入:" + input_text);
			return input_text;
		}

		public static byte Byte() {
			byte input_text = input_class.nextByte();
			Project.logs("Scanner.input.Byte()[byte]输入:" + input_text);
			return input_text;
		}

		public static float Float() {
			float input_text = input_class.nextFloat();
			Project.logs("Scanner.input.Float()[float]输入:" + input_text);
			return input_text;
		}
	}

}
