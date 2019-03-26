package com.it.JDKproxy.JDK.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.net.URLClassLoader;

import com.it.JDKproxy.JDK.ProxyHandler;
import com.it.proxy.Interface;
import com.it.proxy.TargetClass;

public class ProxyUtil {

	/**
	 * 自定义动态代理对象 1/第一步 :通过反射 拼写代理类 2/第二步:将代理类通过IO持久化 3/编译上成class
	 * 
	 * @param clz
	 * @return 返回代理对象
	 */
	public static Object newInstance(Object obj, Object tarGet) {

		Object objctProxy = null;
		Class clz = obj.getClass();
		Class clzTar = tarGet.getClass();
		String line = "\n";
		String blank = "\t";
		String package1 = clz.getPackage().getName();

		// 获取类名
		String className = clz.getSimpleName();
		String h = "h";
		// 权限定类名
		String classForName = clz.getName();
		// 定义包名
		String packageName = "package " + "com.it.proxy" + ";" + line + "import java.lang.reflect.Method;" + line
				+ "import " + clz.getName() + "; " + line;

		// 获取目标对像实现的接口
		Class[] Interfaces = tarGet.getClass().getInterfaces();
		String interfaceName = "";
		for (Class i : Interfaces) {
			interfaceName = i.getSimpleName();
		}

		// 定义类名
		String publicName = "public class $Proxy " + "implements  " + interfaceName + "{" + line;
		// 定义变量
		String variable = blank + "public " + className + blank + h + ";" + line;
		// 定义构造方法
		String constructionStr = blank + "public " + "$Proxy " + "(" + className + " h" + ")" + "{" + line + blank
				+ blank + "this.h = h;" + line + blank + "}" + line;

		// 定义方法
		String methodStr = "";
		String methodsStr = "";
		// 定义 通知
		String tongZhi = "";

		// 拼接方法
		Method[] Methods = clzTar.getDeclaredMethods();
		boolean temp1 = false;

		for (Method m : Methods) {

			if (temp1) {
				methodStr = blank + "public ";
			}
			String returnType = m.getReturnType().getSimpleName();
			String mName = m.getName();

			// 定义 获取方法名的 参数
			String methodVStr = "";

			int flag = 0;
			Class[] p = m.getParameterTypes();
			// 类型 + 参数
			String pStr = "";
			// 参数
			String pStrV = "";
			// 类型.class
			String pStrVClass = "";
			boolean temp = false;
			for (Class c : p) {
				if (temp) {
					pStr = pStr + ", ";
					pStrV = pStrV + ", ";
					pStrVClass = pStrVClass + ", ";

				}

				pStr = pStr + c.getSimpleName() + " " + "arg" + flag;
				pStrV = pStrV + "arg" + flag;
				pStrVClass = pStrVClass + c.getSimpleName() + ".class";
				flag = +1;
				temp = true;
			}
			System.out.println("------" + pStrV);

			if (p.length == 0) { // 如果方法名优参数
				methodVStr = "\"" + m.getName() + "\"";
			} else {
				methodVStr = "\"" + m.getName() + "\"" + "," + pStrVClass;
			}

			// 通知
			tongZhi = "Method m = Class.forName(\"" + clzTar.getName() + "\").getDeclaredMethod(" + methodVStr + ");"
					+ line;
			// 参数数组
			String psArray = "Object p [] = { " + pStrV + " };" + line;

			// 定义 返回值
			String isNullStr = "";
			String returnStr = "";
			if ((returnType).equals("void")) {
				returnStr = "h." + clz.getDeclaredMethods()[0].getName() + "(m,p);";
				isNullStr = "";
			} else {
				returnStr = "return " + "(" + returnType + ")" + "h." + clz.getDeclaredMethods()[0].getName()
						+ "(m,p);";
				isNullStr = "return null;";
			}

			methodStr = blank + "public " + returnType + " " + mName + "(" + pStr + ") " + "{" + line + blank + blank
					+ "try {" + line + blank + blank + blank + tongZhi + line + blank + blank + blank + psArray + blank
					+ blank + blank + returnStr + line + blank + blank + "} catch (Throwable e) {" + line + blank
					+ blank + blank + "e.printStackTrace();" + line + blank + blank + blank + isNullStr + line + blank
					+ blank + "}" + line + blank + "}" + line;
			temp1 = true;
			methodsStr = methodsStr + methodStr;
		}

		String classStr = packageName + publicName + variable + constructionStr + methodsStr + line + "}";
		Boolean b = IOUtils.out(classStr);
		Boolean c = IOUtils.toClassFile();

		if (b && c) {
			System.out.println("-->" + classStr);
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
			return null;
		}
		return objctProxy;
	}

	public static void main(String[] args) throws Exception {
		TargetClass targetClass = new TargetClass();
		ProxyHandler proxyHandler = new ProxyHandler(targetClass);
		Object o = newInstance(proxyHandler, targetClass);
		Interface i = (Interface) o;
		i.B("1");
		// 使用 jdk动态代理
	}

}
