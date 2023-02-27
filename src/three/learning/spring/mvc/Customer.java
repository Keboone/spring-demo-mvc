package three.learning.spring.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import three.learning.spring.mvc.validation.CourseCode;

public class Customer 
{
	// add class attributes
	// add validation rule to Customer class
	
	@Pattern(regexp="^[A-Z]{1}[a-z]+$", 
			message="you should only use letters and start with a capital letter!")
	@NotNull(message="is required!")
	@Size(min=1, message="is required!")
	private String firstName;
	
	@Pattern(regexp="^[A-Z]{1}[a-z]+$", 
			message="you should only use letters and start with a capital letter!")
	@NotNull(message="is required!")
	@Size(min=1, message="is required!")
	private String lastName;
	
	
	// tutaj nie dajemy int tylko Integer, jeżeli chcemy zwalidować NotNull, 
	// bo gdy nic nie wpiszemy w pole wyskoczy nam wyjątek, a nie nasz error message
	// (trzeba to też zmienić przy getterzei setterze)
	@NotNull(message="is required!")
	@Min(value=0, message="you must type the number greater or equal to 0!")
	@Max(value=10, message="you must type the number less or equal to 10!")
	private Integer freePasses;
	
	@Pattern(regexp="^[0-9]{2}-[0-9]{3}$", 
			message="you must type 5 digits separated by dash after 2 first digits!")
	@NotNull(message="is required!")
//	@Size(min=6, message="is required!")
	private String postalCode;
	
	
	// CUSTOM ANNOTATION VALIDATION
	
	
	
//	@NotNull(message="is required!")
//	@Pattern(regexp="^LUV\\w+$", message="must start with LUV")
	@CourseCode(value={"LUV", "TOPS"}, message="must start with LUV or TOPS")
	private String courseCode;
	
	
	
	
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
	public Integer getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	
}
