package my.library.repository;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import my.library.configuration.JpaConfig;
import my.library.dao.BookRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { JpaConfig.class })
public class BookRepositoryTest {

	@Autowired 
	//@Qualifier("bookRepositoryImpl")
	private BookRepository bookRepository;

	@Transactional
	@Test
	public void testCreate() {
		bookRepository.create("test1", "a1", "000");
	}

}
