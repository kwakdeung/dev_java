package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class loginOk implements Service {

	public loginOk() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void execute(HttpServletRequest request,
						HttpServletResponse response)
				throws ServletException, IOException
	{			
		System.out.println("loginOk");

		System.out.println("login");


	 	request.setCharacterEncoding("UTF-8");
	 	String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String eMail = request.getParameter("eMail");
		String address = request.getParameter("address");

		MemberDto dto = new MemberDto();
		dto.setId(id);
		dto.setPw(pw);
		dto.setName(name);
		dto.seteMail(eMail);
		dto.setAddress(address);
		dto.setrDate(new Timestamp(System.currentTimeMillis()));
		
		response.setContentType("text/html; charset=UTF-8");
	    PrintWriter writer = response.getWriter();    
	    
	    MemberDao dao = MemberDao.getInstance();
	 
	    int checkNum = dao.userCheck(id, pw);
	 
	    if(checkNum == -1) {
	    	writer.println("<html><head></head><body>");
	    	writer.println("<script language=\"javascript\">");
			writer.println("	alert(\"아이디가 존재 하지 않습니다.\");");
			writer.println("	history.back();");
			writer.println("</script>");
			writer.println("</body></html>");
			writer.close();

		} else if(checkNum == 0) {     
			writer.println("<html><head></head><body>");
			writer.println("<script language=\"javascript\">");
			writer.println("	alert(\"아이디가 틀렸습니다.\");");
			writer.println("	document.location.href=\"login.jsp\";");
			writer.println("</script>");
			writer.println("</body></html>");
			writer.close();
		} else if(checkNum == 1) {	
			writer.println("<html><head></head><body>");
			writer.println("<script language=\"javascript\">");
			writer.println("	alert(\"로그인이 되었습니다.\");");
			writer.println("	document.location.href=\"main.jsp\";");				writer.println("</script>");
			writer.println("</body></html>");
			writer.close();
			
            
			
			
            HttpSession session = request.getSession();
            session.setAttribute("id", id);
            session.setAttribute("name", id);
            session.setAttribute("ValidMem", "yes");
            response.sendRedirect("main.jsp"); 		
	 	}
	}	
}
