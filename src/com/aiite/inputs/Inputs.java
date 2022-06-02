package com.aiite.inputs;

import java.util.Scanner;

public class Inputs {
	public static void main(String[] args) {	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your name:");
	String name = scan.nextLine();
	System.out.println("Enter your age:");
	int age = scan.nextInt();
	System.out.println("Enter your company:");
	String company = scan.nextLine();
	System.out.println("Enter your notice period:");
	String noticePeriod = scan.nextLine();
	System.out.println("Enter a number between 10 to 100: ");
	
	//Print all gathered inputs
	System.out.println("Name: " + name);
	System.out.println("Age: " + age);
	System.out.println("Company: " + company);
	System.out.println("Notice Period: " + noticePeriod);
	}
}
