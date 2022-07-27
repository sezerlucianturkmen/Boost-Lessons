package com.boost.lesson22_StreamExample2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Deneme {

	static List<Student> students = new ArrayList<>();

	public static void main(String[] args) {
		Student student = new Student();
		student.name = "Ali";
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.notlar.add(50.0);
		student.bolum = "tm";
		student.id = 1;
		Student student2 = new Student();
		student2.name = "Ayşe";
		student2.notlar.add(80.0);
		student2.notlar.add(55.5);
		student2.notlar.add(79.4);
		student2.bolum = "mat";
		student2.id = 2;
		Student student3 = new Student();
		student3.name = "Hakan";
		student3.notlar.add(86.0);
		student3.notlar.add(97.5);
		student3.notlar.add(50.4);
		student3.bolum = "mat";
		student3.id = 3;
		Student student4 = new Student();
		student4.name = "Mert";
		student4.notlar.add(10.0);
		student4.notlar.add(35.5);
		student4.notlar.add(58.4);
		student4.bolum = "tm";
		student4.id = 4;
		Student student5 = new Student();
		student5.name = "Gamze";
		student5.notlar.add(68.0);
		student5.notlar.add(23.5);
		student5.notlar.add(90.4);
		student5.bolum = "mat";
		student5.id = 5;
		Student student6 = new Student();
		student6.name = "Merve";
		student6.notlar.add(36.0);
		student6.notlar.add(23.5);
		student6.notlar.add(58.4);
		student6.bolum = "tm";
		student6.id = 6;
		students.add(student);
		students.add(student2);
		students.add(student3);
		students.add(student4);
		students.add(student5);
		students.add(student6);

		List<Double> avarageList = new ArrayList<Double>();

		avarageList = students.stream().map(Student::ortHesapla).collect(Collectors.toList());

		Map<String, List<Student>> bolumler = new HashMap<>();
		bolumler = students.stream().collect(Collectors.groupingBy(Student::getBolum));

		students.stream().filter(s -> s.ortHesapla() > 50).forEach(t -> t.setDurum("Sinifi Geçti..."));

		students.stream().forEach(s -> s.getNotlar().add(88d));

		students.stream().forEach(s -> {
			s.setNotlar(s.getNotlar().stream().map(x -> x += 15).collect(Collectors.toList()));

		});

		students.forEach(s -> System.out.println(s.getNotlar().toString()));

		Map<Integer, String> mapList = new HashMap<>();
		mapList = students.stream().collect(Collectors.toMap(Student::getId, Student::getName));

		System.out.println(mapList);

	}

}
