package com.help;

import com.SQL.MySQL.Data.MySQL;
import com.System.Detection.Detection;
import com.System.print.console;
import com.System.print.cont;

import java.sql.Connection;
import java.sql.ResultSet;
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
