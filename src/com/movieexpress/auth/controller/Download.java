package com.movieexpress.auth.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Download extends HttpServlet {
	String path;
	public void init(){
		path= getServletContext().getInitParameter("downloadfolder");
		
	}
	
	
	public void processRequest(HttpServletResponse response, HttpServletRequest request) throws IOException{
	
	
//		String newPath = "/home/kamal/workspace"+request.getContextPath()+path;
		String newPath =path + "/WebContent/download/test.txt";
	
		//comment
		FileInputStream filetodownload = new FileInputStream(newPath);
	ServletOutputStream servletOutput = response.getOutputStream();
	response.setContentType("application/octet-stream");
	response.setHeader("ContentDisposition", "attachment: filename=abc.txt");
	response.setContentLength(filetodownload.available());
	int c;
	while((c=filetodownload.read())!=-1){
		servletOutput.write(c);
	}
	servletOutput.flush();
	servletOutput.close();
	filetodownload.close();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		processRequest(response, request);
	}
}
