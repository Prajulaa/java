package com.aiite.methods;

public class StudentDetails {
	String name = "Vilasini Ravichanndran";
	String standard = "5th";
	char section = 'A';
	byte rollNumber = 61;
	long mobileNumber= 7094782427L;
	boolean feePending;
	int b;
	
	public static void main(String[] args) {
		StudentDetails obj1 = new StudentDetails();
		System.out.println("STUDENT DETAILS");
		System.out.println("----------------");
		System.out.println("Name: "+obj1.name);
		System.out.println("Standard: "+obj1.standard + " " + obj1.section);
		System.out.println("Roll Number: "+obj1.rollNumber);
		System.out.println("Mobile number: "+obj1.mobileNumber);
		System.out.println("Fee Pending: "+obj1.feePending);
		System.out.println();
		
		StudentMarks obj2 = new StudentMarks();
		double total = obj2.total;
		obj2.average(total);
		obj2.percentage(total);
		
	}
		

}
