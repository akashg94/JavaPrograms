package Exception;

import java.util.Scanner;

public class PaymentApp {
	//take a payment from user

	public static void main(String[] args) {
		double payment = 0;
		boolean positivePymt = true;
		
		//ask the user for input
		System.out.print("Enter the payment amount : ");
		
		do {
		//get the amount and test the value
		Scanner sc = new Scanner(System.in);
		try {
		
		payment = sc.nextDouble();
		if(payment < 0) {
			//throw error
			throw new NegativePaymentException();
		}
		else { 
			positivePymt = true;
		}
		}catch (NegativePaymentException e) {
			System.out.println(e.toString());
			System.out.println("Please try again");
			positivePymt = false;
		}
		} while (!positivePymt);
		System.out.println("Thank you for your payment of " + payment);
		
          
		//handle exception
		

	}

}
