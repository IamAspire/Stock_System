import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;



public class JDBC_Engine {
	

	Connection myConn = null;
	PreparedStatement stmt = null;

	
	String DB_URL = "jdbc:mysql://localhost:3306/sql_store";
	String User  = "root";
	String Password = "Jordan88";
	
	
	
	public void selectData(int ID) {
	
	
	
try {
		
	    
	
		System.out.println( "Connecting a Database.......");
				
    	myConn = DriverManager.getConnection(DB_URL,User,Password);
    	
    	System.out.println( "Creating SQL statement........");
		
    	
        String sql_select = "Select * FROM IT_Admin WHERE Admin_id=?";
		
        
		stmt = myConn.prepareStatement(sql_select);
    	
		
		//Scanner myScanner = new Scanner(System.in);
		//int input_admin_id_sql = myScanner.nextInt();
		    
		
		stmt.setInt(1,ID);
		 
		ResultSet rs = stmt.executeQuery(); 
		
		while ( rs.next()) {
		
			int id = rs.getInt("Admin_id");
			String Adminname = rs.getString("first_name") + " " +rs.getString("last_name") ;
			
			
			System.out.println( "Welcome Administrator" +" "+ Adminname);
			
			
		}
		
						
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
	
	
	
}
