package com.aiite.arrays;

import java.util.Arrays;

public class ArrayLenght {

	public static void main(String[] args) {
		int[] values = {12,31,2424,-424,23232,1,-3,23};
		
		System.out.println("The lenght of the array is: "+ values.length);
		Arrays.sort(values);
		System.out.println("The sorted Array is: "+ Arrays.toString(values));
		System.out.println("Printing arrays in loop");
		for(int i=0; i<values.length; i++) {
			System.out.println(values[i]);
		}

	}

}
