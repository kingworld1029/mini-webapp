<%@page import="com.abm.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Employee emp = (Employee) session.getAttribute("empData");
%>

<div>
Empno : <%= emp.getEmpno() %> <br />
Name : <%= emp.getName() %> <br />
Salary : <%= emp.getSalary() %> <br />
</div>
</body>
</html>