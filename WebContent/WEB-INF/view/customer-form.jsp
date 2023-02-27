<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Customer Registration Form</title>
		
		<style>
			.error{color:red}
		</style>
	</head>
	
	
	<body>
		
		<i>Fill out the form (*) means required.</i>
		
		<br><br>
		
		<form:form action="processForm" modelAttribute="customer">
			
			First name (*): <form:input path="firstName" />
			<%-- tego nie widac za pierwszym razem dopiero gdy 
			walidacja sie nie powiedzie po przeslaniu formularza --%>
			<form:errors path="firstName" cssClass="error" />
			
			<br><br>
			
			Last name (*): <form:input path="lastName" />
			
			<form:errors path="lastName" cssClass="error" />
			
			<br><br>
			
			Free pasess (*): <form:input path="freePasses" />
			<form:errors path="freePasses" cssClass="error" />
			
			<br><br>
			
			Postal code (*): <form:input path="postalCode" placeholder="eg. 00-000" />
			<form:errors path="postalCode" cssClass="error" />
			
			<br><br>
			
			Course code: <form:input path="courseCode" />
			<form:errors path="courseCode" cssClass="error" />
			
			<br><br>
			
			<input type="submit" value="Submit" />
			
		</form:form>
		
		
	</body>

</html>