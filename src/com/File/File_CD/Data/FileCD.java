package com.File.File_CD.Data;

import com.project.log.Project;

import java.io.File;

public class FileCD {
	public static String get_CD() {
		Project.logs(Thread.currentThread().getStackTrace()[1].getClassName()+"():"+":获取项目绝对路径:[" + System.getProperty("user.dir") + "]");
		return System.getProperty("user.dir");
	}

	public static File get_CD_File() {
		String FileCD = System.getProperty("user.dir");
		Project.logs(Thread.currentThread().getStackTrace()[1].getClassName()+"():"+"获取项目绝对路径:[" + System.getProperty("user.dir") + "]");
		return new File(FileCD);
	}
}
