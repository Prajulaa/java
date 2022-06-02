package com.aiite.discovery;

public class RandomNumbers {

	public static void main(String[] args) {

		//OPTION 1 - using the random() method in Math class
		/*  returns a decimal value of range (0.0 to 0.1)//NOTE: 17 digits after decimal
		 * to use the random number to generate numbers within a range, use the below formula
		 * Math.random() * (min -max) + min
		 */
		int min = 1;
		int max = 100;
		for(int i=0; i<500; i++) {	
			int random =   (int) (Math.random()* (max-min)+min); 	
			System.out.println(random);
		}

		/*
		 * 2. Random class - nextInt() --> generates random numbers from 0 to (upperbound)
		 * for ex. if the parameter is 101 it generates numbers from 0 to 100
		 */

	}

}
