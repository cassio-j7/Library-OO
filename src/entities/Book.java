package entities;


import java.io.ObjectInputFilter.Status;
import java.util.Date;

public class Book {
	
	private Short id;
	private String title;
	private String author;
	private Date yearPublication;
	private Status statusRent;
	private Date dateRent;
	
	public Book() {}

	public Book(Short id, String title, String author, Date yearPublication, Status statusRent, Date dateRent) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.yearPublication = yearPublication;
		this.statusRent = statusRent;
		this.dateRent = dateRent;
	}
	
	
	
	
	
	
	
	

}
