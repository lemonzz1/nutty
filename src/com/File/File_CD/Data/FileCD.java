package com.File.File_CD.Data;

import com.project.log.Project;
import com.set.log;

import java.io.File;

public class FileCD {
	public static String getCD() {
		Project.logs_Pro_file(log.Name, "获取项目绝对路径:[" + System.getProperty("user.dir") + "]");
		return System.getProperty("user.dir");
	}

	public static File getCDFile() {
		String FileCD = System.getProperty("user.dir");
		Project.logs_Pro_file(log.Name, "获取项目绝对路径:[" + System.getProperty("user.dir") + "]");
		return new File(FileCD);
	}
}
