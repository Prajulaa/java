package com.aiite.exceptions;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileIOExceptions {

	public static void main(String[] args) {
		
		try {
			File data = new File("Prgg.txt");
			//writing in a file
			FileWriter writer = new FileWriter(data); 
			writer.write("Hello World. This is me Prajulaa :)\n Welcome to my JAVA Tutorials.\n PLease like subscribe and share");
			writer.close();
			
			//trying to read a file
			
		    Scanner sc = new Scanner(data); 
		    System.out.println(sc.nextLine());
		    while(sc.hasNextLine()) {
		    	System.out.println(sc.nextLine());
		    }
			 
		}
		catch(Exception e){
			e.printStackTrace();	
		}

	}

}
