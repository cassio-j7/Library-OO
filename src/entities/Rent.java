package entities;

import java.util.Date;

public class Rent {
	
	private Short id;
	private Date dateLease;
	private Date dateReturn;
	private Person client;
	
	public Rent() {}

	public Rent(Short id, Date dateLease, Date dateReturn, Person client) {
		this.id = id;
		this.dateLease = dateLease;
		this.dateReturn = dateReturn;
		this.client = client;
	}

	
	

}
