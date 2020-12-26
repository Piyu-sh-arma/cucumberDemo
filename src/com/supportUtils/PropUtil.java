package com.supportUtils;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropUtil {
	private static final Logger log = Logger.getLogger(PropUtil.class);
	private static final Properties config;
	static {
		config = new Properties();
		try {
			System.out.println("<---Initiating Properties--->");
			config.load(new FileInputStream("./resources/configFiles/Config.properties"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static String getProperty(String key) {
		return config.getProperty(key);
	}

	public static void setProperty(String key, String value) {
		config.setProperty(key, value);
	}
}
