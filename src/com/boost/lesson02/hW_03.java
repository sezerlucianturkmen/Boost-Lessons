package com.boost.lesson02;

import java.util.Scanner;

public class hW_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter any number..:");

		int number = scan.nextInt();

		int x;
		int flag = 1;

		do {
			x = (number % 10);
			System.out.println(flag + "'ler basamagi..:" + x);
			flag *= 10;
			number /= 10;

		}

		while (number != 0);
	}

}
