<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
body{
            font-family: "Comic Sans MS", sans-serif;
            margin: 0;
            background-image: url("images/nature_path.jpg");
            background-size: cover;
            color: white;
        }


footer{
   text-align: center;
   }


</style>
<meta charset="ISO-8859-1">
<title>Employee Projects</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>
<body>
  
  <%
if(session.getAttribute("username")==null)
{
   response.sendRedirect("login.jsp");	
}
	
%>
  
 <div style="background-color:DodgerBlue;">
 <center><h3> Employee Projects </h3></center>
 </div>
 
 <div style="background-color: orange;">
   <marquee behavior="scroll" direction="left" style="color: blue">
  A human resources management system (HRMS) or human resources information system (HRIS) or human capital management (HCM) is a form of human resources (HR) software that combines a number of systems and processes to ensure the easy management of human resources, business processes and data. Human resources software is used by businesses to combine a number of necessary HR functions, such as storing employee data, managing payrolls, recruitment processes, benefits administration, and keeping track of attendance records.

   </marquee>
 </div>
 
  <a href="assignProject.jsp" class="btn btn-primary"> Assign Project</a>
  <a href="getProjectDetails.jsp" class="btn btn-primary"> Project Details</a></br></</br></br></br></br></br></br></br><br></br></br></br>
  
 <center><a href="index.html" class="btn btn-primary"> HOME </a></br></br></br></br></br></br></br></br></br></br></br></br></br></br></center> 

<div style="background-color:DodgerBlue;">
<footer>
  <h2>CopyRight &copy; 2018 Pioneer-Soft</h2>
  <p>All Rights are Reserved</p>
  <p>Developed & maintained by Pioneer-Soft</p>
</footer>
</div>

</body>
</html>