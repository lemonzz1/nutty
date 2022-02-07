package com.variable.list;

public class TAC {
	public static String integration(Object... objects) {
		String Text = "";
		for (Object object : objects) {
			Text = Text + object;
		}
		return Text;
	}

	public static String integration(int[] objects) {
		String Text = "";
		int o = 0;
		for (int i : objects) {
			o++;
			Text = Text + o + "=" + i;
			if (objects.length != o) {
				Text = Text + ", ";
			}
		}
		return Text;
	}

	public static String integration(String[] object) {
		String Text = "{";
		int o = 0;
		for (String i : object) {
			o++;
			Text = Text + o + "=" + i;
			if (object.length != o) {
				Text = Text + ", ";
			}
		}
		return Text + "}";
	}
}
