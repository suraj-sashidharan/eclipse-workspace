<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://mydynamicwebproject.suraj.edu" prefix="mtl" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Default page index.jsp</title>
</head>
<body>
   <mtl:printMapStringToStringArray caption="Request headers" map="${headerValues}"/>
   <mtl:printMapStringToStringArray caption="Request parameters" map="${paramValues}"/>
</body>
</html>