package com.boost.lesson21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequency {

	static Scanner scanner = new Scanner(System.in);

	public static String takeString() {

		System.out.println("Please enter any text..");
		String text = scanner.nextLine();
		return text;

	}

	public static void main(String[] args) {

		Map<Character, Integer> frequencyMap = new HashMap<Character, Integer>();

		String text = takeString();

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);

			if (frequencyMap.containsKey(c)) {
				frequencyMap.replace(c, frequencyMap.get(c) + 1);
			} else {
				frequencyMap.put(c, 1);
			}

		}
		System.out.println(frequencyMap);
		frequencyMap.entrySet().forEach(System.out::println);
	}
}
