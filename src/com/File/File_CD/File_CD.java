package com.File.File_CD;

import java.io.File;

public interface File_CD {
	static String get_CD() {
		return System.getProperty("user.dir");
	}

	static File get_CD_File() {
		String File_CD = System.getProperty("user.dir");
		return new File(File_CD);
	}
}
