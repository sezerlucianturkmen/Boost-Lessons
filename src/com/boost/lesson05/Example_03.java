package com.boost.lesson05;

public class Example_03 {

	public static void main(String[] args) {
		// dizide en büyük ve en küçük öğeyi bulma

		int[] sayilar = { 0, 120, 5, 85, -256, 16, 1258, 81, 14 };

		int min = sayilar[0];
		int max = sayilar[0];

		for (int i = 0; i < sayilar.length; i++) {

			if (sayilar[i] < min) {
				min = sayilar[i];

			}
			if (sayilar[i] > max) {
				max = sayilar[i];

			}

		}

		System.out.println("max=" + max + " " + "min=" + min);

	}

}
