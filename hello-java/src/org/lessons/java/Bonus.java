package org.lessons.java;

import java.util.Scanner; // Import the Scanner class

public class Bonus {
	public static void main(String[] args) {
		System.out.println("Benvenuto al primo progetto, Bonus-Java");
		String name = "Adamo";
		String last_name = "Carangi";
		System.out.println("Nome Concatenato " + name + " " + last_name);
		String full_name = name + " " + last_name;
		System.out.println("Nome Completo " + full_name);
		// altre variabili
		int num = 5;
		float floatNum = 15.99f;
		char letter = 'A';
		boolean bool = true;
		System.out.println(num + " " + floatNum + " " + letter + " " + bool + " ");

		Scanner myObj1 = new Scanner(System.in);
		int num1;
		Scanner myObj2 = new Scanner(System.in);
		int num2;

		// Controllo due valori numerici
		System.out.println("Inserisci il primo numero");
		num1 = myObj1.nextInt();
		System.out.println("Inserisci il secondo numero");
		num2 = myObj2.nextInt();
		int sum = num1 + num2;
		if (sum % 2 == 0) {
			System.out.println("La somma dei numeri " + num1 + " e " + num2 + " è pari");
		} else {
			System.out.println("La somma dei numeri " + num1 + " e " + num2 + " è dispari");
		}

	}
}
