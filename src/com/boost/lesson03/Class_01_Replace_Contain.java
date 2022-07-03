package com.boost.lesson03;

public class Class_01_Replace_Contain {

	public static void main(String[] args) {
		// "Hello, World!".replace('e','3')

		String word = "Hello, world!";

		String newWord = word.replace('e', '3').replace('o', '0');
		// semicolomn yerine nokta koyup ('x','y') ifadeleri eklemeye devam edilebilir

		System.out.println(newWord);

		// Contains, bir string içinde aranan bir değeri olup olmadığını true / false
		// söyler.

		System.out.println(word.contains("Hello"));

	}

}
