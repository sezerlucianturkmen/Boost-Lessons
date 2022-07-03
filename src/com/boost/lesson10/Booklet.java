package com.boost.lesson10;

import java.util.Scanner;

public class Booklet {

	String[] booklet;
	Scanner scanner = new Scanner(System.in);
	int index = 0;

	public static void main(String[] args) {

		Booklet booklet = new Booklet();
		booklet.menu();

	}

	public void menu() {
		int input = 0;

		booklet = makeBooklet();

		do {
			System.out.println("---------------------");
			System.out.println("------BOOK SHOP------");
			System.out.println("---------------------");
			System.out.println("1-Add a new book");
			System.out.println("2-Look for a book");
			System.out.println("3-Look for an autor");
			System.out.println("4-List the books");
			System.out.println("5-List the autors");
			System.out.println("0-Exit");
			input = scanner.nextInt();
			scanner.nextLine();

			switch (input) {

			case (1) -> {
				addBook();
			}

			case (2) -> {
				bookLookFor();
			}

			case (3) -> {
				autorLookFor();
			}

			case (4) -> {
				listBooks();
			}

			case (5) -> {
				listAutors();
			}

			case (0) -> {
				System.out.println("See you later...");
			}

			}

		} while (input != 0);

	}

	public void listAutors() {

		if (booklet[0] == null) {
			System.out.println("There is no any book in the booklet");
		} else {
			for (int i = 0; i < booklet.length; i++) {
				if (booklet[i] != null) {
					System.out.println(booklet[i].substring(0, booklet[i].indexOf(",")));
				}
			}
		}
	}

	public void listBooks() {

		if (booklet[0] == null) {
			System.out.println("There is no any book in the booklet");
		} else {
			for (int i = 0; i < booklet.length; i++) {
				if (booklet[i] != null) {
					System.out.println(booklet[i].substring(booklet[i].indexOf(",") + 1));
				}
			}
		}
	}

	public void autorLookFor() {

		Boolean have = false;
		System.out.println("Please enter the name fo book");
		String autorLookFor = scanner.nextLine().trim().toUpperCase();

		for (int i = 0; i < booklet.length; i++) {
			if (booklet[i] != null) {

				if (booklet[i].contains(autorLookFor))
					have = true;
			}
		}

		if (have) {
			System.out.println("Yes.. we have in the library");
		} else {
			System.out.println("No.. we don't have any");
		}

	}

	public void bookLookFor() {

		Boolean have = false;
		System.out.println("Please enter the name fo book");
		String bookLookFor = scanner.nextLine().trim().toUpperCase();

		for (int i = 0; i < booklet.length; i++) {
			if (booklet[i] != null) {

				if (booklet[i].contains(bookLookFor))
					have = true;
			}
		}

		if (have) {
			System.out.println("Yes.. we have in the library");
		} else {
			System.out.println("No.. we don't have any");
		}

	}

	public void addBook() {

		if (index < booklet.length) {

			System.out.println("Please enter the Autor");
			String autor = scanner.nextLine().trim().toUpperCase();
			System.out.println("Please enter the name of book");
			String book = scanner.nextLine().trim().toUpperCase();

			booklet[index] = autor + "," + book;
			index++;

			for (String string : booklet) {
				System.out.println(string);
			}
			System.out.println("you can add " + (booklet.length - index) + " more books..");

		} else {
			System.out.println("your booklet is full..!");
		}

	}

	public String[] makeBooklet() {

		System.out.println("Please enter size of booklet");
		int number = scanner.nextInt();
		scanner.nextLine();
		booklet = new String[number];

		return booklet;
	}

}
