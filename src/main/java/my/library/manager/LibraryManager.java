package my.library.manager;

import my.library.model.Book;
import my.library.model.Member;

public class LibraryManager {

	public void borrowBook(Member member, Book book) {
		book.borrowBook(member);
	}
	
	public void returnBook(Member member, Book book) {
		book.returnBook();
	}

}
