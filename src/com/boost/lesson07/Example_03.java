package com.boost.lesson07;

import java.util.Scanner;

public class Example_03 {

	public static void main(String[] args) {

		int sum = 0;
		int count = 0;

		do {
			System.out.println("Please enter how many number do you want to sum..");
			count = number();
			if (count == 2) {
				sum = add(number(), number());
				System.out.println("sum  :" + sum);
				break;
			} else if (count == 3) {
				sum = add(number(), number(), number());
				System.out.println("sum  :" + sum);
				break;
			} else {
				System.out.println("Please make a proper selection");
			}
		} while (count != 2 || count != 3);
	}

	public static int number() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please enter any number..");

		int number = scanner.nextInt();
		return number;

	}

	public static int add(int a, int b) {

		int sum = a + b;

		return sum;
	}

	public static int add(int a, int b, int c) {
		int sum = a + b + c;
		return sum;
	}

}
