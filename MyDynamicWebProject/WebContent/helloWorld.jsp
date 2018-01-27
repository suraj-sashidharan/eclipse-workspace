<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://mydynamicwebproject.suraj.edu" prefix="mtl" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contacts</title>
</head>
<body>    
    <c:set var="x" value="MangaPayale"/>
    <c:out value="${x}"/>
    <%--= request.getParameter("name") --%>
    <label>${paramValues["mobileNum"][0]}</label>
	<jsp:useBean id="contact" class="edu.suraj.mydynamicwebproject.Contact" scope="page"></jsp:useBean>
	<jsp:setProperty property="name" name="contact"/>
	<label>${contact["name"]}</label>
	<label>${contact["mobileNum"]}</label>
	<label>${contact["myArray"]["1"]}</label>
	<label>${contact.myArray[0]}</label>

	<b>Contacts</b>
	<form method="post" action="helloWorld.jsp">
		<label>Name</label> <input type="text" name="name"
			value='<jsp:getProperty property="name" name="contact"/>'></input>		
	    <label>Mobile</label> <input type="text" name="mobileNum"
			value='<jsp:getProperty property="mobileNum" name="contact"/>'></input>
		<input type="submit"></input>
	</form>
	<c:out value="bla:${bla}"/>
	<mtl:mft check="${1==2}" kount="3">
	   <c:out value="${x}"/>
	</mtl:mft>
	<c:out value="bla:${bla}"/>
</body>
</html>