package entities;

public class Address {
	
	private Short id;
	private String street;
	private Integer number;
	private String neighborhood;
	private String city;
	private Integer zipCode;
	
	public Address() {}
	
	public Address(Short id, String street, Integer number, String neighborhood, String city, Integer zipCode) {
		super();
		this.id = id;
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
		this.city = city;
		this.zipCode = zipCode;
	}
	
}
