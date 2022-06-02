package com.aiite.methods;


public class SampleMethod {
	
	String student() {
		String name = "Vilasni";
		return name;
	}
	
	void totalMarks(int bio, int maths) {
		int total = bio+maths;
		System.out.println("Total Marks is: "+ total);
	}

	public static void main(String[] args) {
		SampleMethod obj = new SampleMethod();
		obj.totalMarks(99,100);
		System.out.println(obj.student());
		String ageNumber=obj.student();
		System.out.println(ageNumber);
	
		
		
	

	}}
