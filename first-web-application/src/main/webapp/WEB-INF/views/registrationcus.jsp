<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>User Details</h1>

<form : form action = "helloagain" modelAttribute = "cust">
            Enter username : <input type="text" name="username"><br/><br/>
            Enter Password : <input type="password" name ="pass"><br/>
            Enter Email : <input type="text" name ="email"><br/>
            Enter Contact : <input type="number" name ="cont"><br/>
            Enter City : <input type="number" name ="city"><br/>
            Enter Zip Code: <input type="number" name ="zip"><br/>
            <form:errors path="pass" cssClass="error"/><br><br>
                <input type ="submit" value="REGEISTER">    
        </form>
        
</body>
</html>