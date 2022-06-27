package com.Sezer20220615;

import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) {
		/*
		 * menu 1-Dışarıdan bir harf girilsin eğer kelimemizin içinde varsa kaç tane
		 * oldugunu ve index numaralarını yazdırın
		 * 
		 * 2-Girilen harfi değiştirme
		 * 
		 * 3-Ters yaz ve polindrom mu kontrol et.
		 * 
		 * 4-Dışarıdan 5 adet kelime girelim her kelimede a, b veya c ile başlayıp
		 * başlamadığımızı kontrol etsin (a, b,c ile başlayanlar için ayrı ayrı sayfa
		 * açıldığını düşünün elimizde) a lar bir sayfa b ler bir sayfa c ler birsayfa
		 * gibi düşünelim diğer harfle başlayanlar için ise ayrı bir sayfa düşünelim
		 * girilen5 adet kelimeyi kontrol ettikten sonra elimizde kaç sayfa oluğunu
		 * ekrana yazdıralım.
		 * 
		 * 
		 * 
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		boolean repeatMenu = true;
		String menuText = " ";
		String indexNo = " ";

		while (repeatMenu) {

			System.out.println("");
			System.out.println("****MENU****");
			System.out.println("1=Letter Counting");
			System.out.println("2=**");
			System.out.println("3=**");
			System.out.println("4=**");
			System.out.println("0=EXIT");

			System.out.println(menuText);
			int input = scanner.nextInt();
			scanner.nextLine();
			switch (input) {

			case 1 -> {

				int count = 0;
				System.out.println("enter any word");
				String word = scanner.nextLine();

				if (!word.contains("a")) {

					System.out.println("The letter is not exist");
					break;
				}

				for (int i = 0; i < word.length(); i++) {

					if (word.charAt(i) == 'a') {
						count++;
						indexNo += i + ",";
					}

				}

				System.out.println("there are " + count + "a letters");
				System.out.println("indexs are " + indexNo);

			} // case 1 ends

			case 2 -> {

				System.out.println("enter any word");
				String word = scanner.nextLine();

				System.out.println("enter the letter you wish to change");
				String letterChange = scanner.nextLine();

				System.out.println("enter the letter you wish to replace");
				String letterNew = scanner.nextLine();

				String newWord = word.replace(letterChange, letterNew);

				System.out.println(newWord);
				break;

			} // case 2 ends

			case 3 -> {

				System.out.println("enter any word");
				String wordReverse = scanner.nextLine();
				String wordReversed = " ";

				for (int i = wordReverse.length() - 1; i >= 0; i--) {

					wordReversed += wordReverse.charAt(i);

					System.out.print(wordReversed);

					if (wordReverse.equalsIgnoreCase(wordReversed)) {
						System.out.println("the word is polyndrom");
					} else {
						System.out.println("the word is not polyndrom");
					}

				} // for ends

			} // case 3 ends

			case 4 -> {

				String page = " ";

				for (int k = 1; k <= 5; k++) {

					System.out.println("enter any word..");
					String wordOfFive = scanner.nextLine();

					if (wordOfFive.startsWith("a") || wordOfFive.startsWith("A")) {
						if (!wordOfFive.contains("a")) {
							page += "a";
						}
					} // if ends

					else if (wordOfFive.startsWith("b") || wordOfFive.startsWith("B")) {
						if (!wordOfFive.contains("b")) {
							page += "b";
						}
					} // if ends

					else if (wordOfFive.startsWith("c") || wordOfFive.startsWith("C")) {
						if (!wordOfFive.contains("c")) {
							page += "c";
						}
					} // if ends
					else {
						if (!wordOfFive.contains("x")) {
							page += "x";
						}

					}

				} // for ends
				System.out.println(page.length());
			} // case 4 ends

			case 0 -> {
				repeatMenu = false;

			}

			}

		}

	}

}
