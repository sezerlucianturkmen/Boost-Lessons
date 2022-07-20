package com.boost.lesson21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class LuckyNumbers {

	public static final int maxNumber = 100;
	public static final int quantityNumber = 10000;

	Map<Integer, Integer> numbersMap;
	List<Integer> numberList;
	Set<Integer> luckyNumbers;

	public static void main(String[] args) {

		LuckyNumbers luckyNumbers = new LuckyNumbers();
		luckyNumbers.makeMap();
		luckyNumbers.addList();
		luckyNumbers.makeSet();

		System.out.println("Numbers >50");
		luckyNumbers.luckyNumbers.stream().filter(x -> x > 50).forEach(System.out::println);
		System.out.println("Sum of numbers");
		System.out.println(luckyNumbers.luckyNumbers.stream().reduce((s1, s2) -> s1 + s2).get());
		System.out.println("sum of numbers>50");
		Optional<Integer> sum = luckyNumbers.luckyNumbers.stream().filter(s -> s > 50)
				.reduce((num1, num2) -> num1 + num2);
		System.out.println(sum.get());
	}

	public LuckyNumbers() {
		super();
		this.numbersMap = new HashMap<Integer, Integer>();
		this.numberList = new ArrayList<Integer>();
		this.luckyNumbers = new TreeSet<Integer>();
	}

	public int pickNumber(int quantity) {
		Random random = new Random();
		return random.nextInt(quantity);
	}

	public void makeMap() {
		for (int i = 0; i < quantityNumber; i++) {

			int number = pickNumber(maxNumber) + 1;

			if (numbersMap.containsKey(number)) {
				numbersMap.replace(number, numbersMap.get(number) + 1);
			} else {
				numbersMap.put(number, 1);
			}
		}
		// luckyNumbers.entrySet().forEach(System.out::println);
	}

	public void addList() {
		for (Entry<Integer, Integer> numbers : numbersMap.entrySet()) {
			for (int i = 0; i < numbers.getValue(); i++) {
				numberList.add(numbers.getKey());
			}
		}
		// System.out.println(numberList.size());
	}

	public void makeSet() {
		Collections.shuffle(numberList);
		while (luckyNumbers.size() < 10) {

			int index = pickNumber(10);
			luckyNumbers.add(numberList.get(index));
		}
		luckyNumbers.forEach(System.out::println);
	}

}
