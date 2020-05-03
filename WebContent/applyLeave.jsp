<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>

<style type="text/css">
        
body{
            font-family: "Comic Sans MS", sans-serif;
            margin: 0;
            background-image: url("images/hrms3.jpg");
            background-size: cover;
            color: white;
        }
        
   td{
    color:red;
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
        color: yellow;
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
<center> <h2>Apply Leave FORM</h2></center>
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
 

<form action="EmployeeApplyLeaveServlet" method="post" >
<center><table style="width:50%">
  <tr>
   <td>   Employee No   </td>
   <td> <input type="text" name="empNo" placeholder="Employee Number"></br></br></td>
  </tr>
 
  
  
  <tr>
   <td>Type of Leave </td>
   <td><select name = "typeofleave">
                    <option value = "Sick ">Sick </option>
                    <option value = " Casual  ">Casual </option>
                    <option value = " Maternity "> Maternity </option>
                    </select></br></br>
   </td>
  </tr>
  
   <tr>
   <td>START-DATE</td>
   <td>   <input type="date" id="startdate" name="startdate" placeholder="StartDate"></br></br></td>
  </tr>
  
  <tr>
   <td>END-DATE</td>
   <td>   <input type="date" id="enddate" name="enddate" placeholder="EndDate"></br></br></td>
  </tr>
  
    <tr>
   <td>NO.Of.Leaves</td>
   <td> <input type="text" name="noofleaves" placeholder="No.Of.Leaves"/></br></br></td>
  </tr>
  
  <tr>
   <td><input type="submit" Value="APPLY">
   </td>
  </tr>
 
</table></center>

 <center><a href="index.html" class="btn btn-primary"> HOME </a>
 <a href="leaves.jsp" class="btn btn-primary">BACK</a></br></br></br></br></br></br></br></br></br></br></br></br></br></br>
 </center> 
 
 
 
 <div style="background-color:DodgerBlue;">

<footer>
  <h2>CopyRight &copy; 2018 Pioneer-Soft</h2>
  <p>All Rights are Reserved</p>
  <p>Developed & maintained by Pioneer-Soft</p>
</footer>
</div>
 

</form>
</body>
</html>