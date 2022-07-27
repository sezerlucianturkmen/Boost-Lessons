package com.boost.lesson22;

import java.util.TreeSet;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Class01_stream {

	public static void main(String[] args) {

		Stream<Integer> bosListe = Stream.of(null);
		Stream<Integer> tekElemanliListe = Stream.of(1);
		Stream<Integer> cokElemanliListe = Stream.of(1, 5, 9);

		BinaryOperator<Integer> opr = (a, b) -> a * b;
		bosListe.reduce(opr).ifPresent(System.out::println);
		tekElemanliListe.reduce(opr).ifPresent(System.out::println);
		// cokElemanliListe.reduce(opr).ifPresent(System.out::println);
		// Stream ile bir kere açılınca tekrar kullanırsa hata verir.
		cokElemanliListe.reduce(opr).ifPresent(result -> makeSquare(result));

		Stream<String> stream = Stream.of("Sunday", "Monday", "Tuesday");
		TreeSet<String> set = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);

	}

	public static void makeSquare(int number) {

		int square = number * number;
		System.out.println("the square of " + number + " is " + square);
	}
}
