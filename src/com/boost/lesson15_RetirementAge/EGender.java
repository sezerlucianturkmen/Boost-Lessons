package com.boost.lesson15_RetirementAge;

public enum EGender {

	man(1, "Male"), woman(2, "Female");

	private int number;
	private String name;

	private EGender(int number, String name) {
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

}
