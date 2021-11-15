import java.util.Scanner;
import java.util.regex.*; 

public class Search {

	
public static void productSearch()  {
		
	  
		
	   
	   int input_product_id;
	 
	   
	   
		System.out.println ( "please enter your product ID ");
	
		Scanner myScanner = new Scanner(System.in);
		
	   
        
		
		if ( !myScanner.hasNextInt()|| !myScanner.hasNextBigInteger()) {
			
			System.out.println ("**invaild product ID**" ) ;
			System.out.println ();
			productSearch();
			

		} else {
			
			input_product_id = myScanner.nextInt();
			
			
			JDBC_Engine JDBC = new JDBC_Engine();
			JDBC.selectproductId(input_product_id);
			
			
		}
		
		
}


	 

public static void ordersSearch()  {
		
	
	   
	   int input_order_id;
	 
	   
	   
		System.out.println ( "please enter your order ID ");
	
		Scanner myScanner = new Scanner(System.in);
		
	   
     
		
		if ( !myScanner.hasNextInt()|| !myScanner.hasNextBigInteger()) {
			
			System.out.println ("**invaild order ID**" ) ;
			System.out.println ();
			ordersSearch();
			

		} else {
			
			input_order_id = myScanner.nextInt();
			
			
			JDBC_Engine JDBC = new JDBC_Engine();
			JDBC.selectorderId(input_order_id);
			
			
		}
		
}
	
}
