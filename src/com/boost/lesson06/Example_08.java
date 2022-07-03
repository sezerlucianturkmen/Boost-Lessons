package com.boost.lesson06;

import java.util.Scanner;

public class Example_08 {

	public static void main(String[] args) {
		// Türkçe karakterleri İngilizce karaktere çevirme

		String[] ingilizceKarakter = { "I", "i", "s", "S", "c", "C", "g", "G", "u", "U", "o", "O" };
		String[] turkceKarakter = { "İ", "ı", "ş", "Ş", "ç", "Ç", "ğ", "Ğ", "ü", "Ü", "ö", "Ö" };

		Scanner scanner = new Scanner(System.in);
		String metin = scanner.nextLine();

		for (int i = 0; i < turkceKarakter.length; i++) {

			metin = metin.replace(turkceKarakter[i], ingilizceKarakter[i]);

		}

		System.out.println(metin);

	}

	// Bir dizi içerisinde tekrar eden elemanların kaç kere tekrar ettiğini bulalım

}
