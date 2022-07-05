package com.boost.lesson17;

import java.util.ArrayList;
import java.util.List;

public class Example_01 {
	public static void main(String[] args) {

		List<String> cityList = new ArrayList<String>();
		cityList.add("Ankara");
		cityList.add("Bursa");
		cityList.add("Antalya");
		cityList.add("Artvin");
		cityList.add("Erzurum");

		for (int i = 0; i < cityList.size(); i++) {
			if (cityList.get(i).startsWith("An")) {
				cityList.add(i + 1, "-------");
			}
		}

		System.out.println(cityList);

	}

}
