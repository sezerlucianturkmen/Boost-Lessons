package com.boost.lesson08;

import java.util.Scanner;

public class Example_01 {

	static int currentYear = 2022;

	public static void main(String[] args) {

		System.out.println("you are " + age() + " years old");
		System.out.println("you live in the " + century() + " century.");

	}

	public static int century() {
		int century = (currentYear / 100) + 1;
		return century;
	}

	public static int age() {
		System.out.println("Enter your date of year you borned");
		int x = number();
		int age = currentYear - x;
		return age;

	}

	public static int number() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please..");

		int number = scanner.nextInt();
		return number;

	}

}
