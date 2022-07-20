package com.boost.lesson18_Kitchen;

import java.util.Random;
import java.util.Stack;

public class Test {

	public static Stack<Plate> stackDirtyPlates = new Stack<Plate>();
	public static Stack<Plate> stackCleanPlates = new Stack<Plate>();

	public static void main(String[] args) {

		Stack<Plate> stack = makePlate(10);

		while (!stack.isEmpty()) {
			if (stack.peek().isDirty)
				stackDirtyPlates.add(stack.pop());
			else {
				stackCleanPlates.add(stack.pop());
			}
		}
		System.out.println(stackDirtyPlates);
		System.out.println(stackCleanPlates);

		// cleanPlate(stackDirtyPlates, stackCleanPlates);
		//
		// System.out.println("------AFTER------");
		// System.out.println(stackDirtyPlates);
		// System.out.println(stackCleanPlates);

		// cleanPlate();
		// usePlate();
		select();

	}

	public static void select() {
		Random random = new Random();

		int pick = random.nextInt(2) + 1;

		if (pick == 1) {
			cleanPlate();
		} else if (pick == 2) {
			usePlate();
		}

	}

	public static void cleanPlate(Stack<Plate> dirty, Stack<Plate> clean) {

		dirty.peek().setDirty(false);
		clean.add(dirty.pop());

	}

	public static void usePlate() {

		if (!stackCleanPlates.isEmpty()) {

			Plate plate = stackCleanPlates.pop();
			plate.setDirty(true);
			stackDirtyPlates.add(plate);
			System.out.println(plate.getId() + " ID Plate is used..opss now it is dirty..");
		}
	}

	public static void cleanPlate() {

		if (!stackDirtyPlates.isEmpty()) {

			Plate plate = stackDirtyPlates.pop();
			plate.setDirty(false);
			stackCleanPlates.add(plate);
			System.out.println(plate.getId() + " ID Plate is clean now..");
		}
	}

	public static Stack<Plate> makePlate(int quantity) {
		Stack<Plate> plates = new Stack<Plate>();
		for (int i = 1; i <= quantity; i++) {
			plates.add(new Plate(i, isDirty()));
		}
		return plates;
	}

	public static boolean isDirty() {
		Random random = new Random();
		int pick = random.nextInt(2);
		boolean isDirty;
		if (pick == 1) {
			isDirty = false;
		} else {
			isDirty = true;
		}

		return isDirty;
	}
}
