<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<img src="co.jfif"><br />
 <c:out value="${requestScope.ub.firstName} ${requestScope.ub.lastName}"></c:out>
 <br /><iframe width="25%" height="400" src="IDKWHATIMDOING.jsp"></iframe>
<iframe width="75%" height="400"></iframe>
</body>

</html>