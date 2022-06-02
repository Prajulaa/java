package com.aiite.programs;

public class PatternsPyramind {

	public static void main(String[] args) {
		int pyramidSize = 3;
int rows = pyramidSize +(pyramidSize-1);
int centre = (pyramidSize/2)+1;
int spaces = pyramidSize/2;
String print ="*";
String space = "";



for(int i=0; i<pyramidSize; i++) {
for(int j =0; j<centre; j++) {// for spaces
	System.out.println(j);
	System.out.print(space);
space+=1;
}
//	System.out.print(print);
//	System.out.println();
	print+="*";	
	
}
	}

}
