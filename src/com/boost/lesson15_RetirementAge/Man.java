package com.boost.lesson15_RetirementAge;

public class Man extends Persons {

	public Man() {
		setRetirementAge(65);
		setGender(EGender.man);
	}

	public Man(String name, int birthYear) {
		super(name, birthYear);
		setBirthYear(65);
		setGender(EGender.man);
	}

}
