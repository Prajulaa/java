package com.aiite.basics;

public class MultipleObjects {
	String name;
	int age;
	String workDetails;
	
	public static void main(String[] args) {

		//creating two objects
		MultipleObjects employee1 = new MultipleObjects();
		MultipleObjects employee2 = new MultipleObjects();
		
		//asign values to fields in employee1
		
		employee1.name = "Prajula";
		employee1.age = 26;
		employee1.workDetails = "Matrimony.com";
		
	    //assign values to fields in employee2
		employee2.name="Prajula";
		employee2.age = 24;
		employee2.workDetails = "Verizon";
	
	}

}
