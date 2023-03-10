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
				System.out.println("Impossibile lasciare il campo vuoto!");
			}
		} while (numBooks <= 0);

		Book[] books = new Book[numBooks];

		bookRegister(s, books);

		displayBooks(books);

		changeBook(s, books);

		displayBooks(books);

		s.close();

	}

	public static void bookRegister(Scanner s, Book[] books) {

		for (int i = 0; i < books.length; i++) {
			Book book = null;
			boolean done = false;
			System.out.println();

			do {
				System.out.print("Inserire titolo libro: ");
				String bookTitle = s.nextLine();

				int bookPages = 0;

				System.out.print("Inserire numero di pagine: ");

				// Try per evitare l'errore su inserimento vuoto
				try {
					bookPages = Integer.parseInt(s.nextLine());
					done = true;
				} catch (NumberFormatException e) {
					done = false;
				}

				System.out.print("Inserire autore: ");
				String bookAuthor = s.nextLine();

				System.out.print("Inserire editore: ");
				String bookEditor = s.nextLine();

				try {
					book = new Book(bookTitle, bookPages, bookAuthor, bookEditor);
					done = true;
				} catch (BookTitleException e) {
					System.out.println("-------------------------------------------------");
					System.out.println(e.getMessage() + " | Inserire nuovamente i dati.");
					System.out.println();
					done = false;
				} catch (BookAuthorException e) {
					System.out.println("-------------------------------------------------");
					System.out.println(e.getMessage() + " | Inserire nuovamente i dati.");
					System.out.println();
					done = false;
				} catch (BookEditorException e) {
					System.out.println("-------------------------------------------------");
					System.out.println(e.getMessage() + " | Inserire nuovamente i dati.");
					System.out.println();
					done = false;
				} catch (BookIntegerException e) {
					System.out.println("-------------------------------------------------");
					System.out.println(e.getMessage() + " | Inserire nuovamente i dati.");
					System.out.println();
					done = false;
				}

			} while (!done);
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

	public static void changeBook(Scanner s, Book[] books) {

		boolean done = false;

		int booksToChange = -1;

		// Controllo che il numero dei libri da aggiornare ?? compreso tra 0 e il numero
		// di libri gi?? presenti
		do {
			try {
				System.out.println();
				System.out.print("Inserire numero di libri da aggiornare: ");
				booksToChange = Integer.parseInt(s.nextLine());
				if (booksToChange <= 0)
					System.out.println("Inserire un numero maggiore di 0.");
				else if (booksToChange > books.length)
					System.out.println("Non puoi cambiare pi?? libri di quanti ce ne siano!");
			} catch (NumberFormatException e) {
				System.out.println("Impossibile lasciare il campo vuoto!");
			}
		} while (!(booksToChange > 0 && booksToChange <= books.length));

		// Inizio ciclo per inserimento dati
		for (int i = 0; i < booksToChange; i++) {

			// Cambio del titolo
			do {
				try {
					System.out.println("Cambia titolo del primo libro: ");
					books[i].setTitle(s.nextLine());
					done = true;
				} catch (BookTitleException e) {
					System.out.println(e.getMessage());
					done = false;
				}
			} while (!done);

			done = false;

			// Cambio del numero delle pagine
			do {
				try {
					System.out.println("Cambia numero di pagine del primo libro: ");
					books[i].setNumPages(Integer.parseInt(s.nextLine()));
					done = true;
				} catch (BookIntegerException e) {
					System.out.println(e.getMessage());
					done = false;
				} catch (NumberFormatException e) {
					System.out.println("Inserire un numero!");
					done = false;
				}
			} while (!done);

			done = false;

			// Cambio dell'autore
			do {
				try {
					System.out.println("Cambia autore del primo libro: ");
					books[i].setAuthor(s.nextLine());
					done = true;
				} catch (BookAuthorException e) {
					System.out.println(e.getMessage());
					done = false;
				}
			} while (!done);

			done = false;

			// Cambio dell'editore
			do {
				try {
					System.out.println("Cambia editore del primo libro: ");
					books[i].setEditor(s.nextLine());
					done = true;
				} catch (BookEditorException e) {
					System.out.println(e.getMessage());
					done = false;
				}
			} while (!done);
		}
	}

}
