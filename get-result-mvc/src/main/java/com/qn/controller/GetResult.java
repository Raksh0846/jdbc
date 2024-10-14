package com.qn.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qn.model.Student;

public class GetResult extends HttpServlet {
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException {
	int sid = Integer.parseInt(request.getParameter("sid"));
	
	
	Student s=new Student();
	s.setSid(sid);
	s.getResult();
	sid=s.getSid();
	String sname=s.getSname();
	int marks=s.getMarks();
	int marks2=s.getMarks2();
	int marks3=s.getMarks3();
	HttpSession session=request.getSession(true);
	session.setAttribute("id",sid);//id=sid
	session.setAttribute("name", sname);
	session.setAttribute("smarks",marks);
	session.setAttribute("smarks2",marks2);
	session.setAttribute("smarks3",marks3);
	response.sendRedirect("/get-result-mvc/getResultSuccess.jsp");
	
}

}


