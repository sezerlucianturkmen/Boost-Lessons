package com.Sezer20220614;

import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number..:");

		int num = scan.nextInt();

		int sum = 0;

		for (int i = 1; i < num; i++) {

			if (num % i == 0)
				sum = sum + i;
		}
		if (sum == num) {
			System.out.println("mukemmeldir");
		} else
			System.out.println("mukemmel degıldir");

	}

}
