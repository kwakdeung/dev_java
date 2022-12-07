<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calcEx</title>
</head>
<body>

<%!
	String sNum1, sNum2, nNum1, nNum2, calc;
	int nResult;
%>

<%
	request.setCharacterEncoding("UTF-8");
	String sNum1 = request.getParameter("num1");
	String sNum2 = request.getParameter("num2");
	String calc = request.getParameter("calc");
	
	try {
		int nNum1 = Integer.parseInt(sNum1);
		int nNum2 = Integer.parseInt(sNum2);
		
		
		if (calc.equals("+")) {
			nResult = nNum1 + nNum2;
		} else if (calc.equals("-")) {
			nResult = nNum1 - nNum2;
		} else if (calc.equals("*")) {
			nResult = nNum1 * nNum2;
		} else if (calc.equals("/")) {
			nResult = nNum1 / nNum2;
		}
		
		
	} catch (Exception e) {
		
	}



	
	
	
	

%>


결과 : <%= nResult %><br>
</body>
</html>