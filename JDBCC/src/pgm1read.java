//pgm for accessing an indiviual student detail
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;



public class pgm1read {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("succesful");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pgm","root", 
				"Raksh@12345");
			
		System.out.println("connnection done");
		String s="select*from student where sid=?";
		PreparedStatement pstmt=con.prepareStatement(s);
		System.out.println("enter id");
		Scanner sc=new Scanner (System.in);
		int sid=sc.nextInt();
		pstmt.setInt(1,sid);
		ResultSet res=pstmt.executeQuery();
		if(res.next()) {
			sid=res.getInt(1);
			String sname=res.getString(2);
			int marks=res.getInt(3);
			int marks2=res.getInt(4);
			int marks3=res.getInt(5);
			System.out.println(sid+" "+sname+" "+marks+" "+marks3+marks2);
		}
		else {
			System.out.println("invalid");
			
		
		}
		
	   
	}

}
