<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="st"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Page</title>
</head>
<body>
	
	<st:form action="register">
	<st:textfield label="username" name="username"></st:textfield>
	<st:password label="password" name="password"></st:password>
	<st:password label="confirmpassword" name="confirmpassword"></st:password>
	<st:submit value="Register"></st:submit>
	
	</st:form>

</body>
</html>