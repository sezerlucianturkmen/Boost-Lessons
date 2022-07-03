package com.boost.lesson03;

public class Class_02_StartEndWith_Split {

	public static void main(String[] args) {
		// "Hello, World!".startsWith or endsWith("H")

		String word = "Hello, world!";

		System.out.println(word.startsWith("H"));

		// split(",") aranan ifadeye [regex] e gore metni string array haline getirir.

		String list = "x,y,z,w";

		System.out.println(list.split(","));

		String[] listpurge = list.split(",");

		System.out.println("second one  " + listpurge[1]);

	}

}
