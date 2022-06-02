package com.aiite.programs;

public class ReverseNumber {

	public static void main(String[] args) {
		
//		% - reminder
//		/ - quotient
//		23/2 -> 11
//		23%2 -> 1
//		22/2 -> Q11 R0
//		23/2 -> Q11 R1
		int num = 1260078900, temp = num, temp1=num;
		String number = "231330000000";
		int custom=num;
		String numReverse="";
		int numRev=0, rev=0;
		int rem;

        System.out.println("Reversing a number usnig .toString method in Interger class");
		while(num>0) {
			rem = num%10;
			numReverse = numReverse+Integer.toString(rem);
			num = num/10;
		}
		System.out.println(numReverse);

		//using String class
		System.out.println("Reversing the number using String Class");

		for(int i= number.length()-1;i>=0; i--) {
			System.out.print(number.charAt(i));
		}
		System.out.println();

		//using enhanced for loop
		System.out.println("Reversing a number using enhanced for loop");
		for(;temp1 != 0; temp1 /= 10) {
			rem = temp1%10;
			numRev = (numRev*10)+rem;
		}
		System.out.println(numRev);
		//using the usual %10 *10 formula
		System.out.println("Reversing a number using the %10 *10 operations");
		while(temp>0) {
			rem = temp%10;
			rev = (rev*10)+rem;
			temp = temp/10;
		}
		System.out.println(rev);
		
		//adding custom conditions 34007509000
		System.out.println("using custom conditions");
		int zeroCounter=0;
		int mul=10;
		while(custom>0) {
			rem = temp%10;
			if(rem==0) {
				zeroCounter++;
			}
			else {
				while(zeroCounter>0) {
					mul=mul*10;
				}
			rev = (rev*mul)+rem;
			temp = temp/10;
			mul=10;
			}
		}
		System.out.println(temp);
//	3 - 10000
//	2 - 1000
//	1 - 100
//	0 - 10
	

	}

}
