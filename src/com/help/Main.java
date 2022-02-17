package com.help;

import com.System.print.cont;

import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		try {
			Test.main();
		} catch (Exception e) {
			cont.print_logs("main.Main()遇到错误");
			e.printStackTrace();
		}
	}
}
