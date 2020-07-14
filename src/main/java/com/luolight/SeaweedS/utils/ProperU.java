package com.luolight.SeaweedS.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * properties属�?�文件读取和写入工具�?
 * 
 * @author Liang
 * @version 1.0
 */
public class ProperU {

	public static String read1(String file, String key){
		Properties prop = new Properties();
		try {
			// 读取属�?�文件a.properties
			//InputStream insss =Object.class.getResourceAsStream(file);
			FileInputStream fis =  new FileInputStream(new File(file));
			prop.load(fis);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	
	public static String read(String file, String key){
		Properties prop = new Properties();
		try {
			// 读取属�?�文件a.properties
			//InputStream insss =Object.class.getResourceAsStream(file);
			FileInputStream fis =  new FileInputStream(new File(file));
			prop.load(fis);
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}

}
