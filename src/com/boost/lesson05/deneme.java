package com.boost.lesson05;

public class deneme {

	public static void main(String[] args) {
		String userInput = "3 gozde 3 olgu ali veli abcd 7";

		String numberPart = userInput.replaceAll("[^0-9]", "");

		System.out.println(numberPart);

		char[] ch = new char[numberPart.length()];

		int sum = 0;

		for (int k = 0; k < numberPart.length(); k++) {

			ch[k] = numberPart.charAt(k);

			sum += Character.getNumericValue(ch[k]);

		}

		System.out.println(sum);

	}

}
