<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="st"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login">
<st:textfield label="username" name="username"></st:textfield><br/>
	<st:password label="password" name="password"></st:password>
	<st:submit value="Login"></st:submit>

</form>

</body>
</html>