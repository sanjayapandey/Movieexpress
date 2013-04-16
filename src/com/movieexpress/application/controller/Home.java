package com.movieexpress.application.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Home extends HttpServlet{
	public void doGet( HttpServletRequest request , HttpServletResponse response) throws IOException, ServletException{
		System.out.println("I m home page");
		request.getRequestDispatcher("pages/application/home.jsp").forward(request, response);
		
		
	}

}