package my.library.model;

import java.util.List;

public class BookTest {

	
	public static void main(String... args) {
		BookRepository bookRepository = new BookRepository();
		
		List<Book> books = bookRepository.findAll();
		for(Book book : books) {
			System.out.println(book.getISBN() + ":" + book.getName());
		}
	}
}
