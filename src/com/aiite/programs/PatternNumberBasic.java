package com.aiite.programs;

public class PatternNumberBasic {

	public static void main(String[] args) {
		int rows = 10;
		String output = "";
		
		for(int i=0;i<rows;i++) {
			if(i==0)continue; // to skip the 0 iteration	
			//if(i==6)break;
			output = output + i;
			System.out.println(output);
		}

	}

}
