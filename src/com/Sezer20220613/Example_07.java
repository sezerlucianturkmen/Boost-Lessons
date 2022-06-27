package com.Sezer20220613;

public class Example_07 {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int n3;

		for (int i = 1; i <= 11; i++) {

			System.out.print(n1 + " ");
			n3 = n1 + n2;

			n1 = n2;
			n2 = n3;

		}

	}

}
