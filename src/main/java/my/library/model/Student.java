package my.library.model;

import lombok.Getter;

public class Student extends Member {

	@Getter private int grade;
	
	@Override
	public int getQuota() {
		return 5;
	}

}
