package com.aiite.arrays;

public class MinMaxValue {

	public static void main(String[] args) {
		int min,max;
		int[] values = {12,31,2424,-424,23232,1,-3,23};
		
		min = max = values[0];
		for(int i=1; i<values.length; i++) {
			if(values[i]<min) {
				min=values[i];
			}
			if(values[i]>max) {
				max = values[i];
			}
		}
		System.out.println("The minimum value is: "+ min);
		System.out.println("The maximum value is: "+ max);

	}

}
