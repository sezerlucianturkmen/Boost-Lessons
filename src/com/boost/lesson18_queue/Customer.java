package com.boost.lesson18_queue;

public class Customer implements Comparable<Customer> {

	private String name;

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + "]";
	}

	private int age;

	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Customer customer) {
		if (65 < customer.age) {
			return 1;

		} else {

			return -1;
		}
	}

}
