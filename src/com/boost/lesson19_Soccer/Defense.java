package com.boost.lesson19_Soccer;

public class Defense extends Player {

	int takePosition;
	int headShoot;
	int jump;

	public Defense(String name, int number, int formNo) {
		super(name, number, formNo);
		takePosition = random.nextInt(31) + 60;
		headShoot = random.nextInt(31) + 60;
		jump = random.nextInt(31) + 60;
	}

	@Override
	public int scorePass() {

		int bonus = random.nextInt(0, 4);
		int score = (int) ((getPass() * 0.2) + (getTalent() * 0.1) + (getNaturalForm() * 0.1)
				+ (getTakePosition() * 0.1) + (getLuck() * 0.2) + bonus);

		return score;
	}

	public int getTakePosition() {
		return takePosition;
	}

	public void setTakePosition(int takePosition) {
		this.takePosition = takePosition;
	}

	public int getHeadShoot() {
		return headShoot;
	}

	public void setHeadShoot(int headShoot) {
		this.headShoot = headShoot;
	}

	public int getJump() {
		return jump;
	}

	public void setJump(int jump) {
		this.jump = jump;
	}

	@Override
	public String toString() {
		return "Defense [name=" + name + ", surname=" + surname + ", number=" + number + ", formNo=" + formNo
				+ ", durability=" + durability + ", speed=" + speed + ", pass=" + pass + ", shoot=" + shoot
				+ ", talent=" + talent + ", determination=" + determination + ", naturalForm=" + naturalForm + ", luck="
				+ luck + ", takePosition=" + takePosition + ", headShoot=" + headShoot + ", jump=" + jump + "]";
	}

}
