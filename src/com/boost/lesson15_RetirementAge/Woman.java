package com.boost.lesson15_RetirementAge;

public class Woman extends Persons {

	public Woman() {
		setRetirementAge(60);
		setGender(EGender.woman);
	}

	public Woman(String name, int birthYear) {
		super(name, birthYear);
		setRetirementAge(60);
		setGender(EGender.woman);
	}

}
