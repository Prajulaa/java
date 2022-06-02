package com.aiite.evaluation.java;

public class EncapsulationEx  {

	public static void main(String[] args) {
		EvaluationJava ex = new EvaluationJava();
		
		System.out.println("Getting the actual values");
		System.out.println(ex.getName());
		System.out.println(ex.getEmpId());
		
	    ex.setName("Vilasini");
	    ex.setEmpId(123);
	    
	    System.out.println("Getting the setter values");
	    System.out.println(ex.getName());
		System.out.println(ex.getEmpId());
	    
	    
	
		
		

	}

}
