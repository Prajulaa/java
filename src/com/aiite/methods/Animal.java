package com.aiite.methods;

public class Animal {
	
	void sound (String animal, String sound) {
		System.out.println("I am a "+animal+" and I "+sound);
	}

	public static void main(String[] args) {
		Animal dog = new Animal();
		Animal cat = new Animal();
		dog.sound("dog", "bark bark");
		cat.sound("cat", "meow meow");
	}

}
