package my.library.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import my.library.model.Book;
public class QueryBookTest {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + H2 testing");
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		
		Criteria criteria = session.createCriteria(Book.class);
		List<Book> books = (List<Book>) criteria.list();
		
		for(Book b : books) {
			System.out.println(b.getName());
		}
			
		session.flush();
		
		session.getTransaction().commit();
		
		HibernateUtil.getSessionFactory().close();
	}
}
