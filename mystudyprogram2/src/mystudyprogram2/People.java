package mystudyprogram2;

public abstract class People {

	String firstname;
	String lastname;
	String Salary;
	int age;
	double tall;
	
	
	
	String [] myarray = new String[10];
	
	
	public String getdata() {
		
		
		return firstname.toLowerCase() + " " + lastname.charAt(0);
		
		
	}
	
	
}
