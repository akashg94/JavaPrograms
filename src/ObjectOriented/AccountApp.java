package ObjectOriented;

public class AccountApp {

	public static void main(String[] args) {
	LoanAccount loan = new LoanAccount();
	loan.increaseRate();
	loan.setRate();
	loan.setAmmortschedule();
	loan.setTerm(20);
	
	IRate account1 = new LoanAccount();
	account1.increaseRate();
	account1.setRate();

	}

}
