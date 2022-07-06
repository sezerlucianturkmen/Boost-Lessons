package com.boost.lesson18_queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example_01 {

	public static void main(String[] args) {

		Queue<Integer> myQueue = new LinkedList<Integer>();

		myQueue.offer(100);
		myQueue.offer(90);
		myQueue.offer(150);
		myQueue.offer(74);
		myQueue.offer(23);
		System.out.println(myQueue);

		while (myQueue.isEmpty() == false) {

			System.out.println(myQueue.poll());
		}

	}

}
