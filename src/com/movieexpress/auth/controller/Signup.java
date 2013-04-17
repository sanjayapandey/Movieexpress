package com.movieexpress.auth.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.movieexpress.auth.dao.AuthDao;
import com.movieexpress.auth.dao.AuthDaoFactory;
import com.movieexpress.auth.dto.User;

public class Signup extends HttpServlet{
	 AuthDao dao;
     String fName = new String();
     String lName = new String();
     String uName = new String();
     String pass = new String();
     String pass1 = new String();
     User user;
	
public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
			try {
					dao = AuthDaoFactory.getAuthDao();
					fName = request.getParameter("fName");
					lName = request.getParameter("lName");
					uName = request.getParameter("uName");
					pass = request.getParameter("password");
					pass1 = request.getParameter("passwordAgain");
				
					if(validateSignUp(fName, lName, uName, pass, pass1)){
						user = dao.signup(fName, lName, uName, pass);
						RequestDispatcher view = request.getRequestDispatcher("/pages/application/confirm.jsp");
						view.forward(request, response);
						
						
					//	return;
					}
	
					else{
						request.setAttribute("firstname", fName);
						request.setAttribute("lastname", lName);
						request.setAttribute("username", uName);
						RequestDispatcher view;
						view = request.getRequestDispatcher("/pages/auth/signup.jsp");
						view.forward(request, response);
		      		    }
					
		        } catch (Exception e) {
		            e.printStackTrace();
		            String redirectUrl = response.encodeRedirectURL(request.getContextPath() + "/auth/signup");
		            response.sendRedirect(redirectUrl);
		       
		        
		        }
}

  

private boolean validateSignUp(String firstName, String lastName, String userName, String password, String rePassword){   
	
		boolean valid=true;
		
		try {
			dao = AuthDaoFactory.getAuthDao();
			valid = valid && !firstName.trim().isEmpty();
			valid = valid && !(lastName.trim().isEmpty());
			valid = valid && password.equals(rePassword);
			valid = valid && (!dao.existsUsername(userName));
 
			}catch (Exception e) {
	// TODO Auto-generated catch block
	valid = false;
	e.printStackTrace();
}
	return valid;
	
}



public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
	RequestDispatcher view = request.getRequestDispatcher("/pages/auth/signup.jsp");
	view.forward(request, response);
	
	}
}