import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class example { 
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.register");
		System.out.println("2.login");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:register();
		break;
		
		case 2:login();
		break;
		default:System.out.println("invalid choice");
		break;
		}
		
	}


	

	static void register() throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usern",
				"root", "Raksh@12345");
        Scanner sc=new Scanner(System. in);
        System.out.println("enter name");

        String namee=sc.next();
        System.out.println("enter un");
        String username=sc.next();
        while(true) {
        String s="select * from user where username=?";
        PreparedStatement pstmt=con.prepareStatement(s);
        pstmt.setString(1,username);
        ResultSet res=pstmt.executeQuery();
     if(res.next()) {
        	System.out.println("already exists");
        	username=sc.next();
        }
        else {
        	break;
        }
        }
        String passwordd;
        String cp;
        do {
        	
        
        System.out.println("passweod");
        passwordd=sc.next();
        System.out.println("confirm password");
         cp=sc.next();
        }while(!passwordd.equals(cp));
        System.out.println("email");
        String email=sc.next();
        String s1="insert into user values(?,?,?,?)";
        PreparedStatement pstmt1=con.prepareStatement(s1);
        pstmt1.setString(1,namee);
        pstmt1.setString(2,username);
        pstmt1.setString(3,passwordd);
        pstmt1.setString(4,email);
	}

      
	
	static void login() throws Exception {
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/usern", "root", "Raksh@12345");
	
    Scanner sc=new Scanner(System. in);
   
    	 System.out.println("enter username");
    	    String username=sc.next();
    	    System.out.println("enter passworde");
    	    String passwordd=sc.next();
    	    String s="select * from user where username=? ";
    	    PreparedStatement pstmt=con.prepareStatement(s);
    	    pstmt.setString(1, username);
    	 //   pstmt.setString(2, passwordd);
    	    ResultSet res=pstmt.executeQuery();
    	    if(res.next()) {
    	    	//System.out.println("login ssucces");
    	    	if(passwordd.equals(res.getString(3))) {
    	    		System.out.println("login succes");
    	    	}
    	    	else {
    	    		System.out.println("invalid password");
    	    	}
    	    }
    	    else {
    	    	System.out.println("failed");
    	    }
    }
    
}
