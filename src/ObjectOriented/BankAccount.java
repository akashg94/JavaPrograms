package ObjectOriented;


public class BankAccount implements IRate {
	//define variables
	String accountNumber;
	
	//static belongs to class not the obejct instance
	//final is constant (ofthen static final)
	//instance variable
	static String routingNumber = "01123";
	private String name;
	String ssn;
	String accountType;
	double balance;
	
	//constructor
	BankAccount (){
		System.out.println("New account created");
		
	}
	BankAccount(String accountType){
		
		System.out.println("new account: " + accountType);
	}
	
	BankAccount (String accountType, double initdeposit){
		System.out.println("New Account : " + accountType);
		System.out.println("initial deposit of : " + initdeposit);
		
		String msg = null;
		if (initdeposit < 500) {
			msg = "Error: minimum deposit 500";
			
		}else {
			msg = "Thanks for the intial deposit : " + initdeposit;
		}
		System.out.println(msg);
		balance = initdeposit;
		
	}
	
	void deposit(double amount) {
		balance = balance + amount;
		
	}
	void withdraw(double amount) {
		balance = balance + amount;
		
	}
	void checkBalance() {
		System.out.println("Banalnce: " + balance);
		
	}
	//getters/setters
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	//interface methods
	public void setRate() {
		System.out.println("setting rate");
	}
		
	
	public void increaseRate() {
		System.out.println("increasing the rate");
	

}
}
