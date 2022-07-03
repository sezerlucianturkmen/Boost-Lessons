package com.boost.lesson02;

public class Example_09 {

	public static void main(String[] args) {

		double sumCift = 0;
		double sumTek = 0;

		for (int i = 1; i < 100; i++) {

			if (i % 2 == 0) {
				sumCift += i;
			} else {
				sumTek += i;
			}

		}

		System.out.println((sumCift / sumTek));

	}

}
