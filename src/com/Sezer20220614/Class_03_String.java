package com.Sezer20220614;

import java.util.Scanner;

public class Class_03_String {

	public static void main(String[] args) {

		String word = "Hello, world!";
		int lengthOfWord = word.length();

		word.charAt(5);
		word.indexOf("el");
		word.substring(5);// (begindex,endindex) ilk dahil son dahil değil.
		word.toLowerCase(); // locale komutu le dilini seçebiliyoruz karakter desteği için..
		word.toUpperCase();
		word.trim(); // baştaki ve sondaki boşlukları trimler.

		// ****************IMOORTANT******************

		String runame = "sezer";
		String rpass = "1234";// normalde bir data base de olus olur.

		Scanner scanner = new Scanner(System.in);
		System.out.print("username..:");
		String uname = scanner.nextLine();// metin girip "enter" a basınca degeri string olarak alır.

		System.out.print("password..:");
		String pass = scanner.nextLine();

		if (runame.toLowerCase() == uname.trim().toLowerCase()) {
			System.out.println("logged in");// fiziksel olarak iki kullanıcı ismi doğru olsa bile hata verir!(java string pool)

		} else {
			System.out.println("Username and Passsword are incorrect");
		}
		
		if(runame.toLowerCase().equals(uname.trim().toLowerCase())  &&  rpass.equals(pass.trim()));{
			//trueorfalse, case kontrol etmek için .equalsIgnoreCase kullanılabilir.
			
			System.out.println("logged in");
			} else {
			System.out.println("Username and Passsword are incorrect");
			}
		

		// TODO Auto-generated method stub

	}

}
