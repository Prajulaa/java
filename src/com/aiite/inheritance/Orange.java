package com.aiite.inheritance;

public class Orange extends Fruit {
	int ratePerKg = 120;
	
	public static void main(String[] args) {
		//creating obj for teh same class
		Orange obj = new Orange();
		int quant = obj.quantity;
		System.out.println(quant);
		
		
	}

}
