package Basics;

public class SalaryCalculator {

	public static void main(String[] args) {
	
		//declare variable
		String career;
		System.out.println("Program started");
		career = "software dev";
		
		//defined a variable
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 45.50;
		
		//compute the annual salary 
		//rate * hours per week * weeks per year
		
		double salary = (hoursPerWeek * weeksPerYear * rate);
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $ " + salary +  "per year.");
		
		
		
		

	}

}
