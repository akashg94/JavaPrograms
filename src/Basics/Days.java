package Basics;

public class Days {

	public static void main(String[] args) {
	//executing blocks with switch statements
		String days = "saturday";
		//creating the switch statement.
		switch (days) {
		case "Monday" :
			System.out.println("Today is bloody Monday");
			break;
		case "Tuesday" :
			System.out.println("Today is  Tuesday");
			break;
		case "Wednesday" :
			System.out.println("Today is Wednesday");
			break;
		case "Thursday" :
			System.out.println("Today is Thursday.");
		      break;
		case "Friday" :
			System.out.println("Yeeee!!! This is friday");
			break;
			//if none of the above is not there then use default.
			default : System.out.println("It's saturday");
		}

	}

}
