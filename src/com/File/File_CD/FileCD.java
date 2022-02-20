package com.File.File_CD;

import java.io.File;

public interface FileCD {
	static String getCD() {
		return System.getProperty("user.dir");
	}

	static File getCDFile() {
		String File_CD = System.getProperty("user.dir");
		return new File(File_CD);
	}
}
