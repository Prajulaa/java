package com.aiite.basics;

public class PrintSomething {
	//main method
	public static void main(String[] args) {
		//printing name and age
		int age = 28;
		String name = "Gogul";
		System.out.println(age);
		System.out.println(name);	
		 PrintSomething objname = new PrintSomething();
	      objname.sum();
		} 
	
	//Add method
	void sum() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
		
	}
	//subtraction method
	void sub() {
		int a = 10;
		int b = 20;
	    int c = a -b;
		
	}
	
	
	

}