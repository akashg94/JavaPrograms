package ObjectOriented;
     class person {
		String name;
		String email;
		String phone;
		
		void walk() {
			System.out.println(name + " Can walk properly");
			
		}
		void eat() {
			System.out.println(name + "can eat");
			
		}
		void mailaddress() {
			System.out.println(name + "email id is " + email);
		}
		
	}
	public class ObjectAndClass {

	public static void main(String[] args) {
		//instantiating an object
		person person1 = new person();
		
		//define some properties
		person1.name = "John Doe";
		person1.email = "johndoe@gmail.com";
		person1.phone = "0192923929291";
		
      person person2 = new person();
		
		//define some properties
		person2.name = "Dam Daniel";
		person1.email = "Damdian@gmail.com";
		person1.phone = "01929231209231";
		
		System.out.println("..............................");
		
		//abstraction
		person1.walk();
		person1.eat();
		person1.mailaddress();
		//person 2 behaviour
		person2.walk();
		person2.eat();
		person2.mailaddress();
		
		

	}

}
