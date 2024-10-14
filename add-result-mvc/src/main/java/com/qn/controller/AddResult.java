package com.qn.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qn.model.student;


public class AddResult extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int sid=Integer.parseInt(request.getParameter("sid"));
			//request.getparameter("id")->gives me the id in string format
			//we are converting id from string to integer by using parse int()
			String sname=request.getParameter("sname");
			//name is required in the string formatt therfore we are not converting it into an int
			
			int marks=Integer.parseInt(request.getParameter("marks"));
			int marks2=Integer.parseInt(request.getParameter("marks2"));
			int marks3=Integer.parseInt(request.getParameter("marks3"));
			student tempstudent=new student();
			tempstudent.setSid(sid);
			tempstudent.setSname(sname);
			tempstudent.setMarks(marks);
			tempstudent.setMarks2(marks2);
			tempstudent.setMarks3(marks3);
			int rows=tempstudent.AddResult();
			if(rows==1) {
				response.sendRedirect("/add-result-mvc/addresultsuccess.html");
			}
			else {
				response.sendRedirect("/add-result-mvc/addresultfailure.html");
			
			}
			
	}
}
