package com.boost.lesson09;

public class Example_03 {

	public static void main(String[] args) {
		String cardType[] = { "heart", "spade", "diamond", "club" };
		String cardNumber[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		Example_02 example_02 = new Example_02();
		example_02.cardTypes = cardType;
		example_02.cardNumbers = cardNumber;

		int rummy[] = new int[example_02.cardTypes.length * example_02.cardNumbers.length];

		rummy = example_02.makeRummy(rummy);
	}

}
