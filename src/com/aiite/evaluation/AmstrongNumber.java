package com.aiite.evaluation;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		
	for (int i=1; i<=1001 ; i++) {
		int temp=i;
		int ams =0;
		
	while(temp>0) {
		int value = temp%10;
	    ams = (value*value*value)+ams;
		temp=temp/10;	
	}
	if(i==ams) {
		System.out.println(i);
		}
	}
	
	

	}

}
