package com.Sezer20220622;

import java.util.Random;

/*
 * Iskambil rummysini diziler ile olusturun. 
 * Sonrasında bu rummydeki elemanları 
 * karıştırın ve de ilk kullanıcıya 
 * hangi 4 kartın geldiğini ekrana yazdırın.
 * 
 * 
 * */

public class Example_02 {

	String cardTypes[];
	String cardNumbers[];

	public static void main(String[] args) {

	}

	public void mixRummy(int[] rummy) {

		for (int i = 0; i < rummy.length; i++) {
			int randomIndex = randomNumber();
			int temp = rummy[i];// 0
			rummy[i] = rummy[randomIndex];
			rummy[randomIndex] = temp;

		}

	}

	public int randomNumber() {

		Random random = new Random();

		return random.nextInt(52);
	}

	public int[] makeRummy(int[] rummy) {

		for (int i = 0; i < rummy.length; i++) {

			rummy[i] = i;

		}

		return rummy;

	}

	public void showRummy(int[] rummy, String[] cardNumbers, String[] cardTypes, int cardNumQuantity) {
		// String cardTypes[] = { "heart", "spade", "diamond", "club" };
		// String cardNumbers[] = { "As", "2", "3", "4", "5", "6", "7", "8", "9",
		// "10", "J", "Q", "K" };
//		for (int i = 0; i < cardTypes.length; i++) {
//			for (int j = 0; j < cardNumbers.length; j++) {
//				
//				System.out.println(cardTypes[i] + " " + cardNumbers[j]);
//			}
//		}
		for (int i = 0; i < cardNumQuantity; i++) {
			int index = rummy[i] / 13;
			int cardIndex = rummy[i] % 13;
			String cardType = cardTypes[index];
			String cardNumber = cardNumbers[cardIndex];
			System.out.println(cardType + " " + cardNumber);
		}

	}

}
