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
	<st:form action="reg">
	<st:textfield label="username" name="username"></st:textfield>
	<st:textfield label="usercity" name="usercity"></st:textfield> 
	<st:submit value="register"></st:submit>
	</st:form>
</body>
</html>