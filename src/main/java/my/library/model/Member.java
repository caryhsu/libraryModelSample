package my.library.model;

import lombok.Getter;

public abstract class Member {

	@Getter private String id;
	
	@Getter private String name;
	
	@Getter private Gender gender;
	
	@Getter private String address;
	
	public abstract int getQuota();
	
}
