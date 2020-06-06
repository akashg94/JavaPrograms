package Basics;

public class Strings {

	public static void main(String[] args) {
	String bookTitle;
	bookTitle = "Java First contact second edition";
	String wordChoice = "Java";
	
	//contains string
	
	if (bookTitle.contains(wordChoice)) {
		System.out.println("The book contains the word " + wordChoice);
	}
	//ignoring case string
	 String browser = "Chrome";
	 if (browser.equalsIgnoreCase("chrome")) {
		 System.out.println("Browser is chrome");
		
	 } else 
		 System.out.println("Browser not chrome");
	   
	 //getting the name initial and last 4 digit of ssn
	 
	 String firstName = "Akash";
	 String lastName = "Ghosh";
	 String SSN = "12345678";
	 
	 System.out.println("There are " +  SSN.length() + " digits in ssn");
	 
	 //printing the intial of name and last 4 digit 
	 System.out.print(firstName.substring(0,1));
	 System.out.print(lastName.substring(0,1));
	 System.out.print( SSN.substring(4));
     

	}

}
