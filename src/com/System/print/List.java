package com.System.print;

import java.util.HashMap;

public class List {
	private final static HashMap<Integer, String> hashMap = new HashMap<>();

	static {
		hashMap.put(1, "JDBC加载错误");
		hashMap.put(2, "JDBC正常加载");
		hashMap.put(3, "链接失败");
		hashMap.put(4, "链接成功!");
		hashMap.put(5, "执行成功!");
		hashMap.put(6, "执行失败");
		hashMap.put(7, "行受影响");
		hashMap.put(8, "执行失败Connection不能为NULL");
		hashMap.put(9, "密码正确");
		hashMap.put(10, "密码错误");
		hashMap.put(11, "MySQL");
		hashMap.put(12, "Url");
		hashMap.put(13, "Password");
		hashMap.put(14, "Name");
		hashMap.put(15, "Driver");
		hashMap.put(16, "Main");
		hashMap.put(17, "Connection");
		hashMap.put(18, "ResultSet");
		hashMap.put(19, "ERROR集合错误,超出语句库中的最大值");
		hashMap.put(20, "不支持");
		hashMap.put(21, "这样的代码");
		hashMap.put(22, "yyyy-mm-dd hh:mm:ss");
		hashMap.put(23, "logs");
		hashMap.put(24, "文件验证失败");
	}

	public static String getHashMap(int KEY) {
		//project.logs("List.getHashMap()正在获取语句库[" + KEY + "]...");
		if (KEY > hashMap.size()) {
			//project.logs("List.getHashMap()语句库[" + KEY + "]获取失败:[" + hashMap.get(19) + "]");
			return hashMap.get(19);
		} else {
			//project.logs("List.getHashMap()语句库[" + KEY + "]获取成功:[" + hashMap.get(KEY) + "]");
			return hashMap.get(KEY);
		}
	}

	public static HashMap<Integer, String> getHashMap() {
		return hashMap;
	}
}
