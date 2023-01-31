package org.lessons.java.books;

public class BookStringsException extends Exception {

	private String text;

	public BookStringsException(String _text) {
		super("Stringa vuota non valida!");
		this.text = _text;
	}

	public String getText() {
		return text;
	}

}
