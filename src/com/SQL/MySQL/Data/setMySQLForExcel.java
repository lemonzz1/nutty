package com.SQL.MySQL.Data;

import java.lang.reflect.Method;

public class setMySQLForExcel {

	private static Object getFieldValueByName(String fieldName, Object o) {
		try {
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			String getter = "get" + firstLetter + fieldName.substring(1);    //获取方法名
			Method method = o.getClass().getMethod(getter);  //获取方法对象
			Object value = method.invoke(o);    //用invoke调用此对象的get字段方法
			return value;  //返回值
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


}
