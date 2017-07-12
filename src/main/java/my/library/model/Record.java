package my.library.model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

public class Record {

	@Getter private Date borrowTime;
	
	@Getter @Setter private Date returnTime;

	@Getter private Book book;
	
	@Getter private Member member;
	
	Record() {
	}

	public Record(Book book, Member member) {
		this.book = book;
		this.borrowTime = new Date();
		this.returnTime = null;
		this.member = member;
	}
	
}
