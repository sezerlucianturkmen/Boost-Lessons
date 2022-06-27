package com.Sezer20220615;

import java.util.Scanner;

public class hW_01 {

	public static void main(String[] args) {
		/**
		 * (kolay) 5 ile 7 nin toplamı nedir? (kolay) iki sayım var biri 9 diğeri 2
		 * bunların çarpımı nedir? (zor) iki sayı 124 ile 458 sayıların çarpımı nedir?
		 * 
		 * bunlar birer String ifadedir. Bunları kullanıcan alabiliriz. kolay olanlarda
		 * sadece rakamlar olacak (0..9) temel işlemler(topla,fark,çarp,böl)
		 * 
		 */

		boolean cal = true;
		System.out.println("****WELCOME****");
		System.out.println(" ");
		System.out.println("Please..Enter ! Which kind of calculation you would like make..");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();

		int select = 0;
		if (input.contains("topla")) {
			select = 1;
		} else if (input.contains("fark")) {
			select = 2;
		} else if (input.contains("carp")) {
			select = 3;
		} else if (input.contains("bol")) {
			select = 4;
		} else {
			System.out.println("please try again");
		}

		while (cal) {
			switch (select) {
			case 1 -> {

				int sum = 0; // TOPLAMA
				String numberPart = input.replaceAll("[^0-9]", "");

				int num1 = numberPart.charAt(0);
				int num2 = numberPart.charAt(1);

				sum = num1 + num2;
				System.out.println(numberPart.charAt(0) + " + " + numberPart.charAt(1));
				System.out.println(sum);
				cal = false;
			} // case 1 ends

			case 2 -> {

				int sub = 0; // CIKARMA
				String numberPart = input.replaceAll("[^0-9]", "");

				int num1 = numberPart.charAt(0);
				int num2 = numberPart.charAt(1);
				if (num1 > num2) {
					sub = num1 - num2;
					System.out.println(numberPart.charAt(0) + " - " + numberPart.charAt(1));
				} else {
					sub = num2 - num1;
					System.out.println(numberPart.charAt(1) + " - " + numberPart.charAt(0));
				}

				System.out.println(sub);
				cal = false;

			} // case 2 ends

			case 3 -> {

				int mul = 0; // CARPMA
				String numberPart = input.replaceAll("[^0-9]", "");

				int num1 = numberPart.charAt(0);
				int num2 = numberPart.charAt(1);

				mul = num1 * num2;
				System.out.println(numberPart.charAt(0) + " * " + numberPart.charAt(1));
				System.out.println(mul);
				cal = false;
			} // case 3 ends

			case 4 -> {

				int div = 0; // BOLME
				String numberPart = input.replaceAll("[^0-9]", "");

				int num1 = numberPart.charAt(0);
				int num2 = numberPart.charAt(1);
				if (num1 > num2) {
					div = num1 / num2;
					System.out.println(numberPart.charAt(0) + " / " + numberPart.charAt(1));
				} else {
					div = num2 / num1;
					System.out.println(numberPart.charAt(1) + " / " + numberPart.charAt(0));
				}

				System.out.println(div);
				cal = false;

			} // case 3 ends

			} // switch ends
		} // while ends
	}// main

}// class
