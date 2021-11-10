import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;

public class Admin_auth {

		// ENTER ID
	
	
	 public static void admin_login() {
		
		System.out.println ("please enter your Admin ID" );
		
		 Scanner myScanner = new Scanner(System.in);
	     int input_admin_id =  myScanner.nextInt();
	    	
	        while ( input_admin_id == 0 || input_admin_id > 99) {
	       
	 	   
	        	System.out.println (" please ensure your have entered the correct Admin ID format" );
	         	
	        	input_admin_id  =  myScanner.nextInt();      
	        
	             
	    	}
	        
	        
	        JDBC_Engine JDBC = new JDBC_Engine();
	        JDBC.selectData(input_admin_id);
	        
	        
	       
	}
	 
	 
	
}
