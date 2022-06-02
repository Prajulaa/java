package com.aiite.programs;

public class SumOfDigits {

	public static void main(String[] args) {

//sum of digits
		long number = 1234567890;
		long temp=number;
		long numberCount=number;
		int sum=0;
		int count=0;
		String num = Long.toString(number);
		System.out.println("The number of digits using string size is: "+num.length());
		
		while(temp>0) {
			int reminder = (int)temp%10;
			sum=sum+reminder;
			temp=temp/10;	
		}
		
		System.out.println(sum);

//count the digit
	
	while(numberCount>0) {
		count++;
		numberCount=numberCount/10;
	}
	
	System.out.println("The num of digits using while loop is: "+count);
	

}//main ends here
}
