package com.boost.lesson05;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Class_01_Example01 {

	/*
	 * Burc Yorumu 1-sitenini içeriğini almak 2-gelen içeriği satır satır okutmak
	 * 3-ilgili yorumlaı bulabilmek için aktif Ay in bulunduğu satırı tespit et
	 * 
	 * 
	 */

	public static void main(String[] args) throws MalformedURLException, IOException {

		String ay = "Haziran";

		Scanner scannerSite = new Scanner(new URL("https://www.elle.com.tr/astroloji/akrep").openStream(), "UTF-8");
		// Bu parametre bir URL adresinden siteye ait bilgileri çeker.

		boolean flag = false;
		StringBuilder comments = new StringBuilder();
		while (scannerSite.hasNext()) {
			String row = scannerSite.nextLine();

			// contains ->bu değeri içeriyorsa true
			// charAt -> aradığın bir degerin konumu, integer
			// split -> özel bir belirtece göre parçalıyor, dizi dönüyor.

			if (row.contains(ay.toLowerCase()))
				flag = true;
			if (row.contains("<p>") && flag) {
				comments.append(row.replace("&rsquo;", "'").replace("<p>", " ").replace("<br>", " ") + "~");
				flag = false;
			}

		} // While ends

		// String dizisi -> önceden boyutlatını belirlemelisiniz.
		String[] list = comments.toString().split("~");
		System.out.println("Daily Zodiac sign comments: " + list[0]);
		System.out.println("the end");

	}
}
