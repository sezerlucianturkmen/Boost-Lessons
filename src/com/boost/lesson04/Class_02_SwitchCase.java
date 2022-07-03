package com.boost.lesson04;

import java.util.Scanner;

public class Class_02_SwitchCase {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("enter..:");
		int secim = scanner.nextInt();

		switch (secim) {
		case 1:
			System.out.println("toplama");
			break;
		case 2:
			System.out.println("cıkarma");
			break;
		case 3:
			System.out.println("carpma");
			break;
		case 4:
			System.out.println("bolme");
			break;
		case 5:
			System.out.println("mod");
			break;
		default:
			System.out.println("CIKIS");
			break;

		}
	}

}
