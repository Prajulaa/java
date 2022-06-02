package com.aiite.arrays;

import java.util.Arrays;

public class AcendingDecendingOrder {
	static int i;


	public static void main(String[] args) {
		int[] values = {12,31,2424,-424,23232,1,-3,23};
		int[] temp = {12,31,2424,-424,23232,1,-3,23};

		System.out.println(Arrays.toString(values));

		for(int j=0; j<values.length; j++) {
			for ( i=1; i<values.length; i++) {
				if(values[i]<temp[j]) {
					temp[j]=values[i];
				}
			}
		}

		System.out.println(Arrays.toString(values));
		System.out.println(Arrays.toString(temp));
		
	}

}
