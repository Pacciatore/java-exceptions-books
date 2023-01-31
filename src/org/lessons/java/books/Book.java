package org.lessons.java.books;

public class Book {

	private String title;
	private int numPages;
	private String author;
	private String editor;

	public Book(String _title, int _numPages, String _author, String _editor)
			throws BookStringsException, BookIntegerException {

		if (_title.trim().length() == 0)
			throw new BookStringsException();
		else
			this.title = _title;

		if (_numPages <= 0)
			throw new BookIntegerException(_numPages);
		else
			this.numPages = _numPages;

		if (_author.trim().length() == 0)
			throw new BookStringsException();
		else
			this.author = _author;

		if (_editor.trim().length() == 0)
			throw new BookStringsException();
		else
			this.editor = _editor;

	}

	// Getters
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

	// Setters
	public void setTitle(String _title) throws BookStringsException {
		if (_title.trim().length() <= 0)
			throw new BookStringsException();
		else
			this.title = _title;
	}

	public void setNumPages(int _numPages) throws BookIntegerException {
		if (_numPages <= 0)
			throw new BookIntegerException(_numPages);
		else
			this.numPages = _numPages;
	}

	public void setAuthor(String _author) throws BookStringsException {
		if (_author.trim().length() <= 0)
			throw new BookStringsException();
		else
			this.author = _author;
	}

	public void setEditor(String _editor) throws BookStringsException {
		if (_editor.trim().length() <= 0)
			throw new BookStringsException();
		else
			this.editor = _editor;
	}

}
