<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<input type="text" name="namme">
<input type="text" name="namme">

<input type="submit" value="Go">
</form>

Hi <c:out value="${paramValues.name[0]} ${paramValues.name[1]}  "></c:out>
<table>
<c:forEach begin="1" end="10" var="counter">
<tr><td>|${counter}|</tr></td>
</c:forEach>

</table>
</body>
</html>