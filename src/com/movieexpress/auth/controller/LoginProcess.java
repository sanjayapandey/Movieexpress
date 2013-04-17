package com.movieexpress.auth.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginProcess extends HttpServlet{
	public void doPost( HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException{
		
		
		
		request.getRequestDispatcher("pages/auth/login.jsp").forward(request, response);
		
		
	}

}
