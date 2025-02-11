package com.qn.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class student {
	private int sid;
	private String sname;
	private int marks;
	private int marks2;
	private int marks3;

	public student() {
		super();
	}

	@Override
	public String toString() {
		return "student [sid=" + sid + ", snmae=" + sname + ", marks=" + marks + ", marks2=" + marks2 + ", marks3="
				+ marks3 + "]";
	}

	public student(int sid, String sname, int marks, int marks2, int marks3) {
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

	public int AddResult() {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pgm", "root", "Raksh@12345");

			String s = "insert into student values(?,?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(s);
			pstmt.setInt(1, sid);

			pstmt.setString(2, sname);
			pstmt.setInt(3, marks);
			pstmt.setInt(4, marks2);
			pstmt.setInt(5, marks3);
			int rows = pstmt.executeUpdate();
			return rows;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}
