package my.library.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;

@Entity
@DiscriminatorValue("STUDENT")
public class Student extends Member {

	@Getter private int grade;
	
	@Override
	public int getQuota() {
		return 5;
	}

}
