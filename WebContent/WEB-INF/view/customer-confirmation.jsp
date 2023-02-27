<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

	<head>
		<title>Customer Confirmation</title>
		
	</head>
	
	
	<body>
		
		<i>Customer Confirmation</i>
		
		<br><br>
		
		Customer is confirmed: ${customer.firstName} ${customer.lastName}
		
		<br><br>
		
		Free passes: ${customer.freePasses}
		
		<br><br>
		
		Postal code: ${customer.postalCode}
		
		<br><br>
		
		Course code: ${customer.courseCode}
		
	</body>

</html>