package com.boost.lesson04;

import java.util.Scanner;

public class Example_03 {

	public static void main(String[] args) {

		int i = 1;
		int num;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		Scanner scan = new Scanner(System.in);

		while (i <= 5) {

			System.out.println("Enter any number..:");
			num = scan.nextInt();

			if (num <= 100 && num >= 0) {

				if (num >= max) {
					max = num;
				}

				if (num <= min) {
					min = num;

				}
				i++;
			}

			else {
				System.out.println("enter new number btw 0-100");
			}

		}
		System.out.println("max" + max);
		System.out.println("min" + min);

	}

}
