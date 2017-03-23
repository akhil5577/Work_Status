package com.org.utility;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataBase_Data {
	static Connection con = null;
	 
	        // Statement object
	 
	        private static Statement stmt;
	 
	        // Constant for Database URL
	 
	        public static String DB_URL = "jdbc:mysql://localhost:3306/DBTesting";   
	 
	        // Constant for Database Username
	 
	        public static String DB_USER = "root";
	 
	        // Constant for Database Password
	 
	        public static String DB_PASSWORD = "admin";
	        
	        public static  String query = "select *  from customer;";
	        public static String dbClass = "com.mysql.jdbc.Driver";

	
	  

	
@BeforeTest	
public void  setup() throws Exception{

	// Query to Execute
	Class.forName(dbClass).newInstance();
	// Create Connection to DB
	 con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
	// Create Statement Object
	 stmt = con.createStatement();
	
}
	@Test
	public void getdata_database() throws ClassNotFoundException, SQLException,
			InstantiationException, IllegalAccessException {

		ResultSet rs = stmt.executeQuery(query);
		while (rs.next()) {
			String myName = rs.getString(1);
			String myAge = rs.getString(2);
			System.out.println(myName + "  " + myAge);
		}
	}
		@AfterTest
		public void tearDown() throws SQLException{
			if (con != null) {
				              con.close();
			}
		}
		

	}

