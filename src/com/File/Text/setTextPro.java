package com.File.Text;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class setTextPro {
	public setTextPro(File file, BufferedWriter bufferedWriter, String Text, boolean bit) {
		try {
			FileWriter fileWriter = new FileWriter(file, bit);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(Text);
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException Error) {
			Error.printStackTrace();
		}
	}

	public setTextPro(File file, BufferedWriter bufferedWriter, String Text) {
		try {
			FileWriter fileWriter = new FileWriter(file, true);
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(Text);
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException Error) {
			Error.printStackTrace();
		}
	}

	public setTextPro(FileWriter fileWriter, BufferedWriter bufferedWriter, String Text) {
		try {
			bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(Text);
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException Error) {
			Error.printStackTrace();
		}
	}

	public setTextPro(File file, String Text, boolean bit) {
		try {
			FileWriter fileWriter = new FileWriter(file, bit);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(Text);
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException Error) {
			Error.printStackTrace();
		}
	}

	public setTextPro(String File_CD, String Text, boolean bit) {
		try {
			FileWriter fileWriter = new FileWriter(File_CD, bit);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(Text);
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException Error) {
			Error.printStackTrace();
		}
	}

	public setTextPro(FileWriter fileWriter, String Text) {
		try {
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write(Text);
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException Error) {
			Error.printStackTrace();
		}
	}

	public setTextPro(BufferedWriter bufferedWriter, String Text, boolean bit) {
		try {
			bufferedWriter.write(Text);
			bufferedWriter.close();
		} catch (IOException Error) {
			Error.printStackTrace();
		}
	}
}
