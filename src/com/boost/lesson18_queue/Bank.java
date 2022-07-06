package com.boost.lesson18_queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Bank {

	public static void main(String[] args) {

		Customer customer;

		Queue<Customer> myCustomer = new PriorityQueue<Customer>();

		myCustomer.offer(new Customer("John", 67));
		myCustomer.offer(new Customer("Ahmet", 17));
		myCustomer.offer(new Customer("Kate", 37));
		myCustomer.offer(new Customer("Lorenzo", 80));
		myCustomer.offer(new Customer("Melly", 45));
		myCustomer.offer(new Customer("Thalia", 17));
		myCustomer.offer(new Customer("Marcus", 37));

		while (myCustomer.isEmpty() == false) {

			System.out.println(myCustomer.poll());

		}

	}
}
