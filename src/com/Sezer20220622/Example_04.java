package com.Sezer20220622;

public class Example_04 {

	// Bir dizide ki sıralı 3 elamanın her birinin arasında ki fark 1 ise true
	// yazdıran değil ise false yazdıran

	public static void main(String[] args) {

		int[] nums = { 10, 7, 5, 6, 7, 8, 20, 5 };
		Example_04 example_04 = new Example_04();
		System.out.println(example_04.ardısıkSayilariBul(nums));

	}

	public boolean ardısıkSayilariBul(int[] sayilar) {

		boolean kontrol = false;

		for (int i = 0; i < sayilar.length - 2; i++) {

			if (sayilar[i] + 1 == sayilar[i + 1] && sayilar[i] + 2 == sayilar[i + 2]) {

				kontrol = true;
				break;
			}

		}
		return kontrol;

	}

}
