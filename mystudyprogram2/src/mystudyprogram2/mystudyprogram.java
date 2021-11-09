package mystudyprogram2;

public class mystudyprogram {

	public static void main(String[] args) {
		

		Students A = new Students();
		
		A.firstname = "Mary";
		A.lastname = "Chan";
		A.myarray[9] = "Amy"; 
		A.age = 19;
		A.Salary = "100";
	    A.tall = 171.5;
	    
		
		
		
	    Teachers T = new Teachers();
	    T.firstname = "Miss";
	    T.lastname = "Ko";
	    T.age = 33;
	    
	    
	   
		
	    System.out.println( A.getdata().toUpperCase()  + " " + A.myarray[9] );
	    
	    System.out.println( T.getdata() );
	    
	    System.out.println ( Integer.compare( T.age, A.age));
	    
	    System.out.println (A.firstname.contains("Mary"));
	    
	    System.out.println (A.firstname.indexOf("Mary"));
	    
	    System.out.println (A.firstname.equals("Mary"));
	    
	    System.out.println (A.firstname == "Mary");
		
	    System.out.println (( Integer.parseInt(A.Salary)) * 100);
	    
	    System.out.println (( Integer.valueOf(A.Salary)) * 100);
	    
	    System.out.println (( A.tall + A.tall)  * 100);
	    
	    schoolcar.drivedata();
	    
	    
	    
	    
	}

}
