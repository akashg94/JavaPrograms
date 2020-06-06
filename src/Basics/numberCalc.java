package Basics;

public class numberCalc {
   public static void main(String[]args) {
	   printname();
	   int num1 = 10;
	   int num2 = 20;
	   addNumbers(num1,num2);
	   int product = multiplyNumbers(num1, num2);
	   System.out.println("The multiplication number is " + product);
	   
	   
	   //3 types of method created
   }
   
   static void printname() {
	   System.out.println("My name is Akash");
	   
   }
   
   static void addNumbers(int num1,int num2) {
	   //method will have two numbers
	   int sum = num1 + num2;
	   System.out.println("The sum is : " + sum);
	   
   }
   
   static int multiplyNumbers(int val1, int val2) {
	   int product = val1 * val2;
	   return product;
   }

}
