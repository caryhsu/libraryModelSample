package my.library.hibernate;

import org.hibernate.Session;

import my.library.model.Book;
public class SampleDataBuilder {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + H2 testing");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Book book = new Book("億萬商機鳳梨酥！天然手作無添加，居家創業也OK：從炒餡開始，烘烤最安心的彩色金磚【收錄人氣月餅實作】");
		book.setAuthors("杜佳穎");
		book.setISBN("9789864082940");

		session.save(book);
		session.getTransaction().commit();
	}
}
