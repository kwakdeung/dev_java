package com.study.jsp.command;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.jsp.BPageInfo;
import com.study.jsp.BDto;
import com.study.jsp.BDao;

public class BDeleteCommand implements BCommand{
	@Override    
	public void execute(HttpServletRequest request, HttpServletResponse response) 
	{
		String bId = request.getParameter("bId");
		BDao dao = BDao.getInstance();
		dao.delete(bId);
	}
}
