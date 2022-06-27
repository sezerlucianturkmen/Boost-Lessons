package com.Sezer20220621;

import java.util.Random;
import java.util.Scanner;

public class Exapmle_02 {

	public static void main(String[] args) {

		average();
	}

	public static void average() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please define the length of array");
		int y = scanner.nextInt();

		double[] array = new double[y];
		double sum = 0;
		int count = 0;
		double number;
		for (int i = 0; i < array.length; i++) {
			number = addRandom();
			array[i] = number;
			sum += number;
			count++;
		}
		System.out.println("Avarage..:" + sum / count);
	}

	public static double addRandom() {

		Random random = new Random();

		return random.nextInt(500);
	}

}
