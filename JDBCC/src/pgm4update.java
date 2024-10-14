//updating data in the table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class pgm4update {
	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pgm","root","Raksh@12345");
		System.out.println("Connection establish successfully");
		
		String s = "update student set sname=? where sid=?";
		PreparedStatement pstmt = con.prepareStatement(s);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name");
		String sname = scan.next();
		System.out.println("Enter the name");
		int sid = scan.nextInt();
		pstmt.setString(1, sname);
		pstmt.setInt(2, sid);
		int rows=pstmt.executeUpdate();
		System.out.println(rows);
		
		
	}

}
