package Basics;

public class MinMaxAvgOfArray {

	public static void main(String[] args) {
		//write three fuctions that will determine the min,max and avg of an array
		//array of numbers
		int [] numbers = {10,20,65,21,89,12,23,122};
		//printing out min,max and avg
		System.out.println("Min " + findMin(numbers));
		System.out.println("Max" + findMax(numbers));
		System.out.println("Avg" + findAvg(numbers));
		
	}

	
	public static int findMin(int[] arr) {
		int min = arr [0];
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			
		}
		return min;
	}
	public static int findMax(int[] arr) {
		int max = arr [0];
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			

}
		return max;
	}
	public static int findAvg(int []arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum/arr.length;
	}
	
			
}
	
