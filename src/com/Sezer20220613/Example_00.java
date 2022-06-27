package com.Sezer20220613;

import java.util.Scanner;

public class Example_00 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();
		int f = 1;

		for (int i = number; i > 0; i--)
			f *= i;

		System.out.println("faktoriel..:" + f);

	}

}
