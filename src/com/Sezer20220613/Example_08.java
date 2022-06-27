package com.Sezer20220613;

import java.util.Scanner;

public class Example_08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("sayi giriniz..:");
		int number;
		int sum = 0;
		int i = 0;

		do {
			number = scan.nextInt();
			sum = sum + number;
			i++;
		} while (number != 0);

		System.out.println(sum / (i - 1));

	}

}
