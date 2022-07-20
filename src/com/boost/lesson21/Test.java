package com.boost.lesson21;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Test {

	List<Product> productList = new ArrayList<Product>();

	public static void main(String[] args) {
		Test test = new Test();

		for (int i = 0; i < 3; i++) {

			test.addList(test.makeProduct());

		}

		System.out.println("Urun Listesi");
		test.productList.forEach(s -> System.out.println(s));

	}

	public void addList(Optional<Product> product) {

		if (product.isPresent()) {
			productList.add(product.get());
		}

	}

	public Optional<Product> makeProduct() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Product name..:");
		String productName = scanner.nextLine();
		System.out.println("Enter the price..:");
		double price = scanner.nextDouble();
		scanner.nextLine();

		if (productName.equals("") || price <= 0) {
			return Optional.ofNullable(null);
		}
		return Optional.of(new Product(productName, price));
	}

}
