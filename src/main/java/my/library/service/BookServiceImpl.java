package my.library.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.library.dao.BookRepository;
import my.library.model.Book;

@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book create(String name, String authors, String ISBN) {
		return bookRepository.create(name, authors, ISBN);
	}
	
}
