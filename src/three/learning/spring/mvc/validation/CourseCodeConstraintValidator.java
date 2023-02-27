package three.learning.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator 
	implements ConstraintValidator<CourseCode, String>
{

//	private String coursePrefix; // do pojedyńczej wartości
	private String[] coursePrefixes;
	
	// source>>ovverride/implement methods>> i tam zaznaczyc też initialize
	
	// w initialize zmieniamy constraintAnnotation na theCourseCode - nasza nazwe
	@Override
	public void initialize(CourseCode theCourseCode) 
	{
		// tu uzyskujemy dostep do wartości atrybutu dla tej annotacji
//		coursePrefix = theCourseCode.value(); // do pojedyńczej wartości
		coursePrefixes = theCourseCode.value(); 
		
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) 
	{
		// !!!!!!! w tej metodzie mozemy zrobic co chcemy porozumiec sie z baza danych,
		// wywolac usluge sieciowa lub REST API
		
		boolean result = false;
		
		if(theCode != null)
		{
			
//			result = theCode.startsWith(coursePrefix);
//		}
//		else {
//			return true;
//		}
//
//		return result;  // do pojedyńczej wartości
		
			
			// jak chcemy zrobic z kilkoma prefixami do wyboru
			for (String tempPrefix : coursePrefixes) 
			{
	            result = theCode.startsWith(tempPrefix);
	            
	            // if we found a match then break out of the loop
	            if (result) 
	            {
	                break;
	            }
	        }
		}
		else 
		{
			result = true;
		}
		
		return result;
		
	}
	
	
	
	
}
