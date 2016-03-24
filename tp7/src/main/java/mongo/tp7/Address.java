package mongo.tp7;

import java.util.ArrayList;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity
 class Address {
	@Id
	private String street;
	private String city;
	private String country;
	private String postCode;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	public String toString(){
		 return ("Country: " + getCountry() + 
				 ", City: " + getCity() + 
				 ", Street: " + getStreet());
		 
	}
		

}
