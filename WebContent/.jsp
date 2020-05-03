<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="background-color:DodgerBlue;">
<center><h3> Index Page</h3></center>
</div>
<% 
String empName=(String)request.getAttribute("empName");
out.print(empName+"..... registered successfullly...") ;%>

</body>
</html>