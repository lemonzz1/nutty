package com.System.exec;

import javax.swing.*;

public class form {

	private static void form(){

	}

	public static class start{
		public static String chooseForm(String message,String title,String icon,String Default, Object[] objects){
			return (String) JOptionPane.showInputDialog(null, message, title, JOptionPane.PLAIN_MESSAGE, new ImageIcon(icon), objects, Default);

		}
	}
}
