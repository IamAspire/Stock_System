package myJDBCprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

 public abstract class JEnginee {

	
	 
	 
	
	Connection myConn = null;
	PreparedStatement stmt = null;

	
	String DB_URL =  "jdbc:mysql://localhost:3306/sql_store";
	String User  = "root";
	String Password = "Jordan88";
	
	
	
	public void getdata() {
	
	
	try {
		
		System.out.println( "Connecting a Database");
				
    	myConn = DriverManager.getConnection(DB_URL,User,Password);
    	
    	System.out.println( "Creating statement");
		
    	
        String sql_found = " Select * FROM customers WHERE customer_id=?";
		
		stmt = myConn.prepareStatement(sql_found);
    	
		System.out.println(" please input your customer ID ");

		Scanner myScanner = new Scanner(System.in);
		int input_customerid = myScanner.nextInt();
		    
		
		stmt.setInt(1,input_customerid);
		 
		ResultSet rs = stmt.executeQuery(); 
		
		while ( rs.next()) {
		
			int id = rs.getInt("customer_id");
			String Customername = rs.getString("first_name");
			
			
			System.out.println( "Welcome Customer ID " + id + " " + " Hello " + " " + Customername.toUpperCase());
			
			
		}
		
		

				 
		String sql_update = "UPDATE products set quantity_in_stock=? WHERE product_id=?";
		
		stmt = myConn.prepareStatement(sql_update);
		
		System.out.println(" please input your product ID ");
		
	    Scanner myScanner1 = new Scanner(System.in);
	    int input = myScanner.nextInt();
	    System.out.println("please input your stock amount "  );
	    int input2 = myScanner.nextInt();
	    
		stmt.setInt(1,input2);
		stmt.setInt(2,input);
		
		System.out.println(" thanks " + input2 + " "  + input);
		
		int rows = stmt.executeUpdate();
		System.out.println( "Rows impacted: " + rows);
		
		
				
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}

	
	
}
	
	
	

