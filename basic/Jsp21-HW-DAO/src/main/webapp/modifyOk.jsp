<%@page import="com.study.jsp.MemberDao" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>    

<jsp:useBean id="dto" class="com.study.jsp.MemberDto" scope="page" />
<jsp:setProperty name="dto" property="*" />

<%
	String id = (String)session.getAttribute("id");
	dto.setId(id);
	
	MemberDao dao = MemberDao.getInstance();
	int ri = dao.updateMember(dto);
	
	if(ri == 1) {
%>
	<script language="javascript">
		alert("정보가 수정되었습니다.")
		document.location.href="main.jsp";
	</script>
<%
	} else {
%>	
	<script language="javascript">
		alert("정보수정에 실패했습니다.")
		history.go(-1);
	</script>
<%
	}
%>	
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP/Servlet 21-1</title>
</head>
<body>

</body>
</html>