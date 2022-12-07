<%@page import="java.sql.Timestamp" %>
<%@page import="com.study.jsp.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="dto" class="com.study.jsp.MemberDto"/>
<jsp:setProperty name="dto" property="*" />
<%

	dto.setrDate(new Timestamp(System.currentTimeMillis()));
	MemberDao dao = MemberDao.getInstance();
	String json_data = "";	
	if (dao.confirmId(dto.getId()) == MemberDao.MEMBER_EXISTENT) {
		json_data = "{\"code\":\"fail\", \"desc\":\"아이디가 이미 존재 합니다.\"}";
	} else {
		int ri = dao.insertMember(dto);
		if (ri == MemberDao.MEMBER_JOIN_SUCCESS) {			
			session.setAttribute("id", dto.getId());
			json_data = "{\"code\":\"success\", \"desc\":\"회원가입을 축하 합니다.\"}";
		} else {
			json_data =
			"{\"code\":\"success\", \"desc\":\"에러가 발생하여 회원가입에 실패했습니다.\"}";		
		}


	} 
	response.setCharacterEncoding("UTF-8");
	out.println(json_data);
%>