package com.aiite.conditional.loops;

import java.util.Random;

public class GuessTheNumberUnderstanding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Add");
		System.out.println(10 + 2 + "Test");  
		System.out.println("Test" + 10 + 2);  //this alone concat 
		System.out.println("Multiplication");
		System.out.println(10 * 2 + "Test");  
		System.out.println("Test" + 10 * 2);
		System.out.println("Divide");
		System.out.println(10 /2 + "Test");  
		System.out.println("Test" + 10/ 2);
		System.out.println("Minus");
		System.out.println(10-2 + "Test");  
//		System.out.println("Test" + 10 - 2); //this alone error
		System.out.println("Modulo");
		System.out.println(10%2 + "Test");  
		System.out.println("Test" + 10 %2);
		

		
		// int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

		
		Random r = new Random();
		
		for (int i = 0; i<100;i++) { 
			
			int streamsize = 1; // because we need just one number
			int inclusive  = 1; //  we need to start from 1
			int excluisiveEnd = 101; // because we need till 100
			
			// since it returns stream we need take one. findFirst()
			// since it gives optional[int] we need to getAsInt
			//sema thankssss but inliked the nextInt method more :)
			
			System.out.println(r.ints(streamsize,inclusive,excluisiveEnd).findFirst().getAsInt());
			
			// i gues this works1 	1 101 enathu
			
//			int number = r.nextInt(101); 
//		    if(number == 0) continue; 
//			System.out.println(number);
		}

	}

}
