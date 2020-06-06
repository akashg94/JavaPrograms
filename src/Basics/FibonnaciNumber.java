package Basics;

public class FibonnaciNumber {
	public static void main(String[]args) {
		//Fibonnaci number are defined by the sum of the 2 previous numbers
		
		//fib(0) = 0
		//fib (1) =1
		//fib(2) fib 0 + fib 1 = 0 + 1 = 1
		//fib (3) fib 2 + fib 1 = 1 + 1 = 2
		//fib (4) fib 3 + fib 2 = 2 + 1 = 3
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
		System.out.println(fib(5));
		System.out.println(fib(6));
		System.out.println(fib(7));
		System.out.println(fib(8));
		System.out.println(fib(9));
		System.out.println(fib(10));
		
		 
		
	}
	public static int fib(int n) {
		if (n == 0) {
			return 0;
		}else if (n == 1) {
			return 1;
		}
		return (fib(n-1) + fib(n-2));
	}

}
