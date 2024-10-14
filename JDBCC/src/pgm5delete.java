import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class pgm5delete {
	public static void main(String[]args) throws Exception {
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	System.out.println("connection done");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pgm", "root", "Raksh@12345");
	System.out.println("establish done");
	String s="delete from  student where s id=?";
	PreparedStatement pstmt=con.prepareStatement(s);
	Scanner sc=new Scanner(System.in);
	int sid=sc.nextInt();
	pstmt.setInt(1, sid);
	int rows=pstmt.executeUpdate();
	System.out.println(rows);
	}

}
