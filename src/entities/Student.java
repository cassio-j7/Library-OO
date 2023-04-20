package entities;

public class Student extends Person {
	
	private Integer enrolment;
	private String course;
	
	public Student() {}

	public Student(Short id, String name, Address address, Integer enrolment, String course) {
		super(id, name, address);
		this.enrolment = enrolment;
		this.course = course;
	}

	
	
	

}
