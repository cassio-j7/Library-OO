package entities;

public class Teacher extends Person {
	
	private Integer enrolment;
	private String university;
	
	public Teacher() {}

	public Teacher(Short id, String name, Address address, Integer enrolment, String university) {
		super(id, name, address);
		this.enrolment = enrolment;
		this.university = university;
	}
	
	

	
}
	
	
	
