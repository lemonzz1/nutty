package com.File.File_CD.Data;

import com.project.log.Project;

import java.io.File;

public class FileCD {
	static String get_CD() {
		Project.logs("get_FileCD.get_CD():获取项目绝对路径:[" + System.getProperty("user.dir") + "]");
		return System.getProperty("user.dir");
	}

	static File get_CD_File() {
		String FileCD = System.getProperty("user.dir");
		Project.logs("get_FileCD.get_CD_File():获取项目绝对路径:[" + System.getProperty("user.dir") + "]");
		return new File(FileCD);
	}
}
