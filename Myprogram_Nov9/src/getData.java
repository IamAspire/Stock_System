import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.sql.*;



public class getData extends People{

	
	
	public void gather_information() {
	

		System.out.println ( "Login as Admin - Select 1 , Create a new Admin account - Select 2");
		
		
		Scanner firstscanner = new Scanner(System.in);
		String  option = firstscanner.nextLine();

		
		switch(option) {
		
		
		case "1":
			
			Admin_auth.admin_login();
			
			return;
			
			
		case "2":
			
			System.out.println ( "New Administrator Registration - Please provide required information");	
			Register.register();
			
			return;
			
		}
		
	}

	

	
	
	
}
