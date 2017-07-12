package my.library.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import my.library.model.Book;
import my.library.model.Member;

@Repository("bookRepository")
@Transactional
public class BookRepository {

	@PersistenceContext
	private EntityManager entityManager;

	public Book create(String name, String authors, String ISBN) {
		Book book = new Book(name);
		book.setAuthors(authors);
		book.setISBN(ISBN);
		entityManager.persist(book);
		entityManager.flush();
		return book;
	}
	
	@SuppressWarnings("unchecked")
	public List<Book> findAll() {
		Query query = entityManager.createQuery("SELECT b FROM Book b");
	    return (List<Book>) query.getResultList();
	}
	
	public Book get(String id) {
		return entityManager.find(Book.class, id);
	}

	public Book update(Book book, String name, String authors, String ISBN) {
		book = entityManager.merge(book);
		book.setAuthors(authors);
		book.setISBN(ISBN);
		entityManager.merge(book);
		entityManager.flush();
		return book;
	}

	public void borrowBook(Book book, Member member) {
		book = entityManager.merge(book);
		book.borrowBook(member);
		entityManager.persist(book);
		entityManager.flush();
	}

	public void returnBook(Book book) {
		book = entityManager.merge(book);
		book.returnBook();
		entityManager.persist(book);
		entityManager.flush();
	}
}

