package com.boost.lesson19_Soccer;

public class Runner {

	public static void main(String[] args) {
		Team team1 = new Team("team 01");

		for (Player player : team1.players) {

			team1.getPlayers().forEach(s -> System.out.println(s.scorePass() + "-" + s.pushPass()));

		}
	}

}
