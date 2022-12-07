package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginProcess")
public class LoginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection con;
	private PreparedStatement pstmt;
	private ResultSet resultSet;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "scott";
	String upw = "tiger";
	
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		request.setCharacterEncoding("UTF-8");		
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
//		String name = request.getParameter("name");
//		String eMail = request.getParameter("eMail");
//		String address = request.getParameter("address");
		
		MemberDao dao = MemberDao.getInstance();
		MemberDto dto = new MemberDto();
		int checkNum = dao.userCheck(id, pw);
		
		String json_data = "";
		
		if(checkNum == -1) {
            json_data = "{\"code\":\"fail\", \"desc\":\"아이디가 존재 X.\"}";

		} else if(checkNum == 0) {     
			json_data = "{\"code\":\"fail\", \"desc\":\"아이디가 틀립니다.\"}";
		} else if(checkNum == 1) {	
			json_data = "{\"code\":\"success\", \"desc\":\"로그인 되었습니다..\"}";
			
            
			String name = dto.getName();
			
            HttpSession session = request.getSession();
            session.setAttribute("id", id);
            session.setAttribute("name", id);
            session.setAttribute("ValidMem", "yes");
            response.sendRedirect("main.jsp");
        } 
        response.setContentType("application/json; charset=UTF-8");
        PrintWriter writer = response.getWriter();        
        writer.println(json_data);
        writer.close();
	}
	
}	
