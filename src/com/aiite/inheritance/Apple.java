package com.aiite.inheritance;

public class Apple extends Fruit {
	static String name = "Apple"; //global or class variable

	
	Apple(){
	    name = "plain name";
		this.name = "this name";
		System.out.println("The name value in the subclass is:"+ this.name);
		System.out.println("The name value in the superclass is: "+ super.name);
		System.out.println(name);
        
	}
	
	void SampleMethd() {
		int a=50; //local variable
		fact();
		System.out.println("The name value in the subclass is:"+ this.name);
		System.out.println("The name value in the superclass is: "+ super.name);
		
	}
	
	public static void main(String[] prajula) {
		int a=40; //instance variable
		System.out.println(name);
		Apple obj = new Apple();
		obj.factOne();

		
	}

}
