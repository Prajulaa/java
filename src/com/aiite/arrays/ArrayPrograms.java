package com.aiite.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayPrograms {
	static int addedSum=0;
	static int total;
	void removeDuplicateValues() {
		
	}
	
	static int sumOfArrayElements(int mark) {
		 addedSum = addedSum+mark;
		return addedSum;
	}

	
	public static void main(String[] args) {
		int  [] classMarks = {14, 150, 109, 102, 101, 1022};
		
		List<Integer> classM = new LinkedList<Integer>();	
		
		
		for(int marks:classMarks) {
	    total = sumOfArrayElements(marks);
		}
	System.out.println("The sum of the array is: " + total);	
	}

	

}

//
//done        //Find Length of Array in Java 
//Get Array Input in Java
//Return Array from a method
//Different ways to Print Array
// done      //Find the Sum of Array in Java
//Find the average of an Array
//Sum of Two Arrays Elements
//Compare Two Arrays in Java
//Copy Array in Java
//Merge 2 Arrays in Java
//Merge two sorted Arrays
//Largest Number in Array
//Smallest Number in Array
//2nd Largest Number in Array
//How to Sort an Array in Java
//Reverse an Array in Java
//GCD of N Numbers in Java
//Linear Search in Java
//Binary Search Program in Java
//Remove Duplicates From Array
//Insert Element at Specific Position
//Add Element to Array in Java
//Remove Element From Array in Java
//Count Repeated Elements in Array