package com.aiite.arrays;

import java.util.Arrays;

public class CompareArrays {
	String name;
	CompareArrays(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		CompareArrays e = new CompareArrays("prajula");
		CompareArrays f = new CompareArrays("vilasini");
		
		CompareArrays[] g = new CompareArrays[] {e,f};
		CompareArrays[] h = new CompareArrays[] {e,f};
		System.out.println("Custom Array Compared");
		System.out.println("------------------------");
		System.out.println(Arrays.equals(g,h));
		
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,5, 6};
		
		String[] c = new String[] {"prajula", "vilasini"};
		String[] d= new String[] {"prajula", "vilasini", "lusu"};
		
		System.out.println("Int Array Compared");
		System.out.println("------------------------");
		//method 1
		if(a==b) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
		
		//method 2 - using the equals operator
		System.out.println(Arrays.equals(a,b));
		
		System.out.println("String Array Compared");
		System.out.println("------------------------");
				//method 2 - using the equals operator for string
				System.out.println(Arrays.equals(c,d));
		
		//method 3 - compare array of objects
		

	}

}
