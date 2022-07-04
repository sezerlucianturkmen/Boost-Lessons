package com.boost.lesson16_Database;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		DatabaseManager databaseManager;
		Scanner scanner = new Scanner(System.in);

		System.out.println("1-Mysql");
		System.out.println("2-Oracle");
		int determine = scanner.nextInt();

		switch (determine) {
		case 1:
			databaseManager = new DatabaseManager(new DatabaseMysql());
			databaseManager.database.login();

			databaseManager.menu();
			break;

		case 2:

			databaseManager = new DatabaseManager(new DatabaseOracle());
			databaseManager.database.login();
			databaseManager.menu();
			break;

		default:
			break;
		}

	}
}
