package org.lessons.java;

import java.util.Scanner; // Import the Scanner class

public class Bonus {
	public static void main(String[] args) {

		// saluto classico
		System.out.println("Benvenuto al primo progetto, Bonus-Java");

		// nome e cognome
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

		// Controllo due valori numerici
		Scanner myObj1 = new Scanner(System.in);
		int num1;
		Scanner myObj2 = new Scanner(System.in);
		int num2;

		// stampo sulla stessa riga
		System.out.print("Inserisci il primo numero intero: ");
		num1 = myObj1.nextInt();
		System.out.print("Inserisci il secondo numero interno: ");
		num2 = myObj2.nextInt();

		// somma
		int sum = num1 + num2;

		// stampa con if-else
		if (sum % 2 == 0) {
			System.out.println("La somma dei numeri " + num1 + " e " + num2 + " è " + sum + " ed è pari");
		} else {
			System.out.println("La somma dei numeri " + num1 + " e " + num2 + " è " + sum + " ed è dispari");
		}

		
		//ciclo for con if
		Scanner volte = new Scanner(System.in);
		int numVolte;
		System.out.println("Ora stampo n volte la parola Ciao: ");
		numVolte = volte.nextInt();

		for (int i = 0; i < numVolte; i++) {
			if (i % 10 == 0) {
				System.out.println("Ciao ");
			}
			System.out.print("Ciao ");
		}
	}
}
