package com.Sezer20220614;

import java.util.Scanner;

public class hW_01 {

	public static void main(String[] args) {

		// // Ödev- Sayı bulmaca oyunu programı

		// 6 hakkınız vardır
		// Her tahminde 1 hakkınızı kaybedersiniz
		// Eğer hakkınız bitmişse kaybettiniz uyarısını ekrana yazdırın ve tekrar
		// oynamak isteyip istemediğini sorunuz
		//
		// Menümüz olsun
		// Hak Sayısı yazsın
		// Ve kaçıncı kez oynadığımız yazsın
		// Ve iki seçenek olsun
		// 1-oyuna başla
		// 2-sistemden çıkış
		// Her tahmin sonrası ekrana neler yazdırılabilir:
		// Kaç hakkınızın kaldığı
		// Eğer tutulan sayı ile tahmin ettiğiniz sayı arasındaki fark 10 ise
		// yaklaştınız arttırın yada azaltın ,
		// Eğer 10 dan fazla ise uzaksınız arttırın veya azaltın
		// Eğer tahmin doğru ise kaçıncı tahminde bildiğimizi ve sayı yı ekrana yazdırın

		Scanner scanner = new Scanner(System.in);
		int live = 6;
		int find = 125;
		boolean yes = true;

		while (live > 0) {

			System.out.println("****MENU****");
			System.out.println("live..: " + live);
			System.out.println("You have tried " + (6 - live) + " times...");
			System.out.println(" ");
			System.out.println("1-PLAY");
			System.out.println("2-EXIT");

			int input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {
			case 1 -> {

				System.out.println("Enter any number..:");
				int num = scanner.nextInt();
				scanner.nextLine();
				live--;

				if (live == 0) {
					System.out.println("Game over... Do you want to play again?(1-yes or 2-no)");
					int answer = scanner.nextInt();
					scanner.nextLine();

					switch (answer) {
					case 1 -> live = 6;
					case 2 -> System.out.println("Thank you, see you later");
					}
				} // if ends

				else if (num == 125) {
					System.out.println("Congratulations! you found the number 125 ");
					System.out.println("You found the correct number after " + (6 - live) + " times trial.");

				} // else if ends

				else {
					System.out.println("Live " + live);
					System.out.println("you have tried " + (6 - live) + " times more.");

					if (num < find && find - num <= 10) {
						System.out.println("almost there..");
					} // if ends
					else if (num > find && num - find <= 10) {
						System.out.println("almost there..Just some numbers more or less");
					} // else if ends
					else {
						System.out.println("quite far, please increase or decrease your guess more..");
					}

				} // else ends

			}

			case 2 -> {
				System.out.println("Thank you, see you later");
			} // case 2 ends

			}
		}
	}
}
