<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<%@page isELIgnored="false" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Location</title>

<form action="updateLoc" method="">
<pre>
	Id:<input type="text" name="id" value="${location.id}" readonly/> 
	Code:<input type="text" name="code" value="${location.code}"/>
	Name:<input type="text" name="name" value="${location.name}"/> 
	Type: Urban<input type="radio" name="type" value="URBAN" ${location.type=='URBAN'?'checked':''}/> 
		Rural<input type="radio" name="type" value="RURAL" ${location.type=='RURAL'?'checked':''}/> 
		<input type="submit" value="save" />
</pre>
</form>

</head>
<body>

</body>
</html>