<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="Login.css">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
      <div class="navbar-nav">
        
        
        <a class="navbar-brand " href="index.jsp">HOME</a>
        <%if(session.getAttribute("log")!="true"){
        	
		out.println("  <a class='nav-link' href='Login.jsp'>Login</a>   ");
		out.println(" <a class='nav-item nav-link' href='Registration.jsp'>Register</a>  ");
		
        }
        else{
        	
 		out.println(" <a class='button nav-item nav-link btn btn-info' href='LogoutServlet'>logout</a>  ");
        	
       }%>
        
        
         
          	
          	
          
          
          
          
          
      </div>
    </nav>
</body>
</html>