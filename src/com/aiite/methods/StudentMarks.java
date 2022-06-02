package com.aiite.methods;

public class StudentMarks {
	short biology = 98;
	short maths = 100;
	int science = 95;
	float english = 88.5F;
	float tamil = 70;
    double total = biology+maths+science+english+tamil;

	
    void average(double total) {
    	double average = total/5;
    	System.out.println("Average Marks Obtained: "+average);
    }
    void percentage(double total) {
    	double percentage = (total/500)*100; 	
    	System.out.println("Percentage of marks: "+percentage);
    }
    
}

