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
            background-image: url("images/hrms3.jpg");
            background-size: cover;
            color: white;
        }
        
        
td{
    color:yellow;
    padding: 7px;
    font-size: 18px;
   }  
   
   .top-right  { 
            transform:  translateX(45%) translateY(-1890%); 
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
        padding: 30;
        text-align: center;
        color: red;
     }     
   
   footer{
   text-align: center;
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
<center> <h2> SaveEmployeePerformanceAndReview </h2></center>
</div>
<center> <p style="color:red">
  <c:forEach items="${errorsData}" var="obj">
    ${obj}<br>
  </c:forEach>
</p></center>
 

<form action="EmployeePerformanceAndReviewServlet" method="post" >
<center><table style="width:50%" >
  <tr>
   <td>Employee No   </td>
   <td> <input type="text" name="empNo"></td>
  </tr></br>
 
   
   <tr>
   <td>Communication</td>
  <td>    
  <input type="radio" id="Communication" name="Communication" value="good">
  <label for="good">good</label>
  <input type="radio" id="Communication" name="Communication" value="average">
  <label for="average">average</label>
  <input type="radio" id="Communication" name="Communication" value="worst">
  <label for="worst">worst</label>
  
     
  </tr></br>
 
   <tr>
   <td>Coding Skills</td>
   <td>    
  <input type="radio" id="CodingSkills" name="CodingSkills" value="good">
  <label for="good">good</label>
  <input type="radio" id="CodingSkills" name="CodingSkills" value="average">
  <label for="average">average</label>
  <input type="radio" id="CodingSkills" name="CodingSkills" value="worst">
  <label for="worst">worst</label></td>
                                                                            
  </tr></br>
  
  
  <tr>
   <td>Team-work</td>
 <td> <input type="radio" id="Teamwork" name="Teamwork" value="good">
  <label for="good">good</label>
  <input type="radio" id="Communication" name="Teamwork" value="average">
  <label for="average">average</label>
  <input type="radio" id="Teamwork" name="Teamwork" value="worst">
  <label for="worst">worst</label></td>
   </tr>
  
    <tr>
   <td>Leadership</td>
    <td> <input type="radio" id="Leadership" name="Leadership" value="good">
  <label for="good">good</label>
  <input type="radio" id="Leadership" name="Leadership" value="average">
  <label for="average">average</label>
  <input type="radio" id="Leadership" name="Leadership" value="worst">
  <label for="worst">worst</label></td>

  </tr>
  
  <tr>
   <td>Goal-Setting</td>
    <td> <input type="radio" id="GoalSetting" name="GoalSetting" value="good">
  <label for="good">good</label>
  <input type="radio" id="GoalSetting" name="GoalSetting" value="average">
  <label for="average">average</label>
  <input type="radio" id="GoalSetting" name="GoalSetting" value="worst">
  <label for="worst">worst</label></td>
  </tr>
  
  <tr>
   <td>Time-management</td>
    <td> <input type="radio" id="Timemanagement" name="Timemanagement" value="good">
  <label for="good">good</label>
  <input type="radio" id="Timemanagement" name="Timemanagement" value="average">
  <label for="average">average</label>
  <input type="radio" id="Timemanagement" name="Timemanagement" value="worst">
  <label for="worst">worst</label></td>

  </tr>
 
  <tr>
   <td>Attendance</td>
    <td> <input type="radio" id="Attendance" name="Attendance" value="good">
  <label for="good">good</label>
  <input type="radio" id="Attendance" name="Attendance" value="average">
  <label for="average">average</label>
  <input type="radio" id="Attendance" name="Attendance" value="worst">
  <label for="worst">worst</label></td>

  </tr>
 
 
  <tr>
   <td>Overall-Performance</td>
    <td> <input type="radio" id="OverallPerformance" name="OverallPerformance" value="good">
  <label for="good">good</label>
  <input type="radio" id="OverallPerformance" name="OverallPerformance" value="average">
  <label for="average">average</label>
  <input type="radio" id="OverallPerformance" name="OverallPerformance" value="worst">
  <label for="worst">worst</label></td>

  </tr>
 
 <tr>
   <td>Type-of-Band</td>
    <td> <input type="radio" id="TypeofBand" name="TypeofBand" value="A-band">
  <label for="A-band">A-band</label>
  <input type="radio" id="TypeofBand" name="TypeofBand" value="B-band">
  <label for="B-band">B-band</label>
  <input type="radio" id="TypeofBand" name="TypeofBand" value="C-band">
  <label for="C-band">C-band</label></td>

  </tr>
  
  <tr>
    <td><input type="submit" Value="SUBMIT"></td>
  </tr>
 
</table></center>

 <center><a href="index.html" class="btn btn-primary"> HOME </a>
 <a href="PerformanceReviews.jsp" class="btn btn-primary">BACK</a></br></br></br></br></br></br></br></br></br></br></br></br></br></br>
 </center> 

<div style="background-color: orange;">
   <marquee behavior="scroll" direction="left" style="color: blue">
  A human resources management system (HRMS) or human resources information system (HRIS) or human capital management (HCM) is a form of human resources (HR) software that combines a number of systems and processes to ensure the easy management of human resources, business processes and data. Human resources software is used by businesses to combine a number of necessary HR functions, such as storing employee data, managing payrolls, recruitment processes, benefits administration, and keeping track of attendance records.

   </marquee>
 </div>

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