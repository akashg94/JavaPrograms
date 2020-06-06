package ObjectOriented;

public class BankAccountApp  {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
	    BankAccount account2 = new BankAccount("checking Account");
	    BankAccount account3 = new BankAccount("Saving account", 500);
	    account3.checkBalance();
	    
	    account1.setName("Akash");
	   System.out.println(account1.getName());
	    
	    System.out.println(account1.routingNumber);
	    account1.setRate();
	    account1.increaseRate();

	}

}
