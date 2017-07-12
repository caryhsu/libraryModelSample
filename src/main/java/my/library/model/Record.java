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
import lombok.Setter;

@Entity
@Table(name="RECORD")
public class Record {

	@Id
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="BORROW_TIME", nullable=false)
	@Getter private Date borrowTime;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="RETURN_TIME", nullable=true)
	@Getter @Setter private Date returnTime;

	@ManyToOne()
	@JoinColumn(name="BOOK_ID", nullable=false)
	@Getter private Book book;
	
	@ManyToOne()
	@JoinColumn(name="MEMBER_ID", nullable=true)
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
