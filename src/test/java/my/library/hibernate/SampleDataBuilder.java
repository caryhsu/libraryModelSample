package my.library.hibernate;

import org.hibernate.Session;

import my.library.model.Book;
public class SampleDataBuilder {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + H2 testing");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		
		Book book1 = new Book("億萬商機鳳梨酥！天然手作無添加，居家創業也OK：從炒餡開始，烘烤最安心的彩色金磚【收錄人氣月餅實作】");
		book1.setAuthors("杜佳穎");
		book1.setISBN("9789864082940");
		session.save(book1);
		
		Book book2 = new Book("名店不敗美味魔法水果塔：塔皮×餡料×鮮果×盤飾醬完美搭配，多層次又不甜膩的好滋味");
		book2.setAuthors("吳佩蓉");
		book2.setISBN("9789863710608");
		session.save(book2);
		
		Book book3 = new Book("咖啡聖經");
		book3.setAuthors("Anette Moldvaer");
		book3.setISBN("9789863770916");
		session.save(book3);
		
		Book book4 = new Book("咖啡聖經");
		book4.setAuthors("Anette Moldvaer");
		book4.setISBN("9789863770916");
		session.save(book4);
		
		Book book5 = new Book("手沖咖啡大全");
		book5.setAuthors("醜小鴨咖啡師訓練中心");
		book5.setISBN("9789863316589");
		session.save(book5);
			
		session.flush();
		
		session.getTransaction().commit();
		
		HibernateUtil.getSessionFactory().close();
	}
}
