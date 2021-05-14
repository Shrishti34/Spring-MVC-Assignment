package ValidationAPI;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull
	@Size(min=2, max=30)
	@Pattern(regexp="^[a-zA-Z0-9]{3}",message="length must be 20")
	private String username;
	
	
	@Size(min=2, max=30)
	@NotNull
	@Pattern(regexp="^[a-zA-Z0-9]{3}[_@#$.]",message="length must be 3")
	private String password;
	
	@NotNull
	@Min(1)
	private String email;
	
	@NotNull
	@Min(10)
	@Pattern(regexp="^[0-9]")
	private int contact;
	
	@NotNull
	private int city;
	
	@NotNull
	@Min(6)
	private int zip;
	
	
	public void properties(String username, String password, String email,
			 int contact,int city,int zip) {
		this.username = username;
        this.password = password;
        this.email = email;
        this.contact = contact;
        this.city = city;
        this.zip = zip;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getContact() {
		return contact;
	}


	public void setContact(int contact) {
		this.contact = contact;
	}


	public int getCity() {
		return city;
	}


	public void setCity(int city) {
		this.city = city;
	}


	public int getZip() {
		return zip;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}
	
	public String toString() {
		return "Customer(Username: " + this.username + ",Email: " + this.email + ", Password: " + this.password + ","
				+ "Contact: " + this.contact + ",City: " + this.city + ", Zip: " + this.zip + ")";
	}
	
	
}
