package com.boost.lesson15_RetirementAge;

import java.time.LocalDateTime;

public class Persons implements IRetirement {

	private String name;
	private int birthYear;
	private EGender gender;
	private int retirementAge;

	public Persons() {

	}

	public Persons(String name, int birthYear) {
		super();
		this.name = name;
		this.birthYear = birthYear;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public EGender getGender() {
		return gender;
	}

	public void setGender(EGender gender) {
		this.gender = gender;
	}

	public int getRetirementAge() {
		return retirementAge;
	}

	public void setRetirementAge(int retirementAge) {
		this.retirementAge = retirementAge;
	}

	@Override
	public int calculateAge() {

		LocalDateTime dateTime = LocalDateTime.now();
		int year = dateTime.getYear();

		return year - birthYear;
	}

	@Override
	public int howManyYears() {

		return getRetirementAge() - calculateAge();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "/nbirthYear=" + birthYear + "/ngender=" + gender + "/nretirementAge="
				+ retirementAge + "/ncalculateAge()=" + calculateAge() + "/nhowManyYears()=" + howManyYears() + "]";
	}

}
