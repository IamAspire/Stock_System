import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Register {
	   
	 static String input_new_admin_name;
	 static String input_new_admin_lastname;
	 static String input_new_admin_address;
	 
	public static void register()  {
	

				   	   
			System.out.println ( "please enter your first name ");
		
			Scanner myScanner = new Scanner(System.in);
			
			input_new_admin_name = myScanner.next();
			
			while ( input_new_admin_name.length() > 30) {
				
				System.out.println ("**invaild firstname** , please enter again" );
				
				myScanner.next();
				
			}
			
			//if ( !myScanner.hasNextLine()) {
				
			//	System.out.println ("**invaild firstname**" ) ;
			//	System.out.println ();
			//	register();
				

			//} else {
				
			//	input_new_admin_name = myScanner.next();
				
				
			
				
     
	 
       System.out.println ( " please enter your last name ");

	
		Scanner myScanner1 = new Scanner(System.in);
		
		
		
		input_new_admin_lastname = myScanner.next();
		
		while ( input_new_admin_lastname.length() > 30) {
			
			System.out.println ("**invaild lastname** , please enter again" );
			
			myScanner1.next();
			
		}
 
		
		
		
		
		
		//if ( !myScanner1.hasNext("[A-Za-z]*")) {
			
		//	System.out.println ("**invaild last name**" ) ;
		//	System.out.println ();
		//	register();
			

		//} else {
			
		//	input_new_admin_lastname = myScanner1.next();
			
		
	

      
   System.out.println ( " please enter your address  " );
       

	Scanner myScanner2 = new Scanner(System.in);
	
	
	
	input_new_admin_address = myScanner2.next();
	
	while ( input_new_admin_address.length() > 30) {
		
		System.out.println ("**invaild address** , please enter again" );
		
		myScanner2.next();
		
	}
	
	
	//if ( !myScanner2.hasNext("[A-Za-z]*")) {
		
	//	System.out.println ("**invaild address **" ) ;
	//	System.out.println ();
	//	register();
		

	//} else {
		
	//	input_new_admin_address = myScanner2.nextLine();
		
	//System.out.println(input_new_admin_address);
	
	
	JDBC_Engine R = new JDBC_Engine();
    R.updateData(input_new_admin_name,input_new_admin_lastname, input_new_admin_address);
	

	
}

}




