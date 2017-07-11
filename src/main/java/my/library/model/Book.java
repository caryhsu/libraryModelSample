package my.library.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
	Book() {
		
	}
	
	public Book(String name) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
	}
}
