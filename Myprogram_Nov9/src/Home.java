import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;



public class Home extends People{

	
	public static void gather_information() {
	

		System.out.println ( "Admin-1, Register Admin Account-2, Products Search-3, Orders Search-4, Exit-5");
		
		
		Scanner firstscanner = new Scanner(System.in);
		String  option = firstscanner.nextLine();

		
		switch(option) {
		
		
		case "1":
			
			Admin_auth.admin_login();
			
			return;
			
			
		case "2":
			
			//System.out.println ( "New Administrator Registration - Please provide required information");	
			Register.register();
			
			gather_information();
			
			
        case "3":
			
			//System.out.println ( "Please provide product ID ");	
			Search.productSearch();
			
			gather_information();
		
			
		case "4":
			
			//System.out.println ( "Please provide order ID");	
			Search.ordersSearch();
			
			gather_information();
			
			
		case "5":
			
			System.out.println ( "Program Exit");	
			
			return;	
			
			
			
			
		}
		
	}

	

	
	
	
}
