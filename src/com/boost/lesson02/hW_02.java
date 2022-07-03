package com.boost.lesson02;

import java.util.Scanner;

public class hW_02 {

	public static void main(String[] args) {

		int divider = 7;

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number..:");

		int number = scan.nextInt();

		while (divider <= number)

			number = number - divider;

		System.out.println(number);

	}

}
