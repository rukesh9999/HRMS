<%@page import="com.employee.EmpVo.EmployeePaySalaryVO"%>
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
            background-image: url("images/img10.jpg");
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
<center><h3>INDIVIDUAL EMPLOYEE SALARY DETAILS </h3></center>
</div>
<div style="background-color: orange;">
   <marquee behavior="scroll" direction="left" style="color: blue">
  A human resources management system (HRMS) or human resources information system (HRIS) or human capital management (HCM) is a form of human resources (HR) software that combines a number of systems and processes to ensure the easy management of human resources, business processes and data. Human resources software is used by businesses to combine a number of necessary HR functions, such as storing employee data, managing payrolls, recruitment processes, benefits administration, and keeping track of attendance records.

   </marquee>
 </div>

<% 
EmployeePaySalaryVO  EmployeePaySalaryVO = (EmployeePaySalaryVO)request.getAttribute("EmployeePaySalaryVO");
//out.print("<center>"+employeeLeaveDetailsVo.getEmpNo()+".."+employeeLeaveDetailsVo.getTypeOfLeave()+".."+employeeLeaveDetailsVo.getStartDate()+".."+employeeLeaveDetailsVo.getEndDate()+"..."+employeeLeaveDetailsVo.getNoOfLeaves()+"</center>") ;%>

  <center>  <table style="width:80%" border="5">
  <tr>
   <th> EMPNO   </th>
   <th> BASIC_SALARY   </th>
   <th> HRA </th>
   <th> OTHER_ALLOWANCES </th>
   <th> GROSS_SALARY </th>
   <th>PF</th>
   <th> CTC </th>
   <th>Deductions</th>
   <th>Net_Pay</th>
   
    
      
   </tr>  
   <tr>
      
       <td><% out.print(EmployeePaySalaryVO.getEmpNo()); %></td>
       <td><% out.print(EmployeePaySalaryVO.getBasicsalary());%></td>
       <td><% out.print(EmployeePaySalaryVO.getHra());%></td>
       <td><% out.print(EmployeePaySalaryVO.getOtherallowances());%></td>
       <td><% out.print(EmployeePaySalaryVO.getGrosssalary());%></td>
       <td><% out.print(EmployeePaySalaryVO.getPf());%></td>
       <td><% out.print(EmployeePaySalaryVO.getCtc());%></td>
       <td><% out.print(EmployeePaySalaryVO.getDeductions());%></td>
       <td><% out.print(EmployeePaySalaryVO.getNetpay());%></td>
       
   </tr>
  </table></center>
  
          <center><a href="index.html" class="btn btn-primary">HOME</a>
          <a href="getIndividualEmployeeSalaryInfo.jsp" class="btn btn-primary">BACK</a></br></br></br></br></br></br></br></br></br></br></br></br></br></br>
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


	  
