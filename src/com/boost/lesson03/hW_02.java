package com.boost.lesson03;

import java.util.Scanner;

public class hW_02 {

	public static void main(String[] args) {
		/**
		 * kullanıcı istediği uzunlukta bir değer girebilir ve kare ona göre
		 * çizilir.(tek sayı)
		 * 
		 * . . . . . . . . . . . . * . . . . . . . . . . . .
		 * 
		 * 8 4 6 hareket için bu rakamları kullanın 2
		 * 
		 * 
		 * asla haraket kesilmeyecek. yıldız karenin sınırına ulaştığıda başa döner.
		 * 
		 * 
		 * 
		 * 
		 */

		boolean go = true;
		int flag = 0;
		String x = ".";
		String y = "*";
		System.out.println("****WELCOME****");
		System.out.println(" ");
		System.out.println("Please..Enter a number..");

		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int size = input;

		for (int i = 1; i <= size; i++) {

			for (int j = 1; j <= size; j++) {
				if (i == (size / 2) + 1 && j == (size / 2) + 1)
					System.out.print(y);
				else {
					System.out.print(x);
				}
			}
			System.out.println(" ");
		} // for ends
		while (go) {
			System.out.println(" ");
			System.out.println("4 'left'  -   6 'right'  -  2'up'  -  8'down' ");
			int direction = scanner.nextInt();

			flag++;
			System.out.println(flag);
			switch (direction) {

			case 4 -> {

				for (int i = 1; i <= size; i++) {

					for (int j = 1; j <= size; j++) {

						if (i == (size / 2) + 1 && j == (size / 2) - flag)
							System.out.print(y);
						else {
							System.out.print(x);
						}
					}
					System.out.println(" ");
					go = true;
				}
			} // case ends

			case 6 -> {
				for (int i = 1; i <= size; i++) {

					for (int j = 1; j <= size; j++) {

						if (i == (size / 2) + 1 && j == (size / 2) + flag)
							System.out.print(y);
						else {
							System.out.print(x);
						}
					}
					System.out.println(" ");
					go = true;
				}

			} // case ends

			case 2 -> {
				for (int i = 1; i <= size; i++) {

					for (int j = 1; j <= size; j++) {

						if (i == (size / 2) - flag && j == (size / 2) + 1)
							System.out.print(y);
						else {
							System.out.print(x);
						}
					}
					System.out.println(" ");
					go = true;
				}

			} // case ends

			case 8 -> {
				for (int i = 1; i <= size; i++) {

					for (int j = 1; j <= size; j++) {

						if (i == (size / 2) + flag && j == (size / 2) + 1)
							System.out.print(y);
						else {
							System.out.print(x);
						}
					}
					System.out.println(" ");
					go = true;
				}

			} // case ends

			default -> {
			}
			}// switch ends
		}
	}

}
