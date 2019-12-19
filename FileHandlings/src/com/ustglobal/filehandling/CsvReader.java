package com.ustglobal.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;

public class CsvReader {
	public static void main(String[] args) {
		try(FileReader in =new FileReader("csv1.txt");
				BufferedReader br = new BufferedReader(in)){
			/*
			 * System.out.println(br.readLine()); System.out.println(br.readLine());
			 */

			while(br.ready()) {
				String line = br.readLine();
				String[] words = line.split(",");
				System.out.println("Id is " +words[0]);
				System.out.println("Name is " +words[1]);
				System.out.println("Sal is " +words[2]);
				System.out.println("Gender is " +words[3]);
				System.out.println("***************************");

			}

		}catch(Exception e) {
			e.printStackTrace();

		}
	}

}
