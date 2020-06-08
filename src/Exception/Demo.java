package Exception;

public class Demo {

	public static void main(String[] args) {
		String[]states = {"CA","NY", "PA","NV","NJ"};
		
		for (int i = 0; i<= states.length; i ++) {
			
			try {
			
			System.out.println(states[i]);
			
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("error index ");
			}
			
		}
		

	}

}
