package com.boost.lesson17_Basket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {

	String product[] = { "Cips", "CocaCola", "Sugar", "Olive Oil", "Flour", "Bread", "Tea", "Eggs", "Yogurt", "Milk" };
	List<String> cartList = new ArrayList<String>();

	public void makeMenu() {

		int input = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("-----------------------");
			System.out.println("--------GROCERY--------");
			System.out.println("1. Show the products");
			System.out.println("2. Add anyproducts to the cart ");
			System.out.println("3. Show the cart");
			System.out.println("-----------------------");
			input = scanner.nextInt();
			switch (input) {

			case 1 -> showCart();
			case 2 -> addList(cartList);
			case 3 -> showBasket(cartList);

			case 0 -> System.out.println("See you later...");

			}
		} while (input != 0);

	}

	public void showCart() {

		for (int i = 0; i < product.length; i++) {
			System.out.print((i + 1) + " " + product[i] + " _ ");

		}
		System.out.println();
	}

	public void addList(List<String> cartList) {

		this.cartList = cartList;
		System.out.println("Please enter product number you would like to add into your cart");
		Scanner scanner = new Scanner(System.in);
		int pick = scanner.nextInt();

		cartList.add(product[pick - 1]);

	}

	public void showBasket(List<String> cartList) {
		System.out.println("----PRODUCTS IN THE CART----");
		System.out.println("----------------------------");

		for (String string : cartList) {
			System.out.println(cartList);
		}
		System.out.println("----------------------------");
	}

}
