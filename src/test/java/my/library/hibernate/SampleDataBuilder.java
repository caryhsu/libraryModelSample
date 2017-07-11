package my.library.hibernate;

import org.hibernate.Session;

import my.library.model.Book;
public class SampleDataBuilder {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + H2 testing");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Book book = new Book("���U�Ӿ�����p�I�ѵM��@�L�K�[�A�~�a�з~�]OK�G�q���`�}�l�A�M�N�̦w�ߪ��m����j�i�����H�����@�j");
		book.setAuthors("���οo");
		book.setISBN("9789864082940");

		session.save(book);
		session.getTransaction().commit();
	}
}
