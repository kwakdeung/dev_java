<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP/Servlet 26-2</title>
</head>
<body>

	<%
		// JSP에서 서블릿을 호출
		request.setAttribute("id", "abcde");
		request.setAttribute("pw", "12345");
		
		
		//request.getRequestRedirect("RequestObj"); // <-- 이건 안됨
		request.getRequestDispatcher("RequestObj").forward(request, response);
	
	%>

</body>
</html>