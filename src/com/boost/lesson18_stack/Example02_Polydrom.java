package com.boost.lesson18_stack;

import java.util.Scanner;
import java.util.Stack;

public class Example02_Polydrom {

	static String text;

	public static void main(String[] args) {

		Stack<Character> myText = new Stack<Character>();
		text = text();
		myText = stackText(text);
		isPolyndrom(myText, text);
	}

	public static String text() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any text");
		String text = scanner.nextLine();
		text = text.trim();
		return text;
	}

	public static Stack<Character> stackText(String text) {

		Stack<Character> myText = new Stack<Character>();
		for (int i = 0; i < text.length(); i++) {
			myText.push(text.charAt(i));
		}
		return myText;
	}

	public static void isPolyndrom(Stack<Character> stack, String text) {

		int length = stack.size();
		for (int i = 0; i < length; i++) {
			if (text.charAt(i) != stack.pop()) {
				System.out.println("it is not polyndrom");
				break;
			} else {
				System.out.println("it is polyndrom");
				break;
			}
		}

	}

}
