package com.boost.lesson20_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RunnerMap {

	public static void main(String[] args) {

		/**
		 * MAP -> <Key,Value> ---> <long, String> -> <1111111111,Vatandas.class> --->
		 * <Class, [Class-List<String>.... v.s.]>
		 */
		List<Bolum> bolumListesi = new ArrayList<Bolum>();
		bolumListesi.add(new Bolum(18, "Bilgi İşlem"));
		bolumListesi.add(new Bolum(42, "İnsan Kaynakları"));
		bolumListesi.add(new Bolum(35, "Muhasebe"));
		bolumListesi.add(new Bolum(41, "Güvenlik"));

		List<Personel> personelList = new ArrayList<Personel>();
		// ÖNEMLİ -> buraya mevcut bulnan departman bilgilerinden atam yapmalısınız.
		// DİKKAT!!! -> get ile aldığım şey, bir listenini içindeki elemaların index
		// değeri ile
		// alınan bilgilerdir.
		personelList.add(new Personel(1, "Ahmet", "TAŞ", "0 555 111 1111", bolumListesi.get(0)));
		personelList.add(new Personel(2, "Canan", "TAŞ", "0 999 111 1111", bolumListesi.get(0)));
		personelList.add(new Personel(3, "Bahar", "TAŞ", "0 888 111 1111", bolumListesi.get(0)));
		personelList.add(new Personel(4, "Taner", "BULUŞ", "0 999 111 1111", bolumListesi.get(1)));
		personelList.add(new Personel(5, "Hakan", "DOK", "0 888 111 1111", bolumListesi.get(1)));
		personelList.add(new Personel(6, "Tuana", "TEK", "0 555 111 1111", bolumListesi.get(3)));
		personelList.add(new Personel(7, "Temel", "TAŞ", "0 999 111 1111", bolumListesi.get(3)));
		personelList.add(new Personel(8, "Tahir", "TEK", "0 888 111 1111", bolumListesi.get(3)));
		personelList.add(new Personel(9, "Taha", "TAŞ", "0 555 111 1111", bolumListesi.get(3)));
		personelList.add(new Personel(10, "Tunç", "TEK", "0 999 111 1111", bolumListesi.get(3)));
		personelList.add(new Personel(11, "Güvenç", "BEKTAŞ", "0 888 111 1111", bolumListesi.get(2)));

		/***
		 * Key -> Departman Value -> Çalışan Listesi
		 */
		Map<Bolum, List<Personel>> bolumPersonelLisesi;
		/**
		 * 
		 */
		bolumPersonelLisesi = personelList.stream().collect(Collectors.groupingBy(Personel::getBolum));

		System.out.println("1- Bilgi İşlem");
		System.out.println("2- İnsan Kaynakları");
		System.out.println("3- Muhasebe");
		System.out.println("4- Güvenlik");
		System.out.print("Personel listele....: ");
		Scanner sc = new Scanner(System.in);
		int secim = sc.nextInt() - 1;
		Bolum bolum = bolumListesi.get(secim); // Bölüm seçiliyor.
		// bir K->V yapısında anahtar verildiğinde değeri döner
		List<Personel> secilenBolumPersonelListesi = bolumPersonelLisesi.get(bolum);
		secilenBolumPersonelListesi.forEach(x -> System.out.println(x.toString()));

	}

}
