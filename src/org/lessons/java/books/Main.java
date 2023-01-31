package org.lessons.java.books;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int numBooks = -1;

		System.out.println("Benvenuto nel programma di gestioni libri!");
		System.out.println();

		Scanner s = new Scanner(System.in);

		do {
			try {
				System.out.print("Inserire numero di libri da registrare: ");
				numBooks = Integer.parseInt(s.nextLine());
				if (numBooks == 0)
					System.out.println("Inserire un numero maggiore di 0.");
			} catch (NumberFormatException e) {
				System.out.println("Errore nell'inserimento di un numero. " + e.getMessage());
			}
		} while (numBooks <= 0);

		s.close();

	}

}
