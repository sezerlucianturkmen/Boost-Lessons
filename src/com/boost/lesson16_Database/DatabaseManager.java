package com.boost.lesson16_Database;

import java.util.Scanner;

public class DatabaseManager {

	IDatabase database;// new MysqlDatabase

	public DatabaseManager(IDatabase database) {
		this.database = database;
	}

	public void menu() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("1- add data");
		System.out.println("2- delete data");
		System.out.println("3- get data");
		System.out.println("4- update data");
		int determine = scanner.nextInt();
		scanner.nextLine();

		switch (determine) {
		case 1:
			System.out.println("---------------------------");
			database.add();
			System.out.println("---------------------------");
			break;
		case 2:
			System.out.println("---------------------------");
			database.delete();
			System.out.println("---------------------------");
			break;
		case 3:
			System.out.println("---------------------------");
			database.get();
			System.out.println("---------------------------");
			break;
		case 4:
			System.out.println("---------------------------");
			database.update();
			System.out.println("---------------------------");
			break;

		default:
			break;
		}

	}

}
