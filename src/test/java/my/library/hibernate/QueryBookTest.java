package my.library.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import my.library.model.Book;

public class QueryBookTest {

	private Session session;
	
	@Before
	public void setUp() {
		if (session == null) {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
		}
	}
	
	@After
	public void tearDown() {
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
		this.session = null;
	}
	
	@Test
	public void testQueryCase1() {
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> books = (List<Book>) criteria.list();
		
		for(Book b : books) {
			System.out.println(b.getName());
		}
			
		session.flush();
	}
}
