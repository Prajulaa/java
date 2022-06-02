package com.aiite.details.bill;

public class DiscountAmount {

	void discount(double totalAmount) {
		double discount = totalAmount*0.10;
		System.out.println("10% Discount applied: "+discount);
		double amountPaid= totalAmount - discount;
		System.out.println("Amount to be paid: "+ amountPaid);
		
	}
}
