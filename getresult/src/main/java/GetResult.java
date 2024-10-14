

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 

public class GetResult extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			int sid=Integer.parseInt(request.getParameter("sid"));
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			System.out.println("succesful");
			//establishing the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pgm","root", 
					"Raksh@12345");
			String s="select * from student where sid=?";
			PreparedStatement pstmt=con.prepareStatement(s);
			pstmt.setInt(1, sid);
			ResultSet res=pstmt.executeQuery();
			PrintWriter out=response.getWriter();
			if(res.next()) {
				sid=res.getInt(1);
				String sname=res.getString(2);
				int marks=res.getInt(3);
				int marks2=res.getInt(4);
				int marks3=res.getInt(5);
				out.println(sid+" "+sname+" "+marks+" "+marks2+" "+marks3);
				
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
