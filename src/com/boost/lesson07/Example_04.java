package com.boost.lesson07;

import java.util.Scanner;

public class Example_04 {

	/*
	 * 
	 * System.out.println("==Hesap makinesi===\n"); System.out.println("1- Topla");
	 * System.out.println("2- Çıkar"); System.out.println("3- Çarp");
	 * System.out.println("4- Böl"); System.out.println("0- Çıkış");
	 * System.out.println("Bir işlem Seçiniz");
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		//
		Scanner scanner = new Scanner(System.in);
		int input = 0;

		do {
			System.out.println("==Hesap makinesi===\n");
			System.out.println("1- Topla");
			System.out.println("2- Çıkar");
			System.out.println("3- Çarp");
			System.out.println("4- Böl");
			System.out.println("5- Faktöriyel");
			System.out.println("6- Üs heseaplama");
			System.out.println("7- Asal Kontrolü");
			System.out.println("0- Çıkış");
			System.out.println("Bir işlem Seçiniz");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				topla();
				break;
			case 2:
				cıkar();
				break;
			case 3:
				carp();
				break;
			case 4:
				bolme();
				break;
			case 5:
				faktoriel();
				break;
			case 6:
				us();
				break;
			case 7:
				isPrime();
				break;

			case 0:
				System.out.println("Güle Güle ...");
				break;

			default:
				break;
			}

		} while (input != 0);

	}

	private static void isPrime() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen Bir sayı giriniz");
		int sayı = scanner.nextInt();

		boolean kontrol = true;
		if (sayı == 1) {

			kontrol = false;

		} else {
			for (int i = 2; i < sayı; i++) {
				if (sayı % i == 0) {

					kontrol = false;
					break;
				}

			}
		}

		if (kontrol) {

			System.out.println(sayı + " asaldır ");
		} else {
			System.out.println(sayı + " asal değildir ");
		}
	}

	private static void us() {
		Scanner scanner = new Scanner(System.in);

		int sayı;
		int us;

		int result = 1;

		System.out.println("Lütfen Bir sayı giriniz");
		sayı = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Lütfen ust sayısını giriniz");
		us = scanner.nextInt();
		scanner.nextLine();

		for (int i = us; i > 0; i--)
			result *= sayı;

		System.out.println(sayı + " üstü " + us + " = " + result);
	}

	private static void faktoriel() {
		Scanner scanner = new Scanner(System.in);

		int sayı;

		int faktoriel = 1;

		System.out.println("Lütfen Bir sayı giriniz");
		sayı = scanner.nextInt();
		scanner.nextLine();

		for (int i = sayı; i > 0; i--)
			faktoriel *= i;

		System.out.println("faktoriel=" + faktoriel);
	}

	private static void bolme() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayı;
		int count = 0;
		int bolum = 0;
		do {

			System.out.println("Lütfen Bir sayı giriniz");
			sayı = scanner.nextInt();
			count++;
			scanner.nextLine();
			if (count == 1) {
				bolum = sayı;
			} else {
				bolum /= sayı;

			}
			System.out.println(
					"İşlemi sonlandırmak için = tuşuna basın devam etmek için herhangi bir tuşa basabilirsiniz");

			input = scanner.nextLine();

		} while (!input.equals("="));
		System.out.println("bolum=" + bolum);
	}

	public static void carp() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayı;
		int carpim = 1;

		do {

			System.out.println("Lütfen Bir sayı giriniz");
			sayı = scanner.nextInt();
			scanner.nextLine();
			carpim *= sayı;
			System.out.println(
					"İşlemi sonlandırmak için = tuşuna basın devam etmek için herhangi bir tuşa basabilirsiniz");

			input = scanner.nextLine();
		} while (!input.equals("="));
		System.out.println("carpim=" + carpim);
	}

	private static void cıkar() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayı;
		int count = 0;
		int toplam = 0;
		do {

			System.out.println("Lütfen Bir sayı giriniz");
			sayı = scanner.nextInt();
			count++;
			scanner.nextLine();
			if (count == 1) {
				toplam = sayı;
			} else {
				toplam -= sayı;

			}
			System.out.println(
					"İşlemi sonlandırmak için = tuşuna basın devam etmek için herhangi bir tuşa basabilirsiniz");

			input = scanner.nextLine();

		} while (!input.equals("="));
		System.out.println("toplam=" + toplam);
	}

	public static void topla() {
		Scanner scanner = new Scanner(System.in);
		String input = "";
		int sayı;
		int toplam = 0;

		do {

			System.out.println("Lütfen Bir sayı giriniz");
			sayı = scanner.nextInt();
			scanner.nextLine();
			toplam += sayı;
			System.out.println(
					"İşlemi sonlandırmak için = tuşuna basın devam etmek için herhangi bir tuşa basabilirsiniz");

			input = scanner.nextLine();
		} while (!input.equals("="));
		System.out.println("toplam=" + toplam);
	}

}