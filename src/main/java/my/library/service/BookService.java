package my.library.service;

import my.library.model.Book;

public interface BookService {

	public Book create(String name, String author, String ISBN);
	
}
