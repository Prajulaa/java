package com.aiite.details.bill;

public class BiriyaniTax {
	short biriyani = 150;
	    
	    void orderDetails() {
	    	System.out.println("Order Details: Biriyani x 1");
	    }
		
		double calculateGst() {
			double gst = biriyani*(0.05);
			System.out.println("5% GST: " + gst);
			return gst;
		}
		double calculateServiceTax() {
			double serviceTax = biriyani*(0.03);
			System.out.println("3% Service Tax: " + serviceTax);
			return serviceTax;
				
		}
}
