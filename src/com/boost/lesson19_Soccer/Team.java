package com.boost.lesson19_Soccer;

import java.util.ArrayList;
import java.util.List;

public class Team {

	String name;
	List<Player> players;
	GoalKeeper goalKeeper;

	public Team(String name) {
		super();
		this.name = name;
		players = new ArrayList<Player>();
		makedefense();
		makeMidFielder();
		makeStriker();
		goalKeeper = new GoalKeeper("GoalKeeper", 1, 20);

	}

	public void makedefense() {
		for (int i = 0; i < 4; i++) {

			Defense defense = new Defense("Defense", i + 1, i + 2);
			players.add(defense);
		}
	}

	public void makeMidFielder() {
		for (int i = 0; i < 2; i++) {

			MidFielder midFielder = new MidFielder("Midfielder", i + 1, i + 6);
			players.add(midFielder);
		}
	}

	public void makeStriker() {
		for (int i = 0; i < 2; i++) {

			Striker striker = new Striker("Striker", i + 1, i + 10);
			players.add(striker);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public List<Player> getPlayers() {
		return players;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "Team [name=" + name + ", players="
				+ (players != null ? players.subList(0, Math.min(players.size(), maxLen)) : null) + "]";
	}

}
