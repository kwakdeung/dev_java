package com.study.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logout implements Service {

	public logout() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void execute(HttpServletRequest request,
						HttpServletResponse response)
				throws ServletException, IOException
	{			
		System.out.println("logout");

		HttpSession session = request.getSession();
		session.invalidate();
		response.sendRedirect("login.jsp");
	}	
}
