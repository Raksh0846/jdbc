//inserting the data
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class pgm3insert {




	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("succesful");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pgm","root", 
				"Raksh@12345");

		System.out.println("connnection done");
		String s="insert into student values(?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int sid=sc.nextInt();
		System.out.println("enter name");
		String sname=sc.next();
		System.out.println("enter marks");
		int marks=sc.nextInt();
		System.out.println("enter marks");
		int marks2=sc.nextInt();
		System.out.println("enter marks");
		int marks3=sc.nextInt();
		pstmt.setInt(1, sid);
		pstmt.setString(2,sname);
		pstmt.setInt(3, marks);
		pstmt.setInt(4, marks);
		pstmt.setInt(5, marks);
		

		int rows = pstmt.executeUpdate();
		System.out.println(rows);
	}
}




