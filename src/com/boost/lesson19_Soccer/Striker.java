package com.boost.lesson19_Soccer;

public class Striker extends Player {

	int goalSkill;
	int firstTouch;
	int headShoot;
	int specialSkill;

	public Striker(String name, int number, int formNo) {
		super(name, number, formNo);
		goalSkill = random.nextInt(31) + 70;
		firstTouch = random.nextInt(31) + 70;
		headShoot = random.nextInt(31) + 70;
		specialSkill = random.nextInt(31) + 70;
	}

	public int getGoalSkill() {
		return goalSkill;
	}

	public void setGoalSkill(int goalSkill) {
		this.goalSkill = goalSkill;
	}

	public int getFirstTouch() {
		return firstTouch;
	}

	public void setFirstTouch(int firstTouch) {
		this.firstTouch = firstTouch;
	}

	public int getHeadShoot() {
		return headShoot;
	}

	public void setHeadShoot(int headShoot) {
		this.headShoot = headShoot;
	}

	public int getSpecialSkill() {
		return specialSkill;
	}

	public void setSpecialSkill(int specialSkill) {
		this.specialSkill = specialSkill;
	}

	@Override
	public String toString() {
		return "Striker [name=" + name + ", surname=" + surname + ", number=" + number + ", formNo=" + formNo
				+ ", durability=" + durability + ", speed=" + speed + ", pass=" + pass + ", shoot=" + shoot
				+ ", talent=" + talent + ", determination=" + determination + ", naturalForm=" + naturalForm + ", luck="
				+ luck + ", goalSkill=" + goalSkill + ", firstTouch=" + firstTouch + ", headShoot=" + headShoot
				+ ", specialSkill=" + specialSkill + "]";
	}

	@Override
	public int scorePass() {
		int bonus = random.nextInt(1, 5);
		int score = (int) ((getPass() * 0.2) + (getTalent() * 0.2) + (getSpecialSkill() * 0.2) + (getDurability() * 0.1)
				+ (getNaturalForm() * 0.1) + (getLuck() * 0.1) + bonus);
		return score;
	}

}
