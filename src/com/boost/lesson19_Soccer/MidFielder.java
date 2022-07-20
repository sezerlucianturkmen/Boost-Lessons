package com.boost.lesson19_Soccer;

public class MidFielder extends Player {

	int farShoot;
	int firstTouch;
	int driveBall;
	int productivity;
	int specialSkills;

	public MidFielder(String name, int number, int formNo) {
		super(name, number, formNo);
		farShoot = random.nextInt(41) + 60;
		firstTouch = random.nextInt(41) + 60;
		driveBall = random.nextInt(41) + 60;
		productivity = random.nextInt(41) + 60;
		specialSkills = random.nextInt(41) + 60;
	}

	public int getFarShoot() {
		return farShoot;
	}

	public void setFarShoot(int farShoot) {
		this.farShoot = farShoot;
	}

	public int getFirstTouch() {
		return firstTouch;
	}

	public void setFirstTouch(int firstTouch) {
		this.firstTouch = firstTouch;
	}

	public int getDriveBall() {
		return driveBall;
	}

	public void setDriveBall(int driveBall) {
		this.driveBall = driveBall;
	}

	public int getProductivity() {
		return productivity;
	}

	public void setProductivity(int productivity) {
		this.productivity = productivity;
	}

	public int getSpecialSkills() {
		return specialSkills;
	}

	public void setSpecialSkills(int specialSkills) {
		this.specialSkills = specialSkills;
	}

	@Override
	public String toString() {
		return "MidFielder [name=" + name + ", surname=" + surname + ", number=" + number + ", formNo=" + formNo
				+ ", durability=" + durability + ", speed=" + speed + ", pass=" + pass + ", shoot=" + shoot
				+ ", talent=" + talent + ", determination=" + determination + ", naturalForm=" + naturalForm + ", luck="
				+ luck + ", farShoot=" + farShoot + ", firstTouch=" + firstTouch + ", driveBall=" + driveBall
				+ ", productivity=" + productivity + ", specialSkills=" + specialSkills + "]";
	}

	@Override
	public int scorePass() {
		int bonus = random.nextInt(1, 7);
		int score = (int) ((getPass() * 0.2) + (getTalent() * 0.2) + (getSpecialSkills() * 0.2)
				+ (getDurability() * 0.1) + (getNaturalForm() * 0.1) + (getLuck() * 0.1) + bonus);
		return score;
	}

}
