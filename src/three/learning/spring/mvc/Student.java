package three.learning.spring.mvc;

import java.util.LinkedHashMap;

public class Student 
{
	private String firstName;
	private String lastName;
	private String country;
	
//	private LinkedHashMap<String, String> countryOptions;
	
	private String favouriteLanguage;
	private LinkedHashMap<String, String> favouriteLanguageOptions;
	
	private String[] operatingSystems;
	
	
	public Student() 
	{
//		// wypełnij opcję wyboru kraju używając kodu ISO 
//		countryOptions = new LinkedHashMap<>();
//		
//		countryOptions.put("PL", "Poland");
//		countryOptions.put("BR", "Brazil");
//		countryOptions.put("DE", "Germany");
//		countryOptions.put("CHE", "Switzerland");
//		countryOptions.put("IN", "India");
		
		favouriteLanguageOptions = new LinkedHashMap<>();
		
		favouriteLanguageOptions.put("Java", "Java");
		favouriteLanguageOptions.put("Python", "Python");
		favouriteLanguageOptions.put("C++", "C++");
		favouriteLanguageOptions.put(".NET", ".NET");
		favouriteLanguageOptions.put("C#", "C#");
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
	
//	public LinkedHashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}

	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}

	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}

	public LinkedHashMap<String, String> getFavouriteLanguageOptions() {
		return favouriteLanguageOptions;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	
	
}
