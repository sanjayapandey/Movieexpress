package com.movieexpress.auth.controller;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.movieexpress.auth.dao.AuthDao;
import com.movieexpress.auth.dao.AuthDaoFactory;
import com.movieexpress.auth.dto.User;

public class Login extends HttpServlet{
	 
	 AuthDao dao;
     String username = new String();
     String password = new String();
     String remember = new String();
     User user;
	
	public void doPost( HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException{
		
		try {
			dao = AuthDaoFactory.getAuthDao();
			username = request.getParameter("username");
			password = request.getParameter("password");
			remember = request.getParameter("remember");
			user = dao.login(username, password);
			System.out.println("User auth, Id:" + user.getId());
            HttpSession session = request.getSession();
	        session.setAttribute("user", user);
	        
	        if (remember!= null && remember.equals("true")) {
	                String cookieToken = UUID.randomUUID().toString();
	                Cookie cookie = new Cookie("auth", cookieToken);
	                cookie.setMaxAge(30 * 24 * 60 * 60);
	                response.addCookie(cookie);
	                dao.setRememberToken(user, cookieToken);
	        }
	            String redirectUrl = response.encodeRedirectURL(request.getContextPath()+"/application/home");
	            response.sendRedirect(redirectUrl);
	     } catch (Exception e) {
	            e.printStackTrace();
	           String redirectUrl = response.encodeRedirectURL(request.getContextPath()+"/auth/login");
	            response.sendRedirect(redirectUrl);
	        }
	    }
			
						
	public void doGet( HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException{
		request.getRequestDispatcher("pages/auth/login.jsp").forward(request, response);
	}
}
