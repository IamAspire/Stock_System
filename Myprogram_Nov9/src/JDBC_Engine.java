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
	String Password = "Abcd1234";
	
	
	public void selectAdminId(int ID) {
	
	
try {
		
		System.out.println( "Connecting a Database.......");
				
    	myConn = DriverManager.getConnection(DB_URL,User,Password);
    	
    	System.out.println( "Creating SQL statement........");
		
    	
        String sql_select = "Select * FROM IT_Admin WHERE Admin_id=?";
		
        
		stmt = myConn.prepareStatement(sql_select);
    	
		
		stmt.setInt(1,ID);
		 
		ResultSet rs = stmt.executeQuery(); 
		
		if ( rs.next()) {
		
			int id = rs.getInt("Admin_id");
			String Adminname = rs.getString("first_name") + " " +rs.getString("last_name") ;
			
			
			System.out.println();
			System.out.println( "Welcome Administrator" +" "+ Adminname);
			System.out.println();
			
			Home.gather_information();
			
			
		}
		
		   else {
				
				System.out.println();
				System.out.println( " ** No admin record found **" );
				System.out.println();
				
				Home.gather_information();
				
			
       }
		
		
						
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	
	 } catch (Exception e) {
			
			e.printStackTrace();
	    
	} finally {
		
		try {
			
			if(stmt!= null)
				myConn.close();
			
		} catch ( SQLException se) {
			
		}
		
		try {
			
			if (myConn!= null)
				
				myConn.close();
			
		} catch (SQLException se) {
			
			se.printStackTrace();
			
		}
	}
		
	
	
}
	
	
	public void updateData(String Name , String lastNAme , String address) {
		
		
		
		try {
			

			System.out.println( "Connecting a Database.......");
					
	    	myConn = DriverManager.getConnection(DB_URL,User,Password);
	    	
	    	System.out.println( "Creating SQL statement........");
			
			
			System.out.println( Name );
			
			String sql_update = "INSERT INTO IT_Admin ( first_name, last_name, address ) VALUES ( ? , ? , ?)";
			
			stmt = myConn.prepareStatement(sql_update);
			
			System.out.println(" please input your name ");
			
		    
			stmt.setString(1,Name);
			stmt.setString(2,lastNAme);
			stmt.setString(3,address);
			
			System.out.println();
			System.out.println(" thanks " + " " + Name + " " + lastNAme );
			 
			
			int rows = stmt.executeUpdate();
			System.out.println( "Rows impacted: " + rows);
			System.out.println();	
			
				
			} catch (SQLException se) {
				// TODO Auto-generated catch block
				se.printStackTrace();
			
	 } catch (Exception e) {
			
			e.printStackTrace();
	    
	} finally {
		
		try {
			
			if(stmt!= null)
				myConn.close();
			
		} catch ( SQLException se) {
			
		}
		
		try {
			
			if (myConn!= null)
				
				myConn.close();
			
		} catch (SQLException se) {
			
			se.printStackTrace();
			
		}
	}
		
			
			
		}
		
    		
	public void selectproductId(int ID) {
		
		
		
		try {
					    
			
				System.out.println( "Connecting a Database.......");
						
		    	myConn = DriverManager.getConnection(DB_URL,User,Password);
		    	
		    	System.out.println( "Creating SQL statement........");
				
		    	
		        String sql_select = "Select * FROM products WHERE product_id=?";
				
		        
				stmt = myConn.prepareStatement(sql_select);
				
				stmt.setInt(1,ID);
				 
				ResultSet rs = stmt.executeQuery(); 
				
				
				if ( rs.next()) {
				
					int id = rs.getInt("product_id");
					String productname = rs.getString("name");
					
					
					System.out.println();
					System.out.println( "we got the product" + " " + productname);
					System.out.println();
					
					return;
					
				}
					
				else {
					
					System.out.println();
					System.out.println( " ** No record found **" );
					System.out.println();
					
					return;
					
					
				}
				
								
				
			} catch (SQLException Se) {
				
			
				Se.printStackTrace();
				
		
	    } catch (Exception e) {
			
			e.printStackTrace();
	    
	} finally {
		
		try {
			
			if(stmt!= null)
				myConn.close();
			
		} catch ( SQLException se) {
			
		}
		
		try {
			
			if (myConn!= null)
				
				myConn.close();
			
		} catch (SQLException se) {
			
			se.printStackTrace();
			
		}
	}
		
	}

	
    public void selectorderId(int ID) {
		
		
		
		try {
					    
			
				System.out.println( "Connecting a Database.......");
						
		    	myConn = DriverManager.getConnection(DB_URL,User,Password);
		    	
		    	System.out.println( "Creating SQL statement........");
				
		    	
		        String sql_select = "Select * FROM orders o JOIN order_items oi ON o.order_id = oi.order_id JOIN products p ON oi.product_id = p.product_id WHERE o.order_id=?";
				
		        
				stmt = myConn.prepareStatement(sql_select);
				
				stmt.setInt(1,ID);
				 
				ResultSet rs = stmt.executeQuery(); 
				
				if ( rs.next()) {
				
					int id = rs.getInt("order_id");
					int ordersresult = rs.getInt("o.customer_id");
					int ordersresult2 = rs.getInt("oi.product_id");
					String productname = rs.getString("p.name");
					System.out.println();
					System.out.println( "The Order information is" + " " + "Customer ID-" + ordersresult + " "+ "product ID-"+ ordersresult2 +" " + "product name-" + productname  );
					System.out.println();
					
				}
				
            else {
					
					System.out.println();
					System.out.println( " ** No record found **" );
					System.out.println();
					
					return;
					
				
            }
								
				
			} catch (SQLException se) {
				// TODO Auto-generated catch block
				se.printStackTrace();
			
			
    } catch (Exception e) {
		
		e.printStackTrace();
    
} finally {
	
	try {
		
		if(stmt!= null)
			myConn.close();
		
	} catch ( SQLException se) {
		
	}
	
	try {
		
		if (myConn!= null)
			
			myConn.close();
		
	} catch (SQLException se) {
		
		se.printStackTrace();
		
	}
}
	
	}
	
	
}
