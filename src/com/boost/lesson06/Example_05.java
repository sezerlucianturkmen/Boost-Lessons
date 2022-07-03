package com.boost.lesson06;

public class Example_05 {

	/*
	 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3 katı
	 * ise bilge 5 ise adam hem3 ve hem 5 ise bilgeadam yazdıralım int start=2; int
	 * end=22; 1,2,bilge,4,adam,6.......14,bilgeadam
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int start = 2;
		int end = 22;

		String[] array = new String[end - start];

		for (int i = 0; i < array.length; i++) {

			int sayi = i + start;

			if (sayi % 15 == 0) {

				array[i] = "BilgeAdam";

			} else if (sayi % 3 == 0) {
				array[i] = "Bilge";

			} else if (sayi % 5 == 0) {

				array[i] = "Adam";
			} else {
				array[i] = sayi + "";
			}
		}
		System.out.print("[ ");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + ", ");
		}
		System.out.print(" ]");

	}

}
