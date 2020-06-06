package Basics;

public class Cities {

	public static void main(String[] args) {
	//declare and define an array in implicit way
		String []cities = {"New York", "California","Toronto","North Carolina"};
		System.out.println(cities[0]);
		System.out.println(cities[2]);
		
		
		//declare the array in explicit way
		String []states = new String [5];
		states[0] = "New York";
		states[1]= "New Jesey";
		states[2] = "utah";
		states[3] = "pennsylvenia";
		states[4]= "Nevada";
		//printing the state utah
		System.out.println(states[2]);
		
		System.out.println("__________________________");
		
		//using for loop
		for(int i = 0; i<5;i++) {
		System.out.println(states[i]);
		
		System.out.println("___________________");
		}
		//while loop testing for find a specific state
	int n = 0;
	boolean statefound = false;
	while (!statefound) {
		String state = states[n];
		System.out.println(state);
		if (state == "pennsylvenia") {
			System.out.println("State found");
		    statefound = true;
		}
		n++;
	}
				
		

	}

}
