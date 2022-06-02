package com.aiite.abstraction;


abstract public class HrDetails implements CompanyInfo{
    
	  static double yearSalary(double salary) {
		Double yearlySal = salary*100000;
		return yearlySal;
	}
	  
	  public double updatedCtc(double sal, double currentCtc) {
			double totalAmt = sal*0.20;
			double hikeCtc = totalAmt/100000;
			double total = Math.round(hikeCtc + currentCtc);
			return total;
		}

		@Override
		abstract public void hikeDate();	  
	  
	  
	  

}
