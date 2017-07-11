package my.library.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="M_TYPE", discriminatorType = DiscriminatorType.STRING)
@Table(name = "MEMBER")
public abstract class Member {

	@Id
	@Column(name = "ID", nullable = false)
	@Getter private String id;
	
	@Column(name = "NAME", nullable = false)
	@Getter private String name;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "GENDER", nullable = false)
	@Getter private Gender gender;
	
	@Column(name = "ADDRESS", nullable = false)
	@Getter private String address;
	
	public abstract int getQuota();
	
}
