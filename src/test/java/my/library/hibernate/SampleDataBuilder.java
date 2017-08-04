package my.library.hibernate;

import org.hibernate.Session;

import my.library.model.Book;
public class SampleDataBuilder {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + H2 testing");
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		
		Book book1 = new Book("孩子的科學遊戲：53個在家就能玩的科學實驗全圖解");
		book1.setAuthors("蕭俊傑");
		book1.setISBN("9789864082940");
		session.save(book1);
		
		Book book2 = new Book("蘋果媽媽最受歡迎的超萌塗鴉書：讓大小朋友與親子都愛的快樂畫畫趣");
		book2.setAuthors("蘇琬清");
		book2.setISBN("9789863710608");
		session.save(book2);
		
		Book book3 = new Book("首爾超導覽 2017");
		book3.setAuthors("蕭辰倢");
		book3.setISBN("9789863770916");
		session.save(book3);
		
		Book book4 = new Book("首爾地鐵地圖快易通2017-2018");
		book4.setAuthors("蕭辰倢");
		book4.setISBN("9789863770916");
		session.save(book4);
		
		Book book5 = new Book("神奇小手指動一動：我的朋友呢？");
		book5.setAuthors("夏洛特‧嘉斯朵");
		book5.setISBN("9789863316589");
		session.save(book5);
			
		session.flush();
		
		session.getTransaction().commit();
		
		HibernateUtil.getSessionFactory().close();
	}
}
