<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<style>
body{
            font-family: "Comic Sans MS", sans-serif;
            margin: 0;
            background-image: url("images/forest.jpg");
            background-size: cover;
            color: white;
        }
        
   td{
    color:yellow;
    padding: 7px;
    font-size: 18px;
   }  
   
   .top-right  { 
            transform:  translateX(90%)translateY(-650%); 
        } 
   
   footer{
   text-align: center;
   }   
   
   input[type='text'],
   input[type='number'],
   input[type='date'],
   input[type='month'],
   input[type='password']
    {
        height: 40px;
        border-radius: 20px;
        border: none;
        padding: 0;
        text-align:center;
        color: red;
     } 
     
     input[type='submit']
    {
        height: 30px;
        border-radius: 10px;
        border: none;
        padding: 30;
        text-align: center;
        color: red;
        background-color: orange;
     }        
     
     td{
            padding: 7px;
            font-size: 18px;
        }    

</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
</head>
<body>
<div style="background-color:DodgerBlue;">
<center> <h2>LOGIN FORM</h2></center>
</div>
<div style="background-color: orange;">
   <marquee behavior="scroll" direction="left" style="color: blue">
  A human resources management system (HRMS) or human resources information system (HRIS) or human capital management (HCM) is a form of human resources (HR) software that combines a number of systems and processes to ensure the easy management of human resources, business processes and data. Human resources software is used by businesses to combine a number of necessary HR functions, such as storing employee data, managing payrolls, recruitment processes, benefits administration, and keeping track of attendance records.

   </marquee>
 </div>


<center> <p style="color:red">
  <c:forEach items="${errorsData}" var="obj">
    ${obj}<br>
  </c:forEach>
</p></center>
 

<center> <p style="color:red">
  <c:forEach items="${flag}" var="obj">
    ${obj}<br>
  </c:forEach>
</p></center>
 
 
<form action="EmployeeLoginServlet" method="post" >
<center><table style="width:50%">
   
 <tr>
   <td>EmailId     </td>
   <td><input type="text" name="email"  placeholder="EmailId"/></br> </br></td>
  </tr>
  
  <tr>
  <td></td>
  </tr>
 
 <tr>
   <td>UserName    </td>
   <td> <input type="text" name="username" placeholder="UserName"></br></br></td>
  </tr>
 
 <tr>
   <td>Password    </td>
   <td> <input id="pwd" type="password" name="password" placeholder="Password"></br> </br></td>
  </tr>
  
  
  <tr>
   <td><input type="checkbox" onclick="myFunction()">Show Password</br> </br></td>
  </tr>
 

<tr>
<td><input type="submit" Value="LOGIN"></td>
<td></td>
<td> <a href="Registration.jsp" class="btn btn-primary"> Register </a> </td>
</tr>

<center><a href="index.html" class="btn btn-success"> HOME </a></center>


</br>



</table></center>          
</br></br></br></br></br></br></br></br>

<div style="background-color:DodgerBlue;">

<footer>
  <h2>CopyRight &copy; 2018 Pioneer-Soft</h2>
  <p>All Rights are Reserved</p>
  <p>Developed & maintained by Pioneer-Soft</p>
</footer>
</div>

 
 
 
 

</form>
 <script>


  function myFunction()
  {
    var id = document.getElementById("pwd");
    if(id.type=="password")
     {
          id.type="text";
 	 }
     else{
          id.type="password";
         }
     
  }
  
 

 </script>
 


</body>
</html>