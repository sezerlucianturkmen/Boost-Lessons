package com.boost.lesson21;

import java.util.Optional;

public class Example_Optional {

	public static void main(String[] args) {

		Product product = null;

		Optional<Product> product2 = Optional.of(product);
		Optional<Product> product3 = Optional.ofNullable(product);
		// null olsa bile üzerinde işlam yapılıyor boş olup olmadıgını true/false
		// donuyor

	}

}
