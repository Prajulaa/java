package com.aiite.arrays;

import java.util.Arrays;

public class Employee {
	
	 public Employee(String string, int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	    {
	        //array of Employee objects
	        Employee[] employees = { new Employee("Rick", 1), new Employee("Sam", 20),
	                    new Employee("Adi", 5), new Employee("Ben", 10) };
	 
	        //print original array
	        System.out.println("Original Array of Employee objects:");
	        System.out.println(Arrays.toString(employees));
	        //sort array on empId
	        Arrays.sort(employees);
	        //display sorted array
	        System.out.println("\nSorted Array of Employee objects:");
	        System.out.println(Arrays.toString(employees));
	    }

}
