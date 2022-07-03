package com.boost.lesson02;

import java.util.Scanner;

public class Example_02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("sayi giriniz..:");

		int number = scan.nextInt();
		int carpim = 1;

		for (int i = 1; i < 10; i++)

			System.out.println(number + "x" + i + "=" + (number * i));

	}

}
