package com.aiite.strings;

public class VowelsConsonentsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "Prajula Ravichandran";

//parsing a string
String value = "1234";
int val = Integer.parseInt(value);
System.out.println(val);
String noSpace = name.replaceAll(" ", "");
String sameCasing = noSpace.toLowerCase();
String vowels="";
String consonents="";
int vCount =0;
int cCount=0;


for(int i=0; i<sameCasing.length(); i++) {
	char c = sameCasing.charAt(i);
	
	if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
	{
		vowels = vowels+c;
		vCount++;
	}
	else {
		consonents = consonents+c;
		cCount++;
	}
	
}
System.out.println(vCount +vowels);
System.out.println(cCount + consonents);

}
}