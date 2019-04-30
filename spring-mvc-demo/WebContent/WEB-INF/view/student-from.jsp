<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<html>
<head>
<title>Student Registration Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">

First name: <form:input path="firstName" />
		<br>
		<br>
Last name: <form:input path="lastName" />
		<br>
		<br>
		<form:select path="country">
			<form:options items="${student.countryOptions}" />
		</form:select>

		<br>
		<br>
		
     Favorite Language:
          Java<form:radiobutton path="favoriteLanguage" value="Java"/>
     
          Javascript<form:radiobutton path="favoriteLanguage" value="Javascript"/>
     
          PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
     
          Python<form:radiobutton path="favoriteLanguage" value="Python"/>

						<br>
						<br>
		Operating System:
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		MS Windows<form:checkbox path="operatingSystems" value="MS Windows"/>
		Mac OS<form:checkbox path="operatingSystems" value="Mac OS"/>
		
		<br><br>
		

						<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
