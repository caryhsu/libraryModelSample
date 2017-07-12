package my.library.hibernate;

import org.hibernate.Session;

import my.library.model.Book;
public class SampleDataBuilder {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + H2 testing");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		{
			Book book = new Book("���U�Ӿ�����p�I�ѵM��@�L�K�[�A�~�a�з~�]OK�G�q���`�}�l�A�M�N�̦w�ߪ��m����j�i�����H�����@�j");
			book.setAuthors("���οo");
			book.setISBN("9789864082940");
			session.save(book);
		}
		{
			Book book = new Book("�W�����Ѭ����]�k���G��G��֡��`�ơ��A�G�ѽL���槹���f�t�A�h�h���S���������n����");
			book.setAuthors("�d�ػT");
			book.setISBN("9789863710608");
			session.save(book);
		}
		{
			Book book = new Book("�@�ظt�g");
			book.setAuthors("Anette Moldvaer");
			book.setISBN("9789863770916");
			session.save(book);
		}
		{
			Book book = new Book("�@�ظt�g");
			book.setAuthors("Anette Moldvaer");
			book.setISBN("9789863770916");
			session.save(book);
		}
		{
			Book book = new Book("��R�@�ؤj��");
			book.setAuthors("��p�n�@�خv�V�m����");
			book.setISBN("9789863316589");
			session.save(book);
		}
		session.flush();
		
		session.getTransaction().commit();
		
		HibernateUtil.getSessionFactory().close();
	}
}
