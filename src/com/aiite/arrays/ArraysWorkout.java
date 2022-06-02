/**
 * 
 */
package com.aiite.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ArraysWorkout {
 static int sum=0;
 static double average;
static int index;

	public static void main(String[] args) {
		int[] marks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//QUESTION 1  - to find the sum of values in an array
		for(int value : marks) {
		    sum = sum+value;
		}
        System.out.println(sum);
        
        //QUESTION 2 - to find the average
        average = sum/marks.length;
        System.out.println(average);
        
        //QUESTION 3 #1 option to remove duplicates in an array
       int a[]= {10,10,20,50,60,80,60,50};
       List<Integer> b = new LinkedList<Integer>();
      
       for (int i=0; i<a.length; i++) {
    	 int duplicate=0;
    	   for(int j=i+1; j<a.length; j++) {
    		 if(a[i]==a[j]) {
    			 duplicate++;
    		   }
    	   }	
    	  if(duplicate==0) {
             b.add(a[i]);
    		 
    	  }
	}
       System.out.println(b);
       
     //QUESTION 3 #2 option to remove duplicates in an array
       Set<Integer> c = new TreeSet<Integer>();
       for(int i=0; i<a.length; i++)
       {
    	   c.add(a[i]);
       }
     System.out.println(c);   
     
     //Question 5.1 - find the first index of 10 --10,20,30,90
        List<Integer> d = new LinkedList<Integer>();
     d.add(10);
     d.add(20);
     d.add(30);
     d.add(90);
     System.out.println(d.indexOf(10));
     
    //Question 5.2 and 5.3 get the last index of 10 and index of 50
     List<Integer> e = new Vector<Integer>();
     e. add(10);
     e.add(20);
     e.add(30);
     e.add(90);
     e.add(10);
     e.add(10);
     e.add(40);
     e.add(50);
   System.out.println(e.lastIndexOf(10));
   System.out.println(e.indexOf(50));
   
   //QUESTION 5.5 - get each index value of 10
   List<Integer> f = new Vector<Integer>();
   f. add(10);
   f.add(20);
   f.add(30);
   f.add(90);
   f.add(10);
   f.add(10);
   f.add(40);
   f.add(50);
   f.add(10);
   
   for (int i=0; i<f.size(); i++) {
	   if(f.get(i)==10) {
	   System.out.print(i);
	   System.out.print("  ");
	   }
   }
   System.out.println(" ");
   
   //QUESTION 6.1 -- get the value present in the 2nd index
   List<Integer> g = new LinkedList<Integer>();
   g.add(10);
   g.add(20);
   g.add(30);
   g.add(40);
   g.add(50);
   g.add(60);
   
   System.out.println(g.get(2));
   
   
   List<Integer> h = new LinkedList<Integer>();
   
   h.add(105);
   h.add(205);
   h.add(305);
   h.add(405);
   h.add(505);
   h.add(605);
   h.add(705);
   h.add(805);
   
   //QUESTION 6.4  -- get each value of the list using a normal loop
   for(int i=0 ; i<h.size(); i++) {
	   System.out.print(h.get(i));
	   System.out.print("  ");
   }
   System.out.println("  ");
   
   
   //QUESTION 6.5  -- get each value using an enhanced for
   for(Integer value:h) {
	   System.out.print(h.get(value));
	   System.out.print("  ");
   }
   System.out.println("  ");
     
	}

}
