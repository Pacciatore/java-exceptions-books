package org.lessons.java.books;

public class BookIntegerException extends Exception {

	private int _integer;

	public BookIntegerException(int _number) {
		super("Il numero inserito non è un intero positivo!");
		this._integer = _number;
	}

	public int getInteger() {
		return _integer;
	}

}
