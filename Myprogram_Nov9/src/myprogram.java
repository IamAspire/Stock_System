
public class myprogram {

  
	
	public static void main(String[] args) {
	
		
	welcomeScreen();
	 
	 System.out.println();
		
	 Home summer2021 = new Home();
	 summer2021.gather_information();
	
	}

	public static void welcomeScreen() {
		System.out.println("* * WELCOME TO STOCK SYSTEM * *");		

		 for( int i = 0 ; i < 10; i++) {
			 	 
				 System.out.print("*" + " "
				 +"*" + " " +"*" + " "
				 +"*" + " " +"*" + " "
				 +"*" + " " +"*" + " "
				 +"*" + " " +"*" + " "
				 +"*" + " " +"*" + " "
				 +"*" + " " +"*" + " "
				 +"*" + " " +"*" + " "
				 +"*" + " " );
			 
			System.out.println();
			 
		 }
	}

	
}
