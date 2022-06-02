package com.aiite.programs;

import java.util.Arrays;

public class LargestElementsArray {

	public static void main(String[] args) {
	int[] elements = {1,2,3,5,4,0};
	int temp =0;
	
	for(int i=0; i<elements.length; i++) {
	
		for(int j=1; j<elements.length; j++) {
			if(elements[i]<elements[j]) {
			  temp = elements[j];
			  elements[j] = elements[i];	
			  elements[i]=temp;

			}
			
			
			System.out.println("Itertion index i: "+ i+"Iteration index j: "+ j);
			System.out.println("element in i"+ elements[i]+ "element in j"+elements[j]);
			System.out.println(Arrays.toString(elements));
		}
	}

	}

}
