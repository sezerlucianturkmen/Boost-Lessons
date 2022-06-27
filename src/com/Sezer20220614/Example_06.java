package com.Sezer20220614;

import java.util.Scanner;

public class Example_06 {

	public static void main(String[] args) {
		// Menü
//		
//
//		1 Eğer boşluk varsa  ilk boşluktan stringin sonuna kadar olan kısmı başka bir değişkene atayın 
//		Ve dışardan bir string girip onunla birleştirin.
//		2 İçinde kaç tane a ve olduğunu bulunuz 

//		3-2.sorunun farklı yolla çözümü
//		4-

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a sentence..");
		String value = scanner.nextLine();
		value = value.trim();

		System.out.println("====MENU====");
		System.out.println("1- Divide at the gap");
		System.out.println("2- Quantity of the letter");
		System.out.println("Which operation would you like to do?");
		int input = scanner.nextInt();

		scanner.nextLine();
		switch (input) {
		case 1:

			// int check = value.indexOf(" ");
			// if (check != -1) {
			if (value.contains(" ")) {

				String value2;
				value2 = value.substring(value.indexOf(" ") + 1, value.length());
				System.out.println("Enter what you want to add more");
				value2 += " " + scanner.nextLine();
				System.out.println(value2);

			}

			break;

		case 2:
			int count = 0;
			for (int i = 0; i < value.length(); i++) {
				if (value.charAt(i) == 'a' || value.charAt(i) == 'A') {

					count++;

				}

			}
			System.out.println("There are " + count + " A in the sentence");

			break;
		case 3:
			int index = 0, sayac = 0;
			while (index != -1) {
				int ind = value.indexOf("a", index);
				index = ind == -1 ? -1 : ind + 1;
				if (ind != -1) {
					sayac++;
				}

			}
			System.out.println(sayac);

			break;

		default:
			break;
		}

	}

}
