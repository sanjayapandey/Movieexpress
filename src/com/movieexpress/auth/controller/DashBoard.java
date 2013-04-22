package com.movieexpress.auth.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.movieexpress.auth.dao.AuthDao;
import com.movieexpress.auth.dao.AuthDaoFactory;
public class DashBoard extends HttpServlet {
	AuthDao dao;
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out = response.getWriter();
		Enumeration paramaters = request.getParameterNames();
	
		
		String [] dFirst = request.getParameterValues("dfName");
		String [] dMiddle = request.getParameterValues("dmName");
		String [] dLast = request.getParameterValues("dlName");
		String director[] = new String[dFirst.length] ;
		String [] wFirst = request.getParameterValues("wfName");
		String [] wMiddle = request.getParameterValues("wmName");
		String [] wLast = request.getParameterValues("wlName");
		String writer[] = new String[wFirst.length];
		
	
		String relDate = request.getParameter("relDate");
		String mTitle = request.getParameter("mName");
		String mDesc = request.getParameter("mDesc");
		String sImage = request.getParameter("sImage");
		String lImage = request.getParameter("lImage");
		
		for(int i=0; i<dLast.length; i++){
		director [i]= dFirst[i]+" "+dMiddle[i]+" "+dLast[i];
		
		}
		for(int i=0; i<wFirst.length; i++){
			writer [i]= wFirst[i]+" "+wMiddle[i]+" "+wLast[i];
			
			}
	try {
		dao = AuthDaoFactory.getAuthDao();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
}
	

