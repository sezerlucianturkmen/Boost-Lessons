package com.Sezer20220614;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number..:");

		double num = scan.nextInt();

		while (num > 4)

			num = num / 5;

		if (num == 1)

			System.out.println("sayi 5 in kuvvetidir");

		else
			System.out.println("sayi 5 in kuvveti degildir");

	}
}
