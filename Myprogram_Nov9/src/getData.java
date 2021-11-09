import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getData extends People{

	
	
	public void gather_information() {
	

		
		System.out.println ( "What is your position ? 1 - student , 2 - teacher , 3 - worker");
		Scanner firstscanner = new Scanner(System.in);
		String  title = firstscanner.nextLine();

		
		switch(title) {
		
		
		case "1":
			
			System.out.println ( "Welcome Back student");
			mystudentData();
			
			return;
			
			
		case "2":
			
			System.out.println ( "Welcome teacher");	
			myteacherData();
			
			return;
			
			
	    case "3":
			
			System.out.println ( "Welcome Worker");	
			myworkerData();
			
			return;
			
		}
		
	}

	
	Students student = new Students();
	Workers worker = new Workers();
	Teachers teacher = new Teachers();
	
	
	
	public void mystudentData() {

		// ENTER ID
		
		System.out.println ("please enter your ID" );
		
		 Scanner myScanner = new Scanner(System.in);
	     int input_customer_id =  myScanner.nextInt();
	    	
	        while ( input_customer_id == 0 || input_customer_id > 99999) {
	       
	 	   
	        	System.out.println ("Invaild ID format" );
	         	
	        	input_customer_id =  myScanner.nextInt();      
	             
	    	}
	        
	        
	        student.setCustomers_id(input_customer_id );
	        student.getCustomers_id();
	        
	        List <People> mystudentlist = new ArrayList();
	        
	        mystudentlist.add(student);
	       
	        System.out.println( "welcome student" + " " + mystudentlist.get(0).getCustomers_id());
	        

	        // ENTER FirstName
	        
	        
	        System.out.println ("please enter your first name" );
	        
	        Scanner myScanner2 = new Scanner(System.in);
		     String input_firstname =  myScanner2.nextLine();
		    	
		        while ( input_firstname.isEmpty() || input_firstname.length() > 20) {
		       
		 	   
		        	System.out.println ("Invaild name");
		         	
		        	input_firstname =  myScanner2.nextLine();      
		        	
		    	}
		        
		        
		        student.setFirst_Name(input_firstname );
		        student.getFirst_Name();
		   
		        
		        mystudentlist.add(student);
		       
		        System.out.println( "welcome" + " " + mystudentlist.get(0).getFirst_Name() + "Student, your marks are " + student.marks);
	        
		        
	    
    return;
    
    
	}

	
	public void myworkerData() {

		// ENTER ID
		
		System.out.println ("please enter your ID" );
		
		 Scanner myScanner = new Scanner(System.in);
	     int input_customer_id =  myScanner.nextInt();
	    	
	        while ( input_customer_id == 0 || input_customer_id > 99999) {
	       
	 	   
	        	System.out.println ("Invaild ID format" );
	         	
	        	input_customer_id =  myScanner.nextInt();      
	             
	    	}
	        
	        
	        worker.setCustomers_id(input_customer_id );
	        worker.getCustomers_id();
	        
	        List <People> myworkerlist = new ArrayList();
	        
	        myworkerlist.add(worker);
	       
	        System.out.println( "welcome Worker" + " " + myworkerlist.get(0).getCustomers_id());
	        

	        // ENTER FirstName
	        
	        
	        System.out.println ("please enter your first name" );
	        
	        Scanner myScanner2 = new Scanner(System.in);
		     String input_firstname =  myScanner2.nextLine();
		    	
		        while ( input_firstname.isEmpty() || input_firstname.length() > 20) {
		       
		 	   
		        	System.out.println ("Invaild name");
		         	
		        	input_firstname =  myScanner2.nextLine();      
		        	
		    	}
		        
		        
		        worker.setFirst_Name(input_firstname );
		        worker.getFirst_Name();
		   
		        
		        myworkerlist.add(worker);
		       
		        System.out.println( "welcome" + " " + myworkerlist.get(0).getFirst_Name());
	        
	      
    
	}
	
	
	public void myteacherData() {
	
	
		// ENTER ID
		
				System.out.println ("please enter your ID" );
				
				 Scanner myScanner = new Scanner(System.in);
			     int input_customer_id =  myScanner.nextInt();
			    	
			        while ( input_customer_id == 0 || input_customer_id > 99999) {
			       
			 	   
			        	System.out.println ("Invaild ID format" );
			         	
			        	input_customer_id =  myScanner.nextInt();      
			             
			    	}
			        
			        
			        teacher.setCustomers_id(input_customer_id );
			        teacher.getCustomers_id();
			        
			        List <People> myteacherlist = new ArrayList();
			        
			        myteacherlist.add(teacher);
			       
			        System.out.println( "welcome teacher" + " " + myteacherlist.get(0).getCustomers_id());
			        

			        // ENTER FirstName
			        
			        
			        System.out.println ("please enter your first name" );
			        
			        Scanner myScanner2 = new Scanner(System.in);
				     String input_firstname =  myScanner2.nextLine();
				    	
				        while ( input_firstname.isEmpty() || input_firstname.length() > 20) {
				       
				 	   
				        	System.out.println ("Invaild name");
				         	
				        	input_firstname =  myScanner2.nextLine();      
				        	
				    	}
				        
				        
				        teacher.setFirst_Name(input_firstname );
				        teacher.getFirst_Name();
				   
				        
				        myteacherlist.add(teacher);
				       
				        System.out.println( "welcome" + " " + myteacherlist.get(0).getFirst_Name());
			        
			       
		
		
		
	}
	
	
	
}
