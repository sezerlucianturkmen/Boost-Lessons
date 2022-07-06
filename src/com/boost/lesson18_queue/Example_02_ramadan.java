package com.boost.lesson18_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Example_02_ramadan {

	public static void main(String[] args) {

		Queue<String> customers = new LinkedList<String>();
		customers = queueCustomer();
		int pide = pideQuantity();

		do {
			String person = customers.poll();
			pide--;
			System.out.println(person + " bought a pide");

		} while (pide != 0);

		if (pide == 0 && customers.isEmpty() == false) {
			System.out.println("pides run out.. sorry");
			System.out.println("Guys without pides..:" + customers);
		} else {
			System.out.println("Great...everyone has a pide..");

		}
	}

	public static int pideQuantity() {
		Random random = new Random();
		int pide = 1 + random.nextInt(10);
		return pide;
	}

	public static Queue<String> queueCustomer() {
		Queue<String> customers = new LinkedList<String>();
		customers.offer("John");
		customers.offer("Ali");
		customers.offer("Kate");
		customers.offer("Henry");
		customers.offer("Jean");
		customers.offer("Mohammed");
		customers.offer("Luc");
		customers.offer("Zeynep");
		customers.offer("Gianni");
		customers.offer("Lorenzo");
		customers.offer("Mehmet");
		customers.offer("Sibel");
		return customers;
	}

}
