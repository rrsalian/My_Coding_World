<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Login</title>
<link rel="stylesheet" href="Login.css">
</head>
<body>
<jsp:include page="Base.jsp" />


<!-- https://bootsnipp.com/snippets/0ekvA -->

 <div class="login-wrap">
 	
	<div class="login-html">
		<%if(request.getAttribute("match")!=null){
		out.println("<p class='text-center' style='color:red'>Your password was incorrect. Check your password.</p>");
       }%>	
		<input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab">Sign In</label>
		
		<div class="login-form">
		<form action="LoginServlet" method="post">
				<div class="group">
					<label for="user" class="label">Email</label>
					<input name="mail" id="user" type="text" class="input">
				</div>
				<div class="group">
					<label for="pass" class="label">Password</label>
					<input name="pass" id="pass" type="password" class="input" data-type="password">
				</div>
				<div class="group">
					<input type="submit" class="button" value="Sign In">
				</div>
				<div class="hr"></div>
		</form>	
		</div>
	</div>
</div>

</body>
</html>