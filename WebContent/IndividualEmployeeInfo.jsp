<%@page import="com.employee.EmpVo.EmployeeCompleteInfoVO"%>
<%@page import="com.employee.EmpVo.EmployeePerformanceAndReviewVO"%>
<%@page import="com.employee.EmpVo.EmployeePaySalaryVO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">

body{
            font-family: "Comic Sans MS", sans-serif;
            margin: 0;
            background-image: url("images/img9.jpg");
            background-size: cover;
            color: white;
        }
        
        
td{
    color:yellow;
    padding: 7px;
    font-size: 18px;
   }  
   
  th{
    color:red;
    padding: 7px;
    font-size: 18px;
   }        
   
   footer{
   text-align: center;
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
<center><h3>INDIVIDUAL EMPLOYEE INFORMATION  DETAILS </h3></center>
</div>

<div style="background-color: orange;">
   <marquee behavior="scroll" direction="left" style="color: blue">
  A human resources management system (HRMS) or human resources information system (HRIS) or human capital management (HCM) is a form of human resources (HR) software that combines a number of systems and processes to ensure the easy management of human resources, business processes and data. Human resources software is used by businesses to combine a number of necessary HR functions, such as storing employee data, managing payrolls, recruitment processes, benefits administration, and keeping track of attendance records.

   </marquee>
 </div>

<% 
EmployeeCompleteInfoVO  EmployeeCompleteInfoVO = (EmployeeCompleteInfoVO)request.getAttribute("EmployeeCompleteInfoVO");
//out.print("<center>"+employeeLeaveDetailsVo.getEmpNo()+".."+employeeLeaveDetailsVo.getTypeOfLeave()+".."+employeeLeaveDetailsVo.getStartDate()+".."+employeeLeaveDetailsVo.getEndDate()+"..."+employeeLeaveDetailsVo.getNoOfLeaves()+"</center>") ;%>

  <center>  <table style="width:100%" border="5">
  <tr>
   <th> EmpNo   </th>
   <th> EmpName   </th>
   <th> EmailId </th>
   <th> Department </th>
   <th>Package</th>
   <th>ProjectWorkingON</th>
   <th>ProjectStatus </th>
   <th>EmployeePerformance</th>
  <th>TypeofBand</th>
                     
   </tr>  
   <tr>
   
       <td><% out.print(EmployeeCompleteInfoVO.getEmpNo()); %></td>
       <td><% out.print(EmployeeCompleteInfoVO.getEmpName());%></td>
       <td><% out.print(EmployeeCompleteInfoVO.getEmailId());%></td>
       <td><% out.print(EmployeeCompleteInfoVO.getDepartment());%></td>
       <td><% out.print(EmployeeCompleteInfoVO.getCtc());%></td>
       <td><% out.print(EmployeeCompleteInfoVO.getNameoftheProject());%></td>
       <td><% out.print(EmployeeCompleteInfoVO.getProjectStatus());%></td>
       <td><% out.print(EmployeeCompleteInfoVO.getEmployeeperformance());%></td>
       <td><% out.print(EmployeeCompleteInfoVO.getTypeofband());%></td>
       
   </tr>
  </table></center>
  
          <center><a href="index.html" class="btn btn-primary">HOME</a>
          <a href="getIndividualEmployeeInfo.jsp" class="btn btn-primary">BACK</a></br></br></br></br></br></br></br></br></br></br></br></br></br></br>
          </center> 
          
          
          <div style="background-color:DodgerBlue;">
<footer>
  <h2>CopyRight &copy; 2018 Pioneer-Soft</h2>
  <p>All Rights are Reserved</p>
  <p>Developed & maintained by Pioneer-Soft</p>
</footer>
</div>

          
  
</body>
</html>


	  
