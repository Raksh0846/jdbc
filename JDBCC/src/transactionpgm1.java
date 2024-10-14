import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class transactionpgm1 {
	public static void main(String[]args) throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("connection done");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pgm", "root", "Raksh@12345");
		System.out.println("establish done");
		Scanner sc=new Scanner(System.in);
		con.setAutoCommit(false);
		String s1="insert into  student values(?,?,?,?,?)";
		PreparedStatement pstmt1=con.prepareStatement(s1);
		System.out.println("enter id");
		int sid=sc.nextInt();
		System.out.println("enyer name");
		String sname=sc.next();
		System.out.println("enter marks");
		int marks=sc.nextInt();
		System.out.println("enter marks2");
		int marks2=sc.nextInt();
		System.out.println("enter marks3");
		int marks3=sc.nextInt();
		pstmt1.setInt(1, sid);
		pstmt1.setString(2,sname);
		pstmt1.setInt(3, marks);
		pstmt1.setInt(4, marks2);
		pstmt1.setInt(5, marks3);
		pstmt1.executeUpdate();
		
		String s="insert into student values(?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(s);
		System.out.println("enter id");
		int sid1=sc.nextInt();
		System.out.println("enyer name");
		String sname1=sc.next();
		System.out.println("enter marks");
		int marks1=sc.nextInt();
		System.out.println("enter marks2");
		int marks21=sc.nextInt();
		System.out.println("enter marks3");
		int marks31=sc.nextInt();
		pstmt.setInt(1, sid1);
		pstmt.setString(2,sname1);
		pstmt.setInt(3, marks1);
		pstmt.setInt(4, marks21);
		pstmt.setInt(5, marks31);
		pstmt.executeUpdate();
		con.commit();
	}

}
