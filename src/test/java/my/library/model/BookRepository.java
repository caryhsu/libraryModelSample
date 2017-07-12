package my.library.model;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {

	private List<Book> books = new ArrayList<Book>();
	
	public List<Book> findAll() {
		return this.books;
	}
	
	public BookRepository() {
		Book book1 = new Book("���U�Ӿ�����p�I�ѵM��@�L�K�[�A�~�a�з~�]OK�G�q���`�}�l�A�M�N�̦w�ߪ��m����j�i�����H�����@�j");
		book1.setAuthors("���οo");
		book1.setISBN("9789864082940");
		books.add(book1);
		
		Book book2 = new Book("�W�����Ѭ����]�k���G��G��֡��`�ơ��A�G�ѽL���槹���f�t�A�h�h���S���������n����");
		book2.setAuthors("�d�ػT");
		book2.setISBN("9789863710608");
		books.add(book2);
		
		Book book3 = new Book("�@�ظt�g");
		book3.setAuthors("Anette Moldvaer");
		book3.setISBN("9789863770916");
		books.add(book3);
		
		Book book4 = new Book("�@�ظt�g");
		book4.setAuthors("Anette Moldvaer");
		book4.setISBN("9789863770916");
		books.add(book4);
		
		Book book5 = new Book("��R�@�ؤj��");
		book5.setAuthors("��p�n�@�خv�V�m����");
		book5.setISBN("9789863316589");
		books.add(book5);
	}

}
