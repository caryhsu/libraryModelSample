

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import my.library.configuration.AppConfig;
import my.library.model.Book;
import my.library.service.BookService;

public class AppMain {

	public static void main(String args[]) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		BookService service = (BookService) context.getBean("bookService");
		service.create("aaa", "bbb", "ccc");
//		System.out.println();
		context.close();
	}
}
