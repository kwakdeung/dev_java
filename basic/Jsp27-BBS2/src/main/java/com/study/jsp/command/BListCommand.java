package com.study.jsp.command;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.study.jsp.BPageInfo;
import com.study.jsp.BDto;
import com.study.jsp.BDao;


public class BListCommand implements BCommand {
	
	@Override    
	public void execute(HttpServletRequest request, HttpServletResponse response) 
	{
		int nPage = 1;
		try {
			String sPage = request.getParameter("page");
			nPage = Integer.parseInt(sPage);
		} catch (Exception e) {			
		}
		BDao dao = BDao.getInstance();
		BPageInfo pinfo = dao.articlePage(nPage);
		request.setAttribute("page", pinfo);
		
		nPage = pinfo.getCurPage();
		
		HttpSession session = null;
		session = request.getSession();
		session.setAttribute("cpage", nPage);
		
		
		ArrayList<BDto> dtos = dao.list(nPage);
		request.setAttribute("list", dtos);
		// element.setAttribute( '속성' , '값' ); - 속성을 추가한다(HTML표준X 포함)
		
	}

}
