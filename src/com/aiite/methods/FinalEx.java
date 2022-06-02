package com.aiite.methods;

public class FinalEx {
	final int a = 10;
	
	public static void main(String[] args) {
		FinalEx obj = new FinalEx();
		//final variable can be accessed but you can't change it's value
		int b = obj.a;
		System.out.println(b);
	}

}
