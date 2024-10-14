package jdbc;
import java.sql.DriverManager;

public class demo {
	public static void main(String[]args)throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc",
				"root","root");
		System.out.print("established");
		String s="select*from student";
		Statement stmt=con.create
		
		
	}
	

}


}

