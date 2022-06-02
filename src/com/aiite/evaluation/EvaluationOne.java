package com.aiite.evaluation;

public class EvaluationOne extends Evaluation {
	
	@Override
	public
	void method() {
		System.out.println("I am the overridden method!!");
	}
public static void main(String[] args) {
	EvaluationOne obj = new EvaluationOne();
	Evaluation obj1 = new Evaluation();
	obj.method();
	System.out.println(obj.age);
	obj1.method();
		
	}

}
