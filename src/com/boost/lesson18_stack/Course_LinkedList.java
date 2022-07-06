package com.boost.lesson18_stack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Course_LinkedList {

	public static void main(String[] args) {

		List<String> myList;

		myList = new ArrayList<String>();
		myList.add("Monday");
		myList.add("Tuesday");
		myList.add("Wednesday");

		System.out.println(myList);

		myList = new LinkedList<String>();
		myList.add("Monday");
		myList.add("Tuesday");
		myList.add("Wednesday");

		System.out.println(myList);

	}

}
