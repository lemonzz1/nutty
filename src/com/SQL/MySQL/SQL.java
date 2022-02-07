package com.SQL.MySQL;

import java.sql.Connection;
import java.util.HashMap;

public class SQL {
	//JDBC驱动器
	protected static String driver = "com.mysql.cj.jdbc.Driver";
	//MySQL_url
	protected static String url = null;
	//MySQL_用户名
	protected static String name = null;
	//MySQL_密码
	protected static String password = null;
	protected static HashMap<Integer, String> hashMap = new HashMap<>();


	//private static int math_max = 0;
	//private static int math_min = 0;
	protected Connection connection = null;

	/*private static void setMath(String password_date){
		if (getMath_max() ==0 && getMath_min() ==0){
			while (true){
				int max = (int) (Math.random()*(100)+1);
				int min = (int) (Math.random()*(100)+1);
				if(max > min){
					String pass_date_1 = if_pass_en(password_date,max, min);
					String pass_date_2 = if_pass_ne(pass_date_1,max, min);
					if (password_date.equals(pass_date_2)){
						setMath_max(max);
						setMath_min(min);
						break;
					}
				}
			}
		}
	}

	private static String if_pass_en(String password_date, int max, int min){
		byte[] pass = password_date.getBytes();
		for(int i=0;i<pass.length;i++) {
			pass[i] -= max;
		}
		for (int i=0;i<pass.length;i++){
			pass[i] += min;
		}
		return new String(pass);
	}

	private static String if_pass_ne(String password_date, int max, int min){
		byte[] pass = password_date.getBytes();
		for(int i=0;i<pass.length;i++) {
			pass[i] += max;
		}
		for (int i=0;i<pass.length;i++){
			pass[i] -= min;
		}
		return new String(pass);
	}

	//password 加密
	protected static void encode(String password_date) {
		setMath(password_date);
		byte[] pass = password_date.getBytes();
		for(int i=0;i<pass.length;i++) {
			pass[i] -= getMath_max();
		}
		for (int i=0;i<pass.length;i++){
			pass[i] += getMath_min();
		}
		System.out.println(new String(pass));
		setPassword(new String(pass));
	}

	protected static String decode(String password_data) {
		byte[] pass = password_data.getBytes();
		for(int i=0;i<pass.length;i++) {
			pass[i] += getMath_max();
		}
		for(int i=0;i<pass.length;i++) {
			pass[i] -= getMath_min();
		}
		System.out.println(new String(pass));
		return new String(pass);
	}*/

	private static void setMath_max(int math_max) {
		math_max = math_max;
	}

	public static void set_Url_Name_Password(String url_i, String name_i, String password_i) {
		url = url_i;
		name = name_i;
		setPassword(password_i);
	}

	public static String getDriver() {
		return driver;
	}

	public static void setDriver(String Driver) {
		driver = Driver;
	}

	public static String getUrl() {
		return url;
	}

	public static void setUrl(String url_i) {
		url = url_i;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name_i) {
		name = name_i;
	}

	protected static String getPassword() {
		return password;
	}

	protected static void setPassword(String password_i) {
		password = password_i;
	}

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
