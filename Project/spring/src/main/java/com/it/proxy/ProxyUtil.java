package com.it.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.net.URLClassLoader;

public class ProxyUtil {

	/**
	 * 自定义动态代理对象 1/第一步 :通过反射 拼写代理类 2/第二步:将代理类通过IO持久化 3/编译上成class
	 * 
	 * @param clz
	 * @return 返回代理对象
	 */
	public static Object newInstance(Object obj) {
		Object objctProxy = null;
		Class clz = obj.getClass();
		String line = "\n";
		String blank = "\t";
		String package1 = clz.getPackage().getName();
		System.out.println(package1);
		// 获取类名
		String className = clz.getSimpleName();
		String variableName = "variableName";
		// 权限定类名
		String classForName = clz.getName();
		// 定义包名
		String packageName = "package " + package1 + ";" + line;
		// 获取目标对像实现的接口
		Class[] Interfaces = clz.getInterfaces();
		String interfaceName = "";
		for (Class i : Interfaces) {
			interfaceName = i.getSimpleName();
		}
		
		// 定义类名
		String publicName = "public class $Proxy implements " + interfaceName + "{" + line;
		// 定义变量
		String variable = blank + "public " + className + blank + variableName + ";" + line;
		// 定义构造方法
		String constructionStr = blank + "public " + "$Proxy " + "(" + className + " variableName" + ")" + "{" + line
				+ blank + blank + "this.variableName = variableName;" + line + blank + "}" + line;

		// 定义方法
		String methodStr = "";
		String methodsStr = "";
		// 定义 通知
		String tongZhi = "";
		// 拼接方法
		Method[] Methods = clz.getDeclaredMethods();
		boolean temp1 = false;
		
		for (Method m : Methods) {
			if (temp1) {
				methodStr = blank + "public ";
			}
			String returnType = m.getReturnType().getSimpleName();
			String mName = m.getName();
			int flag = 0;
			Class[] p = m.getParameterTypes();
			String pStr = "";
			String pStrV = "";
			boolean temp = false;
			for (Class c : p) {
				if (temp) {
					pStr = pStr + ", ";
					pStrV = pStrV + ", ";
				}

				pStr = pStr + c.getSimpleName() + " " + "arg" + flag;
				pStrV = pStrV + "arg" + flag;
				flag = +1;
				temp = true;
			}
			System.out.println("-----" + pStr);
			
			// 定义通知
			if (pStr.length() == 0) {
				tongZhi = "System.out.println(\"-----\");";
			} else {
				String[] pStrVs = pStrV.split(",");
				String vs = "";
				for (String s : pStrVs) {
					vs = vs + " + " + s;
				}
				tongZhi = "System.out.println(\"1-----\" " + vs + ");";

			}

			// 定义 返回值
			String returnStr = "";
			if (!returnType.equals("void")) {
				returnStr = "return " + "variableName." + mName + "(" + pStrV + ");";
			} else {
				returnStr = "variableName." + mName + "(" + pStrV + ");";
			}

			methodStr = blank + "public " + returnType + " " + mName + "(" + pStr + ") " + "{" + line + blank + blank
					+ line + blank + blank + tongZhi + line + blank + blank + returnStr + line + blank + "}" + line;
			temp1 = true;
			methodsStr = methodsStr + methodStr;
		}
		
		String classStr = packageName + publicName + variable + constructionStr + methodsStr + line + "}";
		Boolean b = IOUtils.out(classStr);
		Boolean c = IOUtils.toClassFile();

		if (b && c) {
			System.out.println("0--" + classStr);
		}
		
		// 实例化 代理类
		try {
			URL[] urls = new URL[] { new URL("file:C:\\Users\\Administrator\\Desktop\\A\\\\") };
			URLClassLoader URLClassLoader = new URLClassLoader(urls);
			Class classProxy = URLClassLoader.loadClass("com.it.proxy.$Proxy");
			Constructor constructor = classProxy.getConstructor(obj.getClass());
			objctProxy = constructor.newInstance(obj);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return objctProxy;
	}

	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("java.home"));
		TargetClass t = new TargetClass();
		Interface obj = (Interface) newInstance(t);
		obj.A("666", "77");
		System.out.println("==========");
		String a = obj.B("11");
		System.out.println(a);
		//使用 jdk动态代理
		
	}

}
