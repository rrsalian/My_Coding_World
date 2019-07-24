<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME </title>
</head>
<body>
	<jsp:include page="Base.jsp" />
	
	
	<%if(session.getAttribute("log")==null){
    request.getRequestDispatcher("welcome.jsp").forward(request,response);
    
}
else {
	request.getRequestDispatcher("Documents.jsp").forward(request,response);
 }%>
	
	
</body>
</html>