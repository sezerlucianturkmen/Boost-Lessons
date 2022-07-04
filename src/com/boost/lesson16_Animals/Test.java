package com.boost.lesson16_Animals;

public class Test {

	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();

		makeVoice(animal1);
		makeVoice(animal2);
	}

	public static void makeVoice(Animal animal) {
		animal.makeVoice();
	}
}
