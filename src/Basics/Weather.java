package Basics;

public class Weather {

	public static void main(String[] args) {
	//This program will give suggestion of what to wear in the weather 
		
		int temperature = 20;
		String sunCondition = "Overcast";
		
		if (temperature > 70) {
			System.out.println("Weather is amazing for wear shorts.");
		} else if ((temperature > 60) && (sunCondition == "Sunny")) {
			System.out.println("Little cooler perhaps to wear full sleeves.");
			
		}else if ((temperature > 50 ) || (sunCondition == "Overcast")){
			
			System.out.println("This is cool day, get a warm clothes");	
			
		} else {
			System.out.println("Cold day");
		}

	}

}
