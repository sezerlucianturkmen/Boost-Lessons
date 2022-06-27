package com.Sezer20220615;

import java.util.Scanner;

public class Example_01 {

	public static void main(String[] args) {
		// Dışarıdan bir kelime girin her harfi başına index numarası kullanarak alt
		// alta yazdırın

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter any word..");
		String word = scanner.nextLine(); // kelimeler için bunu kullandık.

		for (int i = 0; i < word.length(); i++) {

			System.out.println(i + " " + word.charAt(i));

		}

	}

}
