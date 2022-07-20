package com.boost.lesson19_Soccer;

import java.util.Random;

public abstract class Player implements IPlayer {

	String name;
	String surname;
	int number;
	int formNo;
	int durability;
	int speed;
	int pass;
	int shoot;
	int talent;
	int determination;
	int naturalForm;
	int luck;

	Random random = new Random();

	public Player(String name, int number, int formNo) {
		super();
		this.name = name;
		this.number = number;
		this.formNo = formNo;
		durability = random.nextInt(50) + 51;
		speed = random.nextInt(50) + 51;
		pass = random.nextInt(50) + 51;
		shoot = random.nextInt(50) + 51;
		talent = random.nextInt(50) + 51;
		determination = random.nextInt(50) + 51;
		naturalForm = random.nextInt(50) + 51;
		luck = random.nextInt(50) + 51;
	}

	public abstract int scorePass();

	@Override
	public boolean pushPass() {

		int score = scorePass();

		if (score <= 65) {
			return false;
		} else {
			return true;
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getFormNo() {
		return formNo;
	}

	public void setFormNo(int formNo) {
		this.formNo = formNo;
	}

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getPass() {
		return pass;
	}

	public void setPass(int pass) {
		this.pass = pass;
	}

	public int getShoot() {
		return shoot;
	}

	public void setShoot(int shoot) {
		this.shoot = shoot;
	}

	public int getTalent() {
		return talent;
	}

	public void setTalent(int talent) {
		this.talent = talent;
	}

	public int getDetermination() {
		return determination;
	}

	public void setDetermination(int determination) {
		this.determination = determination;
	}

	public int getNaturalForm() {
		return naturalForm;
	}

	public void setNaturalForm(int naturalForm) {
		this.naturalForm = naturalForm;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", surname=" + surname + ", number=" + number + ", formNo=" + formNo
				+ ", durability=" + durability + ", speed=" + speed + ", pass=" + pass + ", shoot=" + shoot
				+ ", talent=" + talent + ", determination=" + determination + ", naturalForm=" + naturalForm + ", luck="
				+ luck + "]";
	}

}
