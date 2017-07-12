package my.library.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import my.library.model.Book;

@Repository("bookRepository")
public class BookRepository {

//	@PersistenceContext
//	private EntityManager manager;

	@Autowired
	private SessionFactory sessionFactory;

	public Book create(String name, String authors, String ISBN) {
		Book book = new Book(name);
		book.setAuthors(authors);
		book.setISBN(ISBN);
//		manager.persist(book);
//		manager.flush();
		return book;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public void persist(Object entity) {
		getSession().persist(entity);
	}

	public void delete(Object entity) {
		getSession().delete(entity);
	}
	
}

