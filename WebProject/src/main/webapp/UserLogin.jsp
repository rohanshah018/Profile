<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor='pink' text=#03315F>
<div align="center">Login Form

<form action="Login.jsp" method="post">

<table border="2">

<tr><td>User Name</td><td><input type="text" name="uname"></td></tr>
<tr><td>Password</td><td><input type="password" name="password"></td></tr>
<tr><td colspan = "2" align = "center"><input type="submit" value="Login"></td></tr>
<tr><td colspan = "2" align = "center">Not registered yet?<br>
<a href="RegisterUser.jsp">Click here to register</a></td></tr>
</table>
</form>
</div>

</body>
</html>