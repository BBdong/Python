package com.it.javaNIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class TNIO {

	public static void main(String[] args) {

		String pathname = "C:\\Users\\Administrator\\Desktop\\A\\香港一级平台2018-08-01至2019-01-21用户注册信息详情1689754710134265551.csv";
		FileInputStream fin = null;
		try {
			fin = new FileInputStream(new File(pathname));

			FileChannel channel = fin.getChannel();
			int capacity = 100;// 字节
			ByteBuffer buffer = ByteBuffer.allocate(capacity);
			System.out.println("限制是：" + buffer.limit() + "容量是：" + buffer.capacity() + "位置是：" + buffer.position());
			int length = -1;
			while ((length = channel.read(buffer)) != -1) {
				buffer.clear();
				byte[] bytes = buffer.array();
				System.out.write(bytes, 0, length);
				System.out.println();
				//System.out.println("限制是：" + buffer.limit() + "容量是：" + buffer.capacity() + "位置是：" + buffer.position());
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
