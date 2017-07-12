package my.library.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

public class Book {

	@Getter private String id;
	
	@Getter @Setter private String name;
	
	@Getter @Setter private String authors;
	
	@Getter @Setter private String ISBN;
	
	@Getter @Setter private Status status;	

	@Getter private List<Record> records;
		
	public Book(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.status = Status.IN;
		this.records = new ArrayList<Record>();
	}

	public void borrowBook(Member member) {
		this.status = Status.OUT;
		this.records.add(0, new Record(this, member));
	}

	public void returnBook() {
		this.status = Status.IN;
		this.records.get(0).setReturnTime(new Date());;
	}
}
