package com.aiite.looping;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int age=30;
	int num=0;
	
	//do while looping - finite iteration
		do {
			
			System.out.println("Initiating a do while loop times "+num);
			num++;
			if(num>30) {
				break;
			}
		}while(age>0);

	}



}
