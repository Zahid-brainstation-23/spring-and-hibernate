package com.mvc;

import java.util.HashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private HashMap<String, String> countryList;
	Student(){
		countryList = new HashMap<String, String>();
		countryList.put("Bangladesh", "Bangladesh");
		countryList.put("India", "India");
		countryList.put("Italy", "Italy");
		countryList.put("USA", "USA");
		
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public HashMap<String, String> getCountryList() {
		return countryList;
	}

	
}
