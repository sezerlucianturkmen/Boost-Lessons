package com.Sezer20220614;

import java.util.Scanner;

public class Example_05 {

	public static void main(String[] args) {
		// Dışarıdan ay ve gün değerini ayrı ayrı bir sayı olarak alacaksınız buna göre
		// burc hesabı yapan program

		// Koç Burcu : 21 Mart - 20 Nisan
		//
		// Boğa Burcu : 21 Nisan - 21 Mayıs
		//
		// İkizler Burcu : 22 Mayıs - 22 Haziran
		//
		// Yengeç Burcu : 23 Haziran - 22 Temmuz
		//
		// Aslan Burcu : 23 Temmuz - 22 Ağustos
		//
		// Başak Burcu : 23 Ağustos - 22 Eylül
		//
		// Terazi Burcu : 23 Eylül - 22 Ekim
		//
		// Akrep Burcu : 23 Ekim - 21 Kasım
		//
		// Yay Burcu : 22 Kasım - 21 Aralık
		//
		// Oğlak Burcu : 22 Aralık - 21 Ocak
		// Kova Burcu : 22 Ocak - 19 Şubat
		//
		// Balık Burcu : 20 Şubat - 20 Mart

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your day");

		int day = scanner.nextInt();
		System.out.println("Please enter your month");
		int month = scanner.nextInt();

		switch (month) {
		case 1:
			if (day >= 1 && day <= 21) {
				System.out.println("Capricorn");
			} else {
				System.out.println("Aquaries");
			}

			break;
		case 2:
			if (day >= 1 && day <= 19) {
				System.out.println("Aquaries");
			} else {
				System.out.println("Pisces");
			}

			break;
		case 3:
			if (day >= 1 && day <= 20) {
				System.out.println("Pisces");
			} else {
				System.out.println("Aries");
			}
			break;
		case 4:
			if (day >= 1 && day <= 20) {
				System.out.println("Aries");
			} else {
				System.out.println("Taurus");
			}
			break;
		case 5:
			if (day >= 1 && day <= 21) {
				System.out.println("Taurus");
			} else {
				System.out.println("Gemini");
			}
			break;
		case 6:
			if (day >= 1 && day <= 22) {
				System.out.println("Gemini");
			} else {
				System.out.println("Cancer");
			}
			break;
		case 7:
			if (day >= 1 && day <= 23) {
				System.out.println("Cancer");
			} else {
				System.out.println("Leo");
			}
			break;
		case 8:
			if (day >= 1 && day <= 22) {
				System.out.println("Leo");
			} else {
				System.out.println("Virgo");
			}
			break;
		case 9:
			if (day >= 1 && day <= 22) {
				System.out.println("Virgo");
			} else {
				System.out.println("Libra");
			}
			break;
		case 10:
			if (day >= 1 && day <= 22) {
				System.out.println("Libra");
			} else {
				System.out.println("Scorpio");
			}
			break;
		case 11:
			if (day >= 1 && day <= 21) {
				System.out.println("Scorpio");
			} else {
				System.out.println("Sagitarius");
			}
			break;
		case 12:
			if (day >= 1 && day <= 21) {
				System.out.println("Sagitarius");
			} else {
				System.out.println("Capricorn");
			}
			break;

		default:

			break;
		}
	}

}
