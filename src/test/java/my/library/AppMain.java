package my.library;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import my.library.configuration.AppConfig;
import my.library.dao.BookRepository;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BookRepository bookRepository = (BookRepository) context.getBean("bookRepository");
		bookRepository.create("aaa", "bbb", "ccc");
		
		context.close();
	}
}
