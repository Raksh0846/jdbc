package com.qn.mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

/**
 * Hello world!
 *
 */
public class launch
{
    public static void main( String[] args ) throws Exception
    {
        //DriverManager.registerDriver(new com.mysql.);
    	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("succesful");
		//establishing the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pgm","root", 
				"Raksh@12345");
			
		System.out.println("connnection done");
		String s="select*from student";
		Statement stmt=con.createStatement();
		ResultSet res=stmt.executeQuery(s);
	   ResultSetMetaData rsmd=(ResultSetMetaData) res.getMetaData();
	   for(int i=1;i<=rsmd.getColumnCount();i++) {
		   System.out.println(rsmd.getColumnName(i));

		   System.out.println(rsmd.getColumnTypeName(i));
	   }
	   
	}


    }

