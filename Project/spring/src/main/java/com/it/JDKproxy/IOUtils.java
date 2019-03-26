package com.it.JDKproxy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;

public class IOUtils {
	
	private static final String PATH = "C:\\Users\\Administrator\\Desktop\\A\\com\\it\\proxy\\$Proxy.java";
	
	public static boolean out (String str) {
		
		File file = new File(PATH);
		if(file.exists()) {
			file.delete();
		}
		OutputStream out = null;
		try {
			out = new FileOutputStream(file,true);
			 byte[] data = str.getBytes();
			 out.write(data);
			 out.flush();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}finally{
			try {
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 将.java 文件编印成 .class文件
	 * @param file
	 * @return
	 */
	public static boolean toClassFile() {
		JavaCompiler cpmpiler = ToolProvider.getSystemJavaCompiler();
		StandardJavaFileManager standardJavaFileManager = cpmpiler.getStandardFileManager(null, null, null);
		File f = new File(PATH);
		Iterable u = standardJavaFileManager.getJavaFileObjects(f);
		
		CompilationTask task = cpmpiler.getTask(null, standardJavaFileManager, null, null, null, u);
		task.call();	
		try {
			standardJavaFileManager.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
}
