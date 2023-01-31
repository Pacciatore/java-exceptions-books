package org.lessons.java.books;

public class BookAuthorException extends Exception {

	public BookAuthorException() {
		super("L'autore non può essere un campo vuoto!");
	}

}
