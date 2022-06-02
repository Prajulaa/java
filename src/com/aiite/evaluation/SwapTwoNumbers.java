package com.aiite.evaluation;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=44, b=90;
		int temp;
		
		System.out.println("before swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("after swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		//without using variable
		//int a=90, b=44;
		
		a=a+b;//a=134 , b=44
		b=a-b;//b=90 , a=134
		a=a-b;//a=44, b=90
		
		System.out.println("after swapping again without using third number");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		
		


	}

}
