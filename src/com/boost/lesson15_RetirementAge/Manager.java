package com.boost.lesson15_RetirementAge;

import java.util.Scanner;

public class Manager {

	Persons[] persons;

	public Manager() {
		persons = new Persons[2];
	}

	public void register() {

		for (int i = 0; i < persons.length; i++) {

			persons[i] = selectGender();
		}
	}

	public void printInformation() {

		for (Persons person : persons) {
			System.out.println("====Personal Information====");
			System.out.println("------------------");
			System.out.println(person);
			System.out.println("------------------");
		}

	}

	public Persons enterInformation(Persons person) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name..");
		person.setName(scanner.nextLine());
		System.out.println("Enter the birth year");
		person.setBirthYear(scanner.nextInt());
		return person;

	}

	public Persons selectGender() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-Male");
		System.out.println("2-Female");
		System.out.println("Please enter any selection");
		int input = scanner.nextInt();
		scanner.nextLine();

		switch (input) {
		case 1:
			Man man = new Man();
			return enterInformation(man);

		case 2:
			Woman woman = new Woman();
			return enterInformation(woman);

		default:
			break;
		}
		return null;
	}
}
