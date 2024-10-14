

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddResult extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid=Integer.parseInt(request.getParameter("sid"));
		//request.getparameter("id")->gives me the id in string format
		//we are converting id from string to integer by using parse int()
		String sname=request.getParameter("sname");
		//name is required in the string formatt therfore we are not converting it into an int
		
		int marks=Integer.parseInt(request.getParameter("marks"));
		int marks2=Integer.parseInt(request.getParameter("marks2"));
		int marks3=Integer.parseInt(request.getParameter("marks3"));
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pgm","root","Raksh@12345");
			
			String s="insert into student values(?,?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(s);
			pstmt.setInt(1, sid);
			pstmt.setString(2, sname);
			pstmt.setInt(3, marks);
			pstmt.setInt(4, marks2);
			pstmt.setInt(5, marks3);
			int rows=pstmt.executeUpdate();
			PrintWriter out=response.getWriter();
			if(rows==0) {
				out.println("student data not added");
				
			}
			else {
				out.println("student data added successfully");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
}