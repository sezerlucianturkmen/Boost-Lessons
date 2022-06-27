package com.Sezer20220615;

import java.util.Scanner;

public class Class_03_StringBuilder {

	public static void main(String[] args) {

		String word = "Hello, world!";
		Scanner scanner = new Scanner(System.in);

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello, world!");
		System.out.println("Enter");

		int number = scanner.nextInt();
		long start = System.currentTimeMillis(); // start and end ile geçen süre hesaplama
		for (int i = 0; i < number; i++) {
			stringBuilder.append(i);
		}
		long end = System.currentTimeMillis();
	}

}
