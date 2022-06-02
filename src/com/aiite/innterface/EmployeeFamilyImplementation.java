package com.aiite.innterface;

public class EmployeeFamilyImplementation implements IFamily, IEmployee{

	public static void main(String[] args) {
	
		//reference created for EmployeeFamilyImplementation
		EmployeeFamilyImplementation obj = new EmployeeFamilyImplementation();
		obj.employee();
		obj.family();
		obj.spendQualityTime();
		
		// reference created for IFamily
		IFamily ifam = new EmployeeFamilyImplementation ();
		ifam.employee();
		ifam.family();
		ifam.spendQualityTime();
		
		//reference created for IEmployee
		IEmployee emp = new EmployeeFamilyImplementation ();
		emp.employee();

		emp.spendQualityTime();
		
	}

	@Override
	public void spendQualityTime() {
		System.out.println("this is the common spend quality time method");
		
	}

	@Override
	public void employee() {
		System.out.println("Employee method in IEmployee");
		
	}

	@Override
	public void family() {
		System.out.println("Family method in Ifamily");
		
	}

}
