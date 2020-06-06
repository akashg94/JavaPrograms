package ObjectOriented;

public class LoanAccount implements IRate {
	
public void setRate() {
	System.out.println("Rate");
	
	
}
public void increaseRate() {
	System.out.println("Increase rate");
}
 public void setTerm(int term) {
	 System.out.println("Setting the term to " + term + "years.");
 }
 public void setAmmortschedule() {
	 System.out.println("Amortzation schedule");
 }
	
}
