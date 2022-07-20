package com.boost.lesson21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

public class LuckyNumbers {

	public static final int maxNumber = 100;
	public static final int quantityNumber = 10000;

	Map<Integer, Integer> luckyNumbers;
	List<Integer> numberList;
	Set<Integer> setNumbers;

	public static void main(String[] args) {

		LuckyNumbers luckyNumbers = new LuckyNumbers();
		luckyNumbers.makeMap();
		luckyNumbers.addList();
		luckyNumbers.makeSet();

		System.out.println("Numbers >50");
		luckyNumbers.setNumbers.stream().filter(x -> x > 50).forEach(System.out::println);
		System.out.println("Sum of numbers");
		System.out.println(luckyNumbers.setNumbers.stream().reduce((s1, s2) -> s1 + s2).get());
		System.out.println("sum of numbers>50");
		Optional<Integer> sum = luckyNumbers.setNumbers.stream().filter(s -> s > 50)
				.reduce((num1, num2) -> num1 + num2);
		System.out.println(sum.get());
	}

	public Integer pickNumber() {
		Random random = new Random();
		Integer number = random.nextInt(1, 101);
		return number;
	}

	public Integer pickNumber(int quantity) {
		Random random = new Random();
		Integer number = random.nextInt(quantity);
		return number;
	}

	public LuckyNumbers() {
		super();
		this.luckyNumbers = new HashMap<Integer, Integer>();
		this.numberList = new ArrayList<Integer>();
		this.setNumbers = new HashSet<Integer>();
	}

	public void makeMap() {
		for (int i = 0; i < 10000; i++) {

			int number = pickNumber();

			if (luckyNumbers.containsKey(number)) {
				luckyNumbers.replace(number, luckyNumbers.get(number) + 1);
			} else {
				luckyNumbers.put(number, 1);
			}
		}
		// luckyNumbers.entrySet().forEach(System.out::println);
	}

	public void addList() {
		for (Entry<Integer, Integer> numbers : luckyNumbers.entrySet()) {
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
			setNumbers.add(numberList.get(index));
		}
		setNumbers.forEach(System.out::println);
	}

}
