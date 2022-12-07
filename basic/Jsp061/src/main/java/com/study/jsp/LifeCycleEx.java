package com.study.jsp;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LifeCycleEx")
public class LifeCycleEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LifeCycleEx()
    {
        super();
        System.out.println("생성자 호출됨");
    }

	
	public void init(ServletConfig config) 
			throws ServletException 
	{
		System.out.println("init 호출됨");
	}

	
	public void destroy() 
	{
		System.out.println("destory 호출됨");
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		System.out.println("doGet 호출됨");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException 
	{
		System.out.println("doPost 호출됨");
	}
	
	@PostConstruct
	private void aaa() {
		System.out.println("생성자 호출 직후 불림");
		
	}
	
	@PostDestory
	private void bbb() {
		System.out.println("디스트로이 호출시 먼저 불림");
		
	}

}
