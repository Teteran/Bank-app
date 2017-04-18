package model;

public class Adress {

	private String street;
	private String postCode;
	private String city;
	
	public Adress(String streetRef, String postCodeRef, String cityRef){
		street = streetRef;
		postCode = postCodeRef;
		city = cityRef;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString(){
		return "Adress: "+ street + ", " + postCode + ", " + city;
	}

	
}
