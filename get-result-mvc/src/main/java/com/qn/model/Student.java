package com.qn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Student {
 private int sid;
 private String sname;
 private int marks;
 private int marks2;
 private int marks3;
public Student() {
	super();
}
public Student(int sid, String sname, int marks, int marks2, int marks3) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.marks = marks;
	this.marks2 = marks2;
	this.marks3 = marks3;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
public int getMarks2() {
	return marks2;
}
public void setMarks2(int marks2) {
	this.marks2 = marks2;
}
public int getMarks3() {
	return marks3;
}
public void setMarks3(int marks3) {
	this.marks3 = marks3;
}
public void getResult() {
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pgm","root","Raksh@12345");
		
		String s="select * from Student where sid=?";
		PreparedStatement pstmt=con.prepareCall(s);
		pstmt.setInt(1,sid);
		ResultSet res = pstmt.executeQuery();
		if(res.next()) {
			sid =res.getInt(1);
			sname=res.getString(2);
			marks=res.getInt(3);
			marks2=res.getInt(4);
			marks3=res.getInt(5);
			
		}
		
	}
	catch(Exception e) {
		
	}
}
}
