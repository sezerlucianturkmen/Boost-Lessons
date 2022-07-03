package com.boost.lesson06;

import java.util.Scanner;

public class hW_01 {

	public static void main(String[] args) {

		boolean odd = false;
		int diagonal = 0;
		int one = 1;
		int input;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Please enter any odd number...");
			input = scanner.nextInt();
			if (input % 2 == 0) {
				System.out.println("Please be sure you enter an odd number,try again");
				odd = false;
			} // if ends
			else {
				odd = true;
				break;

			} // else ends
		} // do ends
		while (odd = true);

		diagonal = (input + 1) / 2;
		System.out.println("Please define row number...");
		int row = scanner.nextInt();
		System.out.println("Please define column number...");
		int column = scanner.nextInt();

		int matrix[][] = new int[row][column];

		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j)
					matrix[i][j] = diagonal;
				else if (i < j)
					matrix[i][j] = input;
				else
					matrix[i][j] = one;
				System.out.print(matrix[i][j] + " ");
			} // inner for ends
		} // for ends

	}

}
