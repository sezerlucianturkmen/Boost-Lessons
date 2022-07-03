package com.boost.lesson09;

public class Example_01 {

	public static void main(String[] args) {
		int[] array = { 1, 5, 6, 7 };
		int[] newArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[array.length - 1 - i];

		}

		for (int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " , ");
		}

	}
}
