package DataStructure;

public class Arrays {

	public static void main(String[] args) {
		String [] alphabet = {"a","b","c","d","e","f"};
		
		for (int i = 0; i<5; i++) {
			System.out.println(alphabet[i]+ " ");
		}
		System.out.println("New way");
		
		for (int n = 0; n<alphabet.length; n++) {
			System.out.print(alphabet[n]+ " ");
		}
		
		System.out.println("\n\n using the for-each method");
		
		 for(String letter: alphabet) {
			 System.out.print(letter + " ");
		 }
		 
		 
		 //double arrays
		 
		 String [][] users = {{"Akash", "akash@gmail.com"},
				 {"joy", "joy@yahoo.com"},
				 {"tom", "tom@yahoo.com"}
	};
		 
		 //get the size of the array
		 
		 int numofUsers = users.length;
		 int numofFields = users[0].length;
		 System.out.println("number of users : " + numofUsers);
		 System.out.println("number of fileds : " + numofFields);
		 
		 //Treverse the double array
		 
		 
		 for (int i = 0; i < numofUsers; i++) {
			 String firstName = users[i][0];
			 String email = users[i][1];
			 System.out.println(firstName + " " + email);
		 }
		 
		
		
		
				
		}


	}


