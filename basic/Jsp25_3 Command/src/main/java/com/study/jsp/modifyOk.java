package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class modifyOk implements Service {

	public modifyOk() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void execute(HttpServletRequest request,
						HttpServletResponse response)
				throws ServletException, IOException
	{			
		System.out.println("modify");


	 	request.setCharacterEncoding("UTF-8");
	 	response.setContentType("text/html; charset=UTF-8");
	    PrintWriter writer = response.getWriter(); 
	    HttpSession session = request.getSession();
	    MemberDto dto = new MemberDto();		   
	 	String id = (String)session.getAttribute("id");
		dto.setId(id);
		
		MemberDao dao = MemberDao.getInstance();
		int ri = dao.updateMember(dto);
		
		if(ri == 1) {
			writer.println("<html><head></head><body>");
			writer.println("<script language=\"javascript\">");
			writer.println("	alert(\"정보가 수정 되었습니다.\");");
			writer.println("	document.location.href=\"main.jsp\";");				
			writer.println("</script>");
			writer.println("</body></html>");
			writer.close();		
		} else if(ri == -1) {		
			writer.println("<html><head></head><body>");
	    	writer.println("<script language=\"javascript\">");
			writer.println("	alert(\"정보수정에 실패 했습니다.\");");
			writer.println("	history.go(-1);");
			writer.println("</script>");
			writer.println("</body></html>");
			writer.close();
			
			response.sendRedirect("login.jsp");		
		}
	}	
}
