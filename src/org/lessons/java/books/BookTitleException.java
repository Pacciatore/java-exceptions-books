package org.lessons.java.books;

public class BookTitleException extends Exception {

	public BookTitleException() {
		super("Il titolo non può essere un campo vuoto.");
	}

}
