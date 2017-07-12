package my.library.dao;

import my.library.model.Book;

public interface BookRepository {

	public Book create(String name, String authors, String ISBN);
	
}

