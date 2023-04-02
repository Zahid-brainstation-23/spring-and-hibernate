package com.mvc;

import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.mvc.validator.FirstNameValidator;




public class Student {
	@FirstNameValidator(value = "MD.",message = "First name should start with MD.")
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min=1,message = "is required")
	private String lastName;
	
	@NotNull(message = "is required")
	@Min(value = 5,message="Age must be greater than or equal to 5")
	@Max(value = 30 ,message = "Age must be less than or equal to 30")
	private Integer age;
	
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
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	
	

	
}
