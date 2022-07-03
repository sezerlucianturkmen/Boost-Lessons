package com.boost.lesson02;

import java.util.Scanner;

public class hW_01 {

	public static void main(String[] args) {

		boolean isPrime = true;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number..:");

		int number = scan.nextInt();

		if (number < 2) {
			isPrime = true;
		}

		for (int i = 2; i < number; i++) {

			if (number % i == 0) {
				isPrime = false;
				break;
			}

		}

		if (isPrime)
			System.out.println(number + "  " + "is  a prime number");
		else
			System.out.println(number + "  " + "is  a not prime number");

	}

}
