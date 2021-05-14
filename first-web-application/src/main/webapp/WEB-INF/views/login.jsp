<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv = "Content-Type" content = "Text/html" charset=UTF-8">
<title>Yahoo!!!!!!!!!! From JSP</title>
</head>
<body>
///My name is $ {name} and password is $ {password}

<form action = "/login" method = "post">
<p><font color = "red">$ {error Message} </font></p>
Name: <input type = "text" name = "name"/>
Password: <input type = "password" name = "password"/>
<input type = "submit" value = "Login"/>
</form>

</body>
</html>


//"ISO-8859-1"