package com.System.local;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class get_local {
	public static String get_local_user_name() {
		//project.logs("get_local.get_local_user_name():获取用户名:" + System.getProperty("user.name"));
		return System.getProperty("user.name");
	}

	public static String get_user_name() {
		//project.logs("get_local.get_user_name():获取用户名:" + System.getProperty("user.name"));
		return System.getProperty("user.name");
	}

	public static String get_user() {
		//project.logs("get_local.get_user():获取用户名:" + System.getProperty("user.name"));
		return System.getProperty("user.name");
	}

	public static String get_local_computer_name() {
		try {
			//project.logs("get_local.get_local_computer_name():计算机名:" + InetAddress.getLocalHost().getHostName().toString());
			return InetAddress.getLocalHost().getHostName().toString();
		} catch (UnknownHostException e) {
			return e.toString();
		}
	}

	public static String get_computer_name() {
		try {
			//project.logs("get_local.get_computer_name():计算机名:" + InetAddress.getLocalHost().getHostName().toString());
			return InetAddress.getLocalHost().getHostName().toString();
		} catch (UnknownHostException e) {
			return e.toString();
		}
	}

	public static String get_computer() {
		try {
			//project.logs("get_local.get_computer():计算机名:" + InetAddress.getLocalHost().getHostName().toString());
			return InetAddress.getLocalHost().getHostName().toString();
		} catch (UnknownHostException e) {
			return e.toString();
		}
	}
}
