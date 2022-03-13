package com.File.Text;

import com.project.log.Project;
import com.set.log;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TextPro {
	private static String Text;
	private static FileReader fileReader;
	private static BufferedReader bufferedReader;
	private static File file;
	private static String File_CD;

	public TextPro() {
	}

	public TextPro(File file, FileReader fileReader, BufferedReader bufferedReader, String File_CD) {
		TextPro.file = file;
		TextPro.fileReader = fileReader;
		TextPro.bufferedReader = bufferedReader;
		TextPro.File_CD = File_CD;
	}

	public TextPro(FileReader fileReader, BufferedReader bufferedReader) throws IOException {
		bufferedReader = new BufferedReader(fileReader);
		while ((Text = bufferedReader.readLine()) != null) {
			System.out.println(Text);
			Project.logs_Pro(2, log.Name, Text);
		}
		bufferedReader.close();
		fileReader.close();
	}

	public TextPro(FileReader fileReader) throws IOException {
		bufferedReader = new BufferedReader(fileReader);
		while ((Text = bufferedReader.readLine()) != null) {
			//System.out.println(Text);
			Project.logs_Pro(2, log.Name, Text);
		}
		bufferedReader.close();
		fileReader.close();
	}

	public TextPro(BufferedReader bufferedReader) throws IOException {
		while ((Text = bufferedReader.readLine()) != null) {
			//System.out.println(Text);
			Project.logs_Pro(2, log.Name, Text);
		}
		bufferedReader.close();
	}

	public TextPro(String File_CD) throws IOException {
		//导入File类检测文件是否存在
		file = new File(File_CD);
		//判断file类中的文件是否存在
		if (file.exists()) {
			//如果存在
			//导入FileReader类引用读取文本功能
			fileReader = new FileReader(file);
			//导入BufferedReader类并以fileReader作为参数引用加强读取文本文档的功能
			bufferedReader = new BufferedReader(fileReader);
			//循环输出Text内的文本内容
			while ((Text = bufferedReader.readLine()) != null) {
				//输出Text内容
				//System.out.println(Text);
				Project.logs_Pro(2, log.Name, Text);
			}
			//关闭bufferedReade
			bufferedReader.close();
			//关闭fileReader
			fileReader.close();
		} else {
			//如果不在
			//打印方法所在位置并输出参数内的路径
			//System.err.println("["+this.getClass().getName()+":"+Thread.currentThread().getStackTrace()[1].getClassName()+"@"+Thread.currentThread().getStackTrace()[1].getMethodName()+"]:未能找到["+ file +"]文件");
			Project.logs_Pro(2, log.Name, "[" + this.getClass().getName() + ":" + Thread.currentThread().getStackTrace()[1].getClassName() + "@" + Thread.currentThread().getStackTrace()[1].getMethodName() + "]:未能找到[" + file + "]文件");
		}

	}

	public TextPro(File file) {
		try {
			//判断file类中的文件是否存在
			if (file.exists()) {
				//如果存在
				//导入FileReader类引用读取文本功能
				fileReader = new FileReader(file);
				//导入BufferedReader类并以fileReader作为参数引用加强读取文本文档的功能
				bufferedReader = new BufferedReader(fileReader);
				//循环输出Text内的文本内容
				while ((Text = bufferedReader.readLine()) != null) {
					//输出Text内容
					//System.out.println(Text);
					Project.logs_Pro(2, log.Name, Text);
				}
				//关闭bufferedReade
				bufferedReader.close();
				//关闭fileReader
				fileReader.close();
			} else {
				//如果不在
				//打印方法所在位置并输出参数内的路径
				//System.err.println("["+this.getClass().getName()+":"+Thread.currentThread().getStackTrace()[1].getClassName()+"@"+Thread.currentThread().getStackTrace()[1].getMethodName()+"]:未能找到["+file+"]文件");
				Project.logs_Pro(2, log.Name, "[" + this.getClass().getName() + ":" + Thread.currentThread().getStackTrace()[1].getClassName() + "@" + Thread.currentThread().getStackTrace()[1].getMethodName() + "]:未能找到[" + file + "]文件");
			}
			//捕获BUG原因
		} catch (Exception Error) {
			//打印BUG原因
			Error.printStackTrace();
		}
	}

	private static String get_System_Time(String Time_Text) {
		SimpleDateFormat formatter = new SimpleDateFormat(Time_Text);
		Date date = new Date(System.currentTimeMillis());
		return formatter.format(date);

	}

	private static BufferedReader get_Text_BR(File file) throws FileNotFoundException {
		FileReader fileReader = new FileReader(file);
		return new BufferedReader(fileReader);
	}

	private static BufferedReader get_Text_BR(FileReader fileReader) throws FileNotFoundException {
		return new BufferedReader(fileReader);
	}

	private static BufferedReader get_Text_BR(String File_CD) throws FileNotFoundException {
		File file = new File(File_CD);
		FileReader fileReader = new FileReader(file);
		return new BufferedReader(fileReader);
	}

	public static void get_TextPro_Class() throws IOException {
		file = new File(File_CD);
		fileReader = new FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		while ((Text = bufferedReader.readLine()) != null) {
			//System.out.println(Text);
			Project.logs_Pro(2, log.Name, Text);
		}
	}

	public static void get_TextPro_Class(FileReader fileReader, BufferedReader bufferedReader) throws IOException {
		bufferedReader = new BufferedReader(fileReader);
		while ((Text = bufferedReader.readLine()) != null) {
			//System.out.println(Text);
			Project.logs_Pro(2, log.Name, Text);
		}
		bufferedReader.close();
		fileReader.close();
	}

	public static void get_TextPro_Class(FileReader fileReader) throws IOException {
		bufferedReader = new BufferedReader(fileReader);
		while ((Text = bufferedReader.readLine()) != null) {
			//System.out.println(Text);
			Project.logs_Pro(2, log.Name, Text);
		}
		bufferedReader.close();
		fileReader.close();
	}

	public static void get_TextPro_Class(BufferedReader bufferedReader) throws IOException {
		while ((Text = bufferedReader.readLine()) != null) {
			//System.out.println(Text);
			Project.logs_Pro(2, log.Name, Text);
		}
		bufferedReader.close();
	}

	public static void get_TextPro_Class(String File_CD) throws IOException {
		//导入File类检测文件是否存在
		file = new File(File_CD);
		//判断file类中的文件是否存在
		if (file.exists()) {
			//如果存在
			//导入FileReader类引用读取文本功能
			fileReader = new FileReader(file);
			//导入BufferedReader类并以fileReader作为参数引用加强读取文本文档的功能
			bufferedReader = new BufferedReader(fileReader);
			//循环输出Text内的文本内容
			while ((Text = bufferedReader.readLine()) != null) {
				//输出Text内容
				//System.out.println(Text);
				Project.logs_Pro(2, log.Name, Text);
			}
			//关闭bufferedReade
			bufferedReader.close();
			//关闭fileReader
			fileReader.close();
		} else {
			//如果不在
			//打印方法所在位置并输出参数内的路径
			//System.err.println("["+ get_TextPro.class.getName()+":"+Thread.currentThread().getStackTrace()[1].getClassName()+"@"+Thread.currentThread().getStackTrace()[1].getMethodName()+"]:未能找到["+ file +"]文件");
			Project.logs_Pro(2, log.Name, "[" + TextPro.class.getName() + ":" + Thread.currentThread().getStackTrace()[1].getClassName() + "@" + Thread.currentThread().getStackTrace()[1].getMethodName() + "]:未能找到[" + file + "]文件");
		}
	}

	public static void get_TextPro_Class(File file) {
		try {
			//判断file类中的文件是否存在
			if (file.exists()) {
				//如果存在
				//导入FileReader类引用读取文本功能
				fileReader = new FileReader(file);
				//导入BufferedReader类并以fileReader作为参数引用加强读取文本文档的功能
				bufferedReader = new BufferedReader(fileReader);
				//循环输出Text内的文本内容
				while ((Text = bufferedReader.readLine()) != null) {
					//输出Text内容
					//System.out.println(Text);
					Project.logs_Pro(2, log.Name, Text);
				}
				//关闭bufferedReade
				bufferedReader.close();
				//关闭fileReader
				fileReader.close();
			} else {
				//如果不在
				//打印方法所在位置并输出参数内的路径
				//System.err.println("[" + get_TextPro.class.getName() + ":" + Thread.currentThread().getStackTrace()[1].getClassName()+"@"+Thread.currentThread().getStackTrace()[1].getMethodName() + "]:未能找到[" + file + "]文件");
				Project.logs_Pro(2, log.Name, "[" + TextPro.class.getName() + ":" + Thread.currentThread().getStackTrace()[1].getClassName() + "@" + Thread.currentThread().getStackTrace()[1].getMethodName() + "]:未能找到[" + file + "]文件");
			}
			//捕获BUG原因
		} catch (Exception Error) {
			//打印BUG原因
			Error.printStackTrace();
		}
	}
}
