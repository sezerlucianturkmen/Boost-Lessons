package com.boost.lesson22_StreamExample1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sepet {

	EUrun[] product = EUrun.values(); // enum dan array olusturma
	Map<String, Integer> sepetMap;
	List<Urun> urunler = new ArrayList<Urun>();
	Map<String, Double> urunMap = new HashMap<String, Double>();

	public Sepet() {
		urunOlustur();
		urunFiyatMapOlustur();
	}

	public static void main(String[] args) {
		Sepet sepet = new Sepet();
		sepet.menu();

	}

	public void urunleriListele() {
		urunler.forEach(System.out::println);
	}

	public void toplam() {
		List<Double> fiyatlar = sepetMap.entrySet().stream().map(s -> {
			return s.getValue() * urunMap.get(s.getKey());
		}).collect(Collectors.toList());

		Double toplam = fiyatlar.stream().reduce((s1, s2) -> s1 + s2).get();
		System.out.println("Sepetin toplamı= " + toplam);

	}

	public void fiyati50denBuyukOlanlar() {

		List<Urun> urun50 = urunler.stream().filter(s -> s.getPrice() > 50).collect(Collectors.toList());

		Double avarage = urun50.stream().collect(Collectors.averagingDouble(Urun::getPrice));

	}

	public void urunOlustur() {
		// Arrays.asList(product).stream().forEach(t-> urunler
		// .add(new Urun(t.name(),t.fiyat)));

		urunler = Arrays.asList(product).stream().map(s -> new Urun(s.name(), s.fiyat)).collect(Collectors.toList());

		urunler.forEach(s -> System.out.println(s.getName()));
	}

	public void urunFiyatMapOlustur() {
		urunMap = urunler.stream().collect(Collectors.toMap(s -> s.getName(), t -> t.getPrice()));

		urunMap.entrySet().forEach(System.out::println);
	}

	public void urunEkle() {
		Scanner scanner = new Scanner(System.in);
		String urun = scanner.nextLine();

		if (sepetMap.containsKey(urun)) {
			sepetMap.replace(urun, sepetMap.get(urun) + 1);
			System.out.println(urun + "sepete eklendi");
		} else {
			if (urunMap.containsKey(urun)) {
				sepetMap.put(urun, 1);
			} else {
				System.out.println("Urun bulunamadı");
			}
		}
	}

	public void sepetiGoster() {
		sepetMap.entrySet().forEach(s -> System.out.println(s));
		toplam();
		double result = sepetMap.entrySet().stream().collect(Collectors.averagingDouble(s -> s.getValue()));

		System.out.println(result);
	}

	public void menu() {
		int input = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("----------------");
			System.out.println("1-Ürün Listesi Göster");
			System.out.println("2-Ürün Ekle");
			System.out.println("3-Sepeti Göster");
			System.out.println("----------------");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				urunleriListele();
				break;
			case 2:
				urunEkle();
				break;
			case 3:
				sepetiGoster();
				break;
			default:
				break;
			}

		} while (input != 0);

	}

}
