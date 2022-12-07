<%@page import="com.study.jsp.MemberDto"%>
<%@page import="com.study.jsp.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	try{
		MemberDAO memberDAO = new MemberDAO();
		
		MemberDto dto = new MemberDto();
		
		
		dto.setId("abc");
		dto.setPw("123");
		dto.setName("홍길동");
		dto.setPhone("010-1234-5678");
		dto.setGender("man");
		int nResult = memberDAO.memberInsert(dto);
		
		dto.setId("abc");
		dto.setPw("123");
		dto.setName("홍길동");
		dto.setPhone("010-1234-5678");
		dto.setGender("man");
		nResult = memberDAO.memberInsert(dto);
		
		dto.setId("abc");
		dto.setPw("123");
		dto.setName("홍길동");
		dto.setPhone("010-1234-5678");
		dto.setGender("man");
		nResult = memberDAO.memberInsert(dto);
		
		out.println("insert success");
			} catch(Exception e) {
		
			}
	%>
	<br />
	<a href="memberSelect.jsp">회원정보 보기</a>
</body>
</html>