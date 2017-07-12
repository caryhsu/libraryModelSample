package my.library.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "BOOK")
public class Book {

	@Id
	@Column(name = "ID", nullable = false)
	@Getter private String id;
	
	@Column(name = "NAME", nullable = false)
	@Getter @Setter private String name;
	
	@Column(name = "AUTHORS", nullable = false)
	@Getter @Setter private String authors;
	
	@Column(name = "ISBN", nullable = false)
	@Getter @Setter private String ISBN;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "STATUS", nullable = false)
	@Getter @Setter private Status status;	

	@OrderBy("borrowTime desc")
	@OneToMany(cascade=CascadeType.ALL, mappedBy="book", orphanRemoval=true)
	@Getter private List<Record> records;
	
	Book() {
		
	}
	
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
