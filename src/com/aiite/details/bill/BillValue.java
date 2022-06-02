package com.aiite.details.bill;

public class BillValue {
public static void main(String[] args) {
		
		
		BiriyaniTax obj1 = new BiriyaniTax();
		DiscountAmount obj2 = new DiscountAmount();
		
		obj1.orderDetails();
		System.out.println("Bill amount: "+ obj1.biriyani);
		int actualPrice = obj1.biriyani;
		double gst = obj1.calculateGst();
		double serviceTax = obj1.calculateServiceTax();
		double totalPrice = actualPrice + serviceTax + gst;
		System.out.println("Total amount: " + totalPrice);	
		obj2.discount(totalPrice);
		
		
	}

}
