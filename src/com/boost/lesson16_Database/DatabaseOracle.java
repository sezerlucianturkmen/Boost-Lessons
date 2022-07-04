package com.boost.lesson16_Database;

public class DatabaseOracle extends Database implements IDatabase {

	public void yazdır() {
		System.out.println("Print Method");
	}

	@Override
	public void add() {
		System.out.println("->on Oracle database, it has been added ");

	}

	@Override
	public void delete() {
		System.out.println("-> on Oracle database, it has been deleted ");

	}

	@Override
	public void get() {
		System.out.println("-> on Oracle database, it has been retaken ");

	}

	@Override
	public void update() {
		System.out.println("->on Oracle database, it has been updated ");

	}

	@Override
	public void login() {
		System.out.println("->on Oracle database, it has been connected ");

	}

}
