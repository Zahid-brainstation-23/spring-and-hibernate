package com.mvc;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	private String firstName;
	private String lastName;
	private String country;
	private HashMap<String, String> countryList;
	private String favoriteLanguage;
	private ArrayList<String> operatingSystems;
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
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	public ArrayList<String> getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(ArrayList<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	

	
}
