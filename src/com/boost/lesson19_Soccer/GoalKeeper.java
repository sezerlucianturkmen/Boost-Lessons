package com.boost.lesson19_Soccer;

public class GoalKeeper extends Player {

	int success;

	public GoalKeeper(String name, int number, int formNo) {
		super(name, number, formNo);
		success = random.nextInt(36) + 65;
	}

	public int getSuccess() {
		return success;
	}

	public void setSuccess(int success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "GoalKeeper [name=" + name + ", surname=" + surname + ", number=" + number + ", formNo=" + formNo
				+ ", durability=" + durability + ", speed=" + speed + ", pass=" + pass + ", shoot=" + shoot
				+ ", talent=" + talent + ", determination=" + determination + ", naturalForm=" + naturalForm + ", luck="
				+ luck + ", success=" + success + "]";
	}

	@Override
	public int scorePass() {
		// TODO Auto-generated method stub
		return 0;
	}

}
