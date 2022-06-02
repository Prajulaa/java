package com.aiite.abstraction;

import java.util.Scanner;

public class EmployeeInformation extends HrDetails{

	public static void main(String[] args) {
		//getting user details
		Scanner sc = new Scanner(System.in);

		//name
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		//current CTC
		System.out.println("Enter your current CTC: ");
		double ctc = sc.nextDouble();
		sc.close();

		System.out.println("");
		EmployeeInformation empInfo = new EmployeeInformation();
		Double yearlySal = HrDetails.yearSalary(ctc);
		empInfo.remarks(name);
		System.out.println("Your updated CTC is "+ empInfo.updatedCtc(yearlySal, ctc));
		empInfo.hikeDate(); 
	}


	@Override
	public void hikeDate() {
		System.out.println("Your revised salary will be effective on 1st April 2022 ");

	}


	@Override
	public void remarks(String name) {
		System.out.println("Hey "+ name+ ","+ " "+"We are happy that you are a part of " + companyName);

	}





}
