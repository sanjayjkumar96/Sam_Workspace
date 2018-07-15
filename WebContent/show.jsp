<%@page import="com.ebill.entities.Consumer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Consumer Details</h3>
<table border="2">
<tr>
	<th>Customer Id</th>
	<th>Customer Name</th>
	<th>Customer Address</th>
	<th></th>
</tr>
<c:forEach var="consumer" items="${details}"> 
<tr>
	<td>${consumer.consumerId}</td>
	<td>${consumer.consumerName}</td>
	<td>${consumer.consumerAddress}</td>
	<td><a href="Show Bill Details">Show Bill Details</a>
</tr>
<br>
</c:forEach>
</table>
<a href="EBillController">Home</a>
</body>
</html>