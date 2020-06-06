package StudentDatabase;

public class studentMain {
	public static void main (String[]args) {
		student stu = new student("Akash", "12223322");
		student stu1 = new student("dik", "1222312");
		student stu2= new student("Tom", "134432");
		
		
		stu.enroll("Math101");
		stu.enroll("Eng101");
		stu.showCourses();
		stu.checkBalance();
		
	}

}

class student {
	//properties
	private static int id = 10;
	private String userId;
	private String name;
	private String ssn;
	private String email;
	private String courses = "";
	private static final int costofCourses = 800;
	private int balance = 0;
	
	
	
	public student ( String name, String ssn) {
		id ++;
		this.name = name;
		this.ssn = ssn;
		setEmail();
		//setAccountID();
		setUserId();
		
	}
	//setting up an email for student
	private void setEmail() {
		email = name.toLowerCase() + "bccuny.edu.com";
		System.out.println("Your email is : " +  email);
	}
	
	private void setUserId() {
		int max = 90;
		int min = 10;
		double randNum = (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		System.out.println(randNum);
		userId = id + "" + randNum + ssn.substring(5);
		System.out.println("Your user ID : " + userId);
	}
	
	public void enroll(String course) {
		this.courses = this.courses + "\n" + course;
		balance = balance + costofCourses;
		
		
	}
	
	public void checkBalance() {
		System.out.println("Balance : " + balance);
		
	}
	public void showCourses() {
		System.out.println(courses);
		
	}
	public void payTution(int amount) {
		balance = balance - amount;
		
	}
	
}
