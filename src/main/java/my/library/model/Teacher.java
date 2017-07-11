package my.library.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("TEACHER")
public class Teacher extends Member {

	@Override
	public int getQuota() {
		return 10;
	}

}
