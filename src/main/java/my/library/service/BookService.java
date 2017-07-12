package my.library.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.library.dao.BookRepository;
import my.library.model.Book;

@Service("bookService")
@Transactional
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public Book create(String name, String authors, String ISBN) {
		Book book = bookRepository.create(name, authors, ISBN);
		System.out.println("book: " + name + " created!");
		return book;
	}
	
}
