<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Balance</title>
</head>
<body>
<h1>
	<%    
	session=request.getSession();
	String s=(String)session.getAttribute("balance");
	out.println("Your Account Balance is : "+s);
	
	%>
	</h1>
<button>HOME</button>
</body>
</html>