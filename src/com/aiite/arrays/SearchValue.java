package com.aiite.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SearchValue {
	public static void main(String[] args) {
		int temp =0;
		int rowValue=0;
		int i=0;
		int[][] studentDetails = new int[3][7];
		// entering details for individual students

		studentDetails[0][0] = 0;
		studentDetails[0][1] = 12001;
		studentDetails[0][2] = 98;
		studentDetails[0][3]  = 95;
		studentDetails[0][4] = 97;
		studentDetails[0][5] = 100;
		studentDetails[0][6] = 76;

		studentDetails[1][0] = 1;
		studentDetails[1][1] = 12002;
		studentDetails[1][2] = 78;
		studentDetails[1][3] = 23;
		studentDetails[1][4] = 98;
		studentDetails[1][5] = 80;
		studentDetails[1][6] = 95;

		studentDetails[2][0] = 3;
		studentDetails[2][1] = 12003;
		studentDetails[2][2] = 74;
		studentDetails[2][3] = 88;
		studentDetails[2][4] = 58;
		studentDetails[2][5] = 83;
		studentDetails[2][6] = 65;

		//get register number from user
		System.out.println("Results are out. Enter your register id below to view results: ");
		Scanner sc = new Scanner(System.in);
		int enteredRegNumber = sc.nextInt();
		System.out.println(Arrays.deepToString(studentDetails));
		
	}
		




	}



