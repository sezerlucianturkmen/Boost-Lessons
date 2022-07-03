package com.boost.lesson08;

import java.util.Scanner;

public class Exmaple_03 {

	static String[] iller = { "Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", "Antalya", "Artvin", "Aydın",
			"Balıkesir", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum",
			"Denizli", "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun",
			"Gümüşhane", "Hakkari", "Hatay", "Isparta", "Mersin", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri",
			"Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Kahramanmaraş", "Mardin",
			"Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas",
			"Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
			"Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", "Iğdır", "Yalova", "Karabük",
			"Kilis", "Osmaniye", "Düzce" };
	// seçilen harf ile başlayan illeri yazdır..

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please pick the example..");
		int input = scanner.nextInt();
		scanner.nextLine();

		switch (input) {
		case (1) -> {
			System.out.println("Please enter any letter");
			String x = scanner.nextLine();
			case1(x);
		}
		case (2) -> case2();

		case (3) -> {
			System.out.println("Please enter any city name");
			String x = scanner.nextLine();
			case3(x);
		}

		case (4) -> case4();

		case (5) -> {
			String[] newArray = case4();
			case5(newArray);
		}

		case (6) -> case6(); // HOMEWORK 01

		case (7) -> case7();// HOMEWORK 02

		}// Switch ends
	}

	public static void case1(String x) {
		for (int i = 0; i < iller.length; i++) {
			if (iller[i].startsWith(x.toUpperCase().substring(0, 1))) {

				System.out.println(iller[i]);
			}
		}
	}

	public static void case2() {

		int flag = 00;
		for (int i = 0; i < iller.length; i++) {

			flag++;
			if (i < 10) {
				System.out.println("0" + flag + "-" + iller[i]);
			} else {
				System.out.println(flag + "-" + iller[i]);

			}
		}
	}

	public static void case3(String x) {

		int flag = 0;
		for (int i = 0; i < iller.length; i++) {

			flag++;
			if (iller[i].equalsIgnoreCase(x) && i < 10) {
				System.out.println("Plate number..: 0" + flag);
				break;
			} else if (iller[i].equalsIgnoreCase(x) && i > 10) {
				System.out.println("Plate number..: " + flag);
				break;

			}
		}
	}

	public static String[] case4() {

		String[] vowels = { "a", "e", "ı", "i", "o", "ö", "u", "ü" };
		String[] newArray = new String[iller.length];

		for (int i = 0; i < iller.length; i++) {

			for (int j = 0; j < vowels.length; j++) {
				if (iller[i].contains(vowels[j])) {
					iller[i] = iller[i].replaceAll(vowels[j], "");
				}

			}

			newArray[i] = iller[i];
		}
		return newArray;
	}

	public static void case5(String[] array) {

		for (int i = 0; i < array.length; i++) {

			if (array[i].length() > 2) {
				System.out.println(array[i].substring(0, 3) + "...");

			} else {
				System.out.println(array[i] + "...");
			}

		}

	}

	public static void case6() {

		String[] array = case4();

		int flag = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i].length() > 2 && array[i].contains("B")) {
				flag++;
				System.out.print(flag + "-" + array[i].substring(0, 3) + " , ");

			} else if (array[i].length() <= 2 && array[i].contains("B")) {
				flag++;
				System.out.print(flag + "-" + array[i] + " , ");
			}
		} // for ends

	}

	public static void case7() {

		for (int i = 0; i < iller.length; i++) {

			if (iller[i].substring(1, 2).contains("a")) {

				System.out.println(iller[i] + "->" + iller[i].substring(0, 3).toUpperCase());

			}
		} // for ends

	}

}