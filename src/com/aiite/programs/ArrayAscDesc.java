package com.aiite.programs;

import java.util.Arrays;

public class ArrayAscDesc {

	public static void main(String[] args) {

		int a[] = { 10, 100, 90, 20, 40 };
		
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length; i++) {
			
		for(int j=i+1; j<a.length; j++)	{
			
			if(a[i]>a[j]) {
				int temp = a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			
			
		}
			
			
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Min Value: "+a[0]);
		System.out.println("Max Value: "+a[a.length-1]);
		
		
	}

}
