<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP/Servlet 26-1</title>
</head>
<body>
		dispatcherJsp.jsp
		<hr>
		
		id : <%= request.getAttribute("id") %> <br>
		pw : <%= request.getAttribute("pw") %>

</body>
</html>