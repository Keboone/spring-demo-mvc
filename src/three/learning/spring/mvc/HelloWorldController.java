package three.learning.spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController
{
	// need controller method to show the initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	// need a controller method to process the HTML form
	
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	
	// new controller method to read form data and add data to the model
	
//	@RequestMapping("/processFormVersionTwo")
//	public String letsShoutDude(HttpServletRequest request, Model model)
//	{
//		// read the request parameter from the HTML form
//		String theName = request.getParameter("studentName");
//	
//		// convert data to all upper case (caps)
//		theName = theName.toUpperCase();
//		
//		// create the message
//		String result = "Yo! " + theName;
//		
//		// add message to the model
//		model.addAttribute("message", result);
//		
//		return "helloworld";
//	}
	
	// ta sama metoda co wyżej, ale z @RequestParam zamiast request.getParameter
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model)
	{
		
		// convert data to all upper case (caps)
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hi my friend v3! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	
}
