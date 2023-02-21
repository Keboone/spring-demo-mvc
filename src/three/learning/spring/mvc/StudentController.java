package three.learning.spring.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController 
{
	// do odczytywania panstwa z pliku
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;

	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) 
	{
		// create new Student object
		
		Student theStudent = new Student();
		
		// add Student object to the model
		
		theModel.addAttribute("student", theStudent);
		
		// do odczytywania panstwa z pliku
		theModel.addAttribute("theCountryOptions", countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent)
	{
		// wypisanie logu w konsoli zeby potwierdzic ze wszystko sie wykonuje poprawnie
		System.out.println("theStudent: " + theStudent.getFirstName() + 
				" " + theStudent.getLastName());
		
		return "student-confirmation";
	}
}	
