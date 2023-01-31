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

		Book[] books = new Book[numBooks];

		bookRegister(s, books);

		displayBooks(books);

		s.close();

	}

	public static void bookRegister(Scanner s, Book[] books) {

		for (int i = 0; i < books.length; i++) {

			System.out.println();

			System.out.print("Inserire titolo libro: ");
			String bookTitle = s.nextLine();

			System.out.print("Inserire numero di pagine: ");
			int bookPages = Integer.parseInt(s.nextLine());

			System.out.print("Inserire autore: ");
			String bookAuthor = s.nextLine();

			System.out.print("Inserire editore: ");
			String bookEditor = s.nextLine();

			Book book = new Book(bookTitle, bookPages, bookAuthor, bookEditor);

			books[i] = book;

		}

	}

	public static void displayBooks(Book[] books) {

		for (int i = 0; i < books.length; i++) {
			System.out.println();

			System.out.println("Titolo: " + books[i].getTitle());
			System.out.println("Numero di pagine: " + books[i].getNumPages());
			System.out.println("Autore: " + books[i].getAuthor());
			System.out.println("Editore: " + books[i].getEditor());

			System.out.println("-------------------------------------------");
		}

	}

}
