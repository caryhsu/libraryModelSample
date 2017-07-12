package my.library.hibernate;

import org.hibernate.Session;

import my.library.model.Book;
public class SampleDataBuilder {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + H2 testing");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		
		Book book1 = new Book("���U�Ӿ�����p�I�ѵM��@�L�K�[�A�~�a�з~�]OK�G�q���`�}�l�A�M�N�̦w�ߪ��m����j�i�����H�����@�j");
		book1.setAuthors("���οo");
		book1.setISBN("9789864082940");
		session.save(book1);
		
		Book book2 = new Book("�W�����Ѭ����]�k���G��G��֡��`�ơ��A�G�ѽL���槹���f�t�A�h�h���S���������n����");
		book2.setAuthors("�d�ػT");
		book2.setISBN("9789863710608");
		session.save(book2);
		
		Book book3 = new Book("�@�ظt�g");
		book3.setAuthors("Anette Moldvaer");
		book3.setISBN("9789863770916");
		session.save(book3);
		
		Book book4 = new Book("�@�ظt�g");
		book4.setAuthors("Anette Moldvaer");
		book4.setISBN("9789863770916");
		session.save(book4);
		
		Book book5 = new Book("��R�@�ؤj��");
		book5.setAuthors("��p�n�@�خv�V�m����");
		book5.setISBN("9789863316589");
		session.save(book5);
			
		session.flush();
		
		session.getTransaction().commit();
		
		HibernateUtil.getSessionFactory().close();
	}
}
