package gameShop;

import Abstract.IEntity;

public class Players implements IEntity {
	
	private int id;
	private String FirstName;
	private String LastName;
	private int Year;
	private String Email;
	private String Country;
	private String User;
	public Players(int id, String firstName, String lastName, int year, String email, String country, String user) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Year = year;
		Email = email;
		Country = country;
		User = user;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}

	
	

	
}
