package com.boost.lesson20_Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {

		HashSet<String> degerHashSet = new HashSet<String>();
		ArrayList<String> arrayList = new ArrayList<String>();

		Map<Long, String> stokUrunlerim = new HashMap<Long, String>();
		stokUrunlerim.put(1L, "100gr Şeker");
		stokUrunlerim.put(1L, "200gr Şeker");
		stokUrunlerim.put(1L, "500gr Şeker");
		stokUrunlerim.put(2L, "1kg Un");
		stokUrunlerim.put(2L, "5kg Un");

		System.out.println("Map in uzunluğu...: " + stokUrunlerim.size());
		System.out.println("k->1 için...: " + stokUrunlerim.get(1L));
		System.out.println("k->2 için...: " + stokUrunlerim.get(2L));

	}

}
