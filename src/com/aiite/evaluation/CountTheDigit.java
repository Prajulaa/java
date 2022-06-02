package com.aiite.evaluation;

public class CountTheDigit {

	public static void main(String[] args) {
		int num = 2571672;
		int num2=num;
		int count=0;
		int sum=0;
		
		//how many digits are in a number
		while(num>0) {
		int	value =num%10;
		count++;
		num=num/10;	
		}
		System.out.println(count);
		
		//sum of the digits
		while(num2>0) {
			int	value =num2%10;
			sum = value+sum;
			num2=num2/10;	
			}
		System.out.println(sum);

	}

}
