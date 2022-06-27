package com.Sezer20220613;

import java.util.Scanner;

public class Example_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("sayi giriniz..:");

		int number = scan.nextInt();

		int sum = 0;

		do {
			sum = (number % 10) + sum;
			number /= 10;
		}

		while (number != 0);

		System.out.println("basamak toplamı:" + sum);
	}

}
