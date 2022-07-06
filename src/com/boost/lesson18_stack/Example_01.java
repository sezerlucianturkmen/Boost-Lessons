package com.boost.lesson18_stack;

import java.util.Stack;

public class Example_01 {

	public static void main(String[] args) {

		Stack<Integer> myList = new Stack<Integer>();

		myList.add(200);
		myList.add(100);
		myList.add(20);
		myList.add(25);
		myList.add(20);

		/*
		 * System.out.println(myList);
		 * 
		 * 
		 * 
		 * while (myList.isEmpty() == false) { System.out.println(myList.pop()); }
		 * System.out.println("it is empty");
		 */

		int sum = 0;
		Stack<Integer> newList = new Stack<Integer>();

		while (myList.isEmpty() == false) {

			if (myList.peek() < 100) {
				sum += myList.pop();

			} else {
				newList.add(myList.pop());
			}
		}
		System.out.println(sum);
		System.out.println(newList);
		System.out.println(myList);

	}

}
