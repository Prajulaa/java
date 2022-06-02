package com.aiite.innterface;


public class Implemetation implements IFirstInterface, ISecondInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implemetation obj = new Implemetation();
		obj.method1();
		obj.method2();

	}
	@Override
	public void method1() {
		System.out.println("This is the first Interface");

	}
	@Override
	public void method2() {
		System.out.println("This is the second Interface");

	}

}


