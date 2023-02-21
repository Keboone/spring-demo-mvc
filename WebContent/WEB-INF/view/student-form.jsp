<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Student Registration Form</title>	
	</head>

	<body>
		
		<form:form action="processForm" modelAttribute="student">
		
			<!-- to co jest w path to jest nazwa wlasnosci klasy Student -->
			First name: <form:input path="firstName" /> 
			
			
			<br><br>
			
			Last name: <form:input path="lastName" />
			
			<br><br>
			
			Country: 
			<%-- tutaj wartosci sa zakodowane na stale (hardcoded) w pliku JSP --%>
			
			<%-- <form:select path="country">
				<form:option value="Poland" label="Poland"></form:option>
				<form:option value="Brazil" label="Brazil"></form:option>
				<form:option value="Germany" label="Germany"></form:option>
				<form:option value="Switzerland" label="Switzerland"></form:option>
			</form:select> --%>
			
			<%-- tutaj mamy wartosci odczytywane z klasy Java(zakomentowane)
			 oraz wartosci odczytywana z osobnego pliku countries.properties --%>
			
			<form:select path="country">
				<%-- <form:options items="${student.countryOptions}" /> --%>
				
				<form:options items="${theCountryOptions}" />
				
			</form:select>
			
			<br><br>
			
			<%-- wybierania ulubionego jezyka programowania za pomoca radiobutton,
			 czyli wybor tylko jednej rzeczy z wymienionych w pliku JSP--%>
			
			<%-- Java <form:radiobutton path="favouriteLanguage" value="Java" />
			Python <form:radiobutton path="favouriteLanguage" value="Python" />
			C++ <form:radiobutton path="favouriteLanguage" value="C++" />
			.NET <form:radiobutton path="favouriteLanguage" value=".NET" /> --%>
			
			<%-- wybierania ulubionego jezyka programowania za pomoca radiobutton,
			 czyli wybor tylko jednej rzeczy z wymienionych w klasie Javy--%>
			 
			<form:radiobuttons path="favouriteLanguage" items="${student.favouriteLanguageOptions}"  />
			
			<br><br>
			
			Operating systems:
			
			Windows <form:checkbox path="operatingSystems" value="Windows" />	
			Linux <form:checkbox path="operatingSystems" value="Linux" />
			Mac OS <form:checkbox path="operatingSystems" value="Max OS" />
			
			<br><br>
			
			<input type="submit" value="Submit" />
			
		</form:form>
		
	</body>

</html>