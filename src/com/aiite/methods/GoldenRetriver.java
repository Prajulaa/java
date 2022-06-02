package com.aiite.methods;

public class GoldenRetriver extends Dog {
	
	
	String colour = "Golden";
	int age = 3;
	
	@Override
    void eats() {
		System.out.println("I am eats in the child class");
		
	}
	
	static void play() {
		System.out.println("I am play in the child class");
	}

	public static void main(String[] args) {
		Dog.value = "This is not okayyyyyyyyyyyyyyy";
		System.out.println(Dog.value);
		System.out.println("Child reference and child object");
		GoldenRetriver obj = new GoldenRetriver();
		obj.eats();
		
		
		

	}

}
/*1. super and this cannot be used inside main method and inside class

*/