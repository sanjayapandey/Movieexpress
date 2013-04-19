package com.movieexpress.application.controller;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.movieexpress.application.dao.ApplicationDao;
import com.movieexpress.application.dao.ApplicationDaoFactory;
import com.movieexpress.application.dto.Movie;
import com.movieexpress.auth.dto.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:sanjaya pandey
 */
public class Home extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        RequestDispatcher view;
        List<Movie> movies = new ArrayList<Movie>();
        User user;
        try {
        	
//        	if(!(session.getAttribute("user")==null)){
//        		 user = (User) session.getAttribute("user");
//        		 request.setAttribute("user", user.getFirstName());
//                 System.out.print("welcome:"+user.getFirstName());
//        	}
        	
        	
        	/*
        	 * Here we have to display top 5 content about movie form database
        	 * so Set those values on array then pass them by set in to parameter
        	 * 1)Database operation
        	 * 2)retrive top movies description
        	 * 3)store them in the array
        	 * 4)set into request.setAttributr("moview content", movie content);
        	 * */
        	
        	
        	
        	
//            String search=request.getParameter("search");
//            System.out.println("Search string: "+search);
        	
//            user = (User) session.getAttribute("user");
        
            ApplicationDao dao = ApplicationDaoFactory.getAppDao();
            movies = dao.getMovies(6);
     
            request.setAttribute("movies", movies);
            
           
            
            view = request.getRequestDispatcher("/pages/application/home.jsp");
            view.forward(request, response);
        } catch (Exception e) {
        	
            e.printStackTrace();
            String redirectUrl = response.encodeRedirectURL(request.getContextPath()+"/pages/application/home.jsp");
            response.sendRedirect(redirectUrl);
        }


    }
}

//TODO Error pages, message notifications, filters, connection pooling, templating