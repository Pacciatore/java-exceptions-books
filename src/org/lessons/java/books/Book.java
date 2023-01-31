package org.lessons.java.books;

public class Book {

	private String title;
	private int numPages;
	private String author;
	private String editor;

	public Book(String _title, int _numPages, String _author, String _editor) {

		this.title = _title;
		this.numPages = _numPages;
		this.author = _author;
		this.editor = _editor;

	}

	public String getTitle() {
		return this.title;
	}

	public int getNumPages() {
		return this.numPages;
	}

	public String getAuthor() {
		return this.author;
	}

	public String getEditor() {
		return this.editor;
	}

}
