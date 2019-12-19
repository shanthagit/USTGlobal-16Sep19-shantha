package com.ustglobal.filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {
	public static void main(String[] args) {

		String path ="C:\\Users\\KARTHIK ANAND\\Desktop\\text.txt.txt";
		FileReader reader =null;
		try {
			/*
			 *  reader = new FileReader(path); 
			 *  int i1 = reader.read(); 
			 *  char ch1 =(char)i1; 
			 *  System.out.println(ch1);
			 */			 
			reader =  new FileReader(path);
			int i;
			/* -1 is the end of charecter */
			while((i=reader.read())!=-1) { 
				System.out.print((char)i);
			}


		} catch (IOException e) {

			e.printStackTrace();
		}
	}//end of main

}//end of class
