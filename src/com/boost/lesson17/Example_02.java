package com.boost.lesson17;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example_02 {

	public static void main(String[] args) {
		List<Integer> oddNumbers = new ArrayList<Integer>();
		List<Integer> evenNumbers = new ArrayList<Integer>();

		int count = 0;

		do {

			int number = pickRandom();
			count++;

			if (number % 2 == 0) {
				evenNumbers.add(number);
			} else {
				oddNumbers.add(number);
			}

		} while (count <= 35);

		System.out.println(oddNumbers);
		System.out.println(evenNumbers);

	}

	public static int pickRandom() {

		Random random = new Random();
		int randomNumber = random.nextInt(1000);
		return randomNumber;
	}

}
