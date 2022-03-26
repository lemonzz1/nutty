package com.File.File_CD.Data;

import com.File.File_CD.ProjectPathImp;

import java.io.File;

public class ProjectPath implements ProjectPathImp {
	public static String getCD() {
		//Project.logs_Pro_file(log.Name, "获取项目绝对路径:[" + System.getProperty("user.dir") + "]");
		return System.getProperty("user.dir");
	}

	public static File getCDFile() {
		String FileCD = System.getProperty("user.dir");
		//Project.logs_Pro_file(log.Name, "获取项目绝对路径:[" + System.getProperty("user.dir") + "]");
		return new File(FileCD);
	}
}
