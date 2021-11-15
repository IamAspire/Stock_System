import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;

public class Admin_auth {

		// ENTER ID
	
	
	 public static void admin_login() {
		
		 
		 
		 int input_admin_id;
		 
		   
		   
			System.out.println ( "please enter your Admin ID ");
		
			Scanner myScanner = new Scanner(System.in);
			
		   
	     
			
			if ( !myScanner.hasNextInt()|| !myScanner.hasNextBigInteger()) {
				
				System.out.println ("**invaild Admin ID**" ) ;
				System.out.println ();
				admin_login();
				
				
			} else {
				
				input_admin_id = myScanner.nextInt();
				
				
				JDBC_Engine JDBC = new JDBC_Engine();
				JDBC.selectAdminId(input_admin_id);
		
				
			}
			
	}
		
		 
		 
}
