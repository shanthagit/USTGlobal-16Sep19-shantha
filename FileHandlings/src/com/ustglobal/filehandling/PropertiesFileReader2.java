package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader2 {
	public static void main(String[] args) {
		String path ="text.properties";
		FileReader reader =null;
		try {

			reader =  new FileReader(path);
			Properties properties = new Properties();
			properties.load(reader);
			String name =properties.getProperty("name");
			String company =properties.getProperty("company");
			String bf =properties.getProperty("bf");

			System.out.println("Name is "+name);
			System.out.println("Company is "+company);
			System.out.println("Bf is "+bf);



		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
