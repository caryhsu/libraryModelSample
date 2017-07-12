package my.library.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;

@Entity
@Table(name="RECORD")
public class Record {

	@Id
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="TIME", nullable=false)
	@Getter private Date time;
	
	@ManyToOne()
	@JoinColumn(name="BOOK_ID", nullable=false)
	@Getter private Book book;
	
	@ManyToOne()
	@JoinColumn(name="MEMBER_ID", nullable=false)
	@Getter private Member member;
	
	Record() {
	}

	public Record(Book book, Member member) {
		this.book = book;
		this.member = member;
	}
	
}
