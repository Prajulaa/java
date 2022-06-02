package com.aiite.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Difference {

	public Difference(String name, int age) {
	 System.out.println("My name is "+ name+" and I am "+ age +" years old");
	}
	
	public Difference(int age) {
		 System.out.println("My name is unknown and I am "+ age +" years old");
		}

	public static void main(String[] args) {
		
	
		
		Difference[] array = new Difference[3];
		
		array[0] = new Difference("Prajula", 26);
		array[1] = new Difference("Vilasini", 24);
		array[2] = new Difference (43);
		
		System.out.println(Arrays.toString(array));
		
	

	}

}
