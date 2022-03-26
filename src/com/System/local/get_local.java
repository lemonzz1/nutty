package com.System.local;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

public class get_local {
	protected static final Properties props = System.getProperties();

	public static class Java{

		public static String getLocalHostJavaVersion(){
			return props.getProperty("java.version");
		}

		public static String getJavaRuntimeEnvironmentProvider(){
			return props.getProperty("java.vendor");
		}

		public static String getTheURLOfTheJavaVendor(){
			return props.getProperty("java.vendor.url");
		}

		public static String getJavaInstallPath(){
			return props.getProperty("java.home");
		}

		public static String getDefaultTemporaryFilePath(){
			return props.getProperty("java.io.tmpdir");
		}

	}

	public static class LocalHost{

		public static class user{
			public static String getUserName(){
				return props.getProperty("user.name");
			}
			public static String getUserPath(){
				return props.getProperty("user.home");
			}
			public static String getUserOfficePath(){
				return props.getProperty("user.dir");
			}
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
		}

		public static class SystemHost{
			public static String getSystemName(){
				return props.getProperty("os.name");
			}

			public static String getSystemFramework(){
				return props.getProperty("os.arch");
			}

			public static String getSystemVersion(){
				return props.getProperty("os.version");
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

		public static String getLocalIP(){
			try {
				InetAddress inetAddress = InetAddress.getLocalHost();
				return inetAddress.getHostAddress();
			} catch (UnknownHostException e) {
				e.printStackTrace();
				return "IP获取失败";
			}
		}
	}

}
