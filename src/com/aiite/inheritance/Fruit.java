package com.aiite.inheritance;

public class Fruit extends Food {
	int nutritionValue;
	int proteinContent;
	int a=10;
	int fruitQuantity = quantity*12;
	String name = "Fruit";
	
	//constructor
	Fruit(){
		
	}
	Fruit(int a){
		System.out.println("Fruit Construstor");
	}
	
	void fact() {
		int refer = quantity*14;
		System.out.println("I make you healthyy");
	}
	
final void factOne() {
		int refer = quantity*14;
		System.out.println("I make you healthyy");
	}
	
	public static void main(String[] args){
		int nutritionValue= 12;
		int proteinContent=200;
		

		
		System.out.println(nutritionValue);
		System.out.println(proteinContent);
		
		//creating obj for the same class
		Fruit object = new Fruit();
		object.fact();
		object.rate();	
		//int quant = object.quantity;
		System.out.println("I am in the same class"+ quantity);
		//System.out.println(quant);
	
	}
}

