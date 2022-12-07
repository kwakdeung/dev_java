package com.study.spring;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.study.spring.dao.IDao;



@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
		
//		model.addAttribute("serverTime", formattedDate );
		
//		return "home";
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		IDao dao=sqlSession.getMapper(IDao.class);
		model.addAttribute("list", dao.listDao());
		return "/list";
	}
	
	@RequestMapping("/writer_view")
	public String writer_view() {
		
		return "/writer_view";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request,Model model) {
		System.out.println("/write");
		
		IDao dao=sqlSession.getMapper(IDao.class);
		dao.writeDao(request.getParameter("bName"), request.getParameter("bTitle"), request.getParameter("bContent"));
		
		return "redirect:list";
	}
	
	
	@RequestMapping("/content_view")
	public String content_view(HttpServletRequest request,Model model) {
//		System.out.println("content_view");
		
		String strID=request.getParameter("bId");
		IDao dao=sqlSession.getMapper(IDao.class);
		dao.upHitDao(request.getParameter("bId"));
		model.addAttribute("content_view", dao.content_viewDao(strID));
		
		return "/content_view";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request,Model model) {
//		System.out.println("/delete");
		
		IDao dao=sqlSession.getMapper(IDao.class);
		dao.deleteDao(request.getParameter("bId"));
		
		return "redirect:list";
	}
	
	@RequestMapping("/modify_view")
	public String modify_view(HttpServletRequest request,Model model) {
		
		String strID=request.getParameter("bId");
		IDao dao=sqlSession.getMapper(IDao.class);
		model.addAttribute("content_view", dao.content_viewDao(strID));
		
		return "/modify_view";
	}
	
	@RequestMapping("/modify")
	public String modify(HttpServletRequest request,Model model) {
//		System.out.println("modify()");
		
		IDao dao=sqlSession.getMapper(IDao.class);
		dao.modifyDao(request.getParameter("bName"), request.getParameter("bTitle"), request.getParameter("bContent"), request.getParameter("bId"));
		
//		System.out.println("/modify : " + request.getParameter("bName"));
//		System.out.println("/modify : " + request.getParameter("bTitle"));
//		System.out.println("/modify : " + request.getParameter("bContent"));
//		System.out.println("/modify : " + request.getParameter("bId"));
		
		return "redirect:list";
	}
	
	@RequestMapping("/reply_view")
	public String reply_view(HttpServletRequest request,Model model) {
		
//		System.out.println("reply_view");
		
		String strID=request.getParameter("bId");
		IDao dao=sqlSession.getMapper(IDao.class);
		model.addAttribute("reply_view", dao.content_viewDao(strID));
		
		return "/reply_view";
	}
	
	@RequestMapping("/reply")
	public String reply(HttpServletRequest request,Model model) {
		System.out.println("reply()");
		
		IDao dao=sqlSession.getMapper(IDao.class);
		
		dao.replyShapeDao(request.getParameter("bGroup"), request.getParameter("bStep"));
		
		dao.replyDao(request.getParameter("bName"), request.getParameter("bTitle"), 
				request.getParameter("bContent"), request.getParameter("bGroup"),
				request.getParameter("bStep"), request.getParameter("bIndent"));
		
		return "redirect:list";
	}
}
