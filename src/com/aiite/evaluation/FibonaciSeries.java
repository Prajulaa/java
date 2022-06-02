package com.aiite.evaluation;

public class FibonaciSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int fibo;
		int sum=0;
		
		for(int i=1; i<11; i++) {
			fibo = a+b;
			sum =fibo+sum;
			System.out.println(fibo);
			a=b;
			b=fibo;
		}
		System.out.println(sum);

	}

}
