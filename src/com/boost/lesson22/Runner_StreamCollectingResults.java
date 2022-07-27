package com.boost.lesson22;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner_StreamCollectingResults {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("Deniz", "Ahmet", "Büşra", "Zeynep", "Tülay", "Batu", "Hilal");
		String isimlerString = stream.collect(Collectors.joining(" ; "));
		System.out.println(isimlerString);

	}

}
