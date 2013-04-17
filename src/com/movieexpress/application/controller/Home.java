package com.movieexpress.application.controller;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.movieexpress.application.dao.ApplicationDao;
import com.movieexpress.application.dao.ApplicationDaoFactory;
import com.movieexpress.auth.dto.User;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Home extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        HttpSession session = request.getSession(false);
        RequestDispatcher view;
        List<String> contacts = new ArrayList<String>();
        User user;
        try {
        	
        	/*
        	 * Here we have to display top 5 content about movie form database
        	 * so Set those values on array then pass them by set in to parameter
        	 * 1)Database operation
        	 * 2)retrive top movies description
        	 * 3)store them in the array
        	 * 4)set into request.setAttributr("moview content", movie content);
        	 * */
        	
        	
        	
           String search=request.getParameter("search");
           System.out.println("Search string: "+search);
            user = (User) session.getAttribute("user");
            ApplicationDao dao = ApplicationDaoFactory.getAppDao();
            contacts = dao.getContacts(user,search);
            request.setAttribute("contacts", contacts);
            request.setAttribute("search",search);
            view = request.getRequestDispatcher("/pages/application/home.jsp");
            view.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            String redirectUrl = response.encodeRedirectURL(request.getContextPath()+"/auth/login");
            response.sendRedirect(redirectUrl);
        }


    }
}

//TODO Error pages, message notifications, filters, connection pooling, templating