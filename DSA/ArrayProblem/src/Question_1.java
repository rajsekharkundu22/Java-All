
/*
 * 		You have an array of size n.
		int arr[] = {5,4,9,-1,2};
		Now you need to select any (n-1) element and sum those element and find maxSum and minSum.
 */

import java.util.Scanner;
public class Question_1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter size of the array = ");
	int n = sc.nextInt();
	
	int arr[] = new int[n];
	for(int i=0; i<n; i++) {
		System.out.println("Enter the value of the array : ");
		arr[i] = sc.nextInt();
	}
	System.out.println("Array creation completed");
	
	findMaxMinSum(arr,n);
	
	}

	private static void findMaxMinSum(int[] arr, int n) {
		
		int maxElement = Integer.MIN_VALUE;
		int minElement = Integer.MAX_VALUE;
		
		int sum = 0;
		
		
		for(int element : arr) {
			sum = sum + element;
			
			if(element > maxElement) {
				maxElement = element;
			}
			if(element < minElement) {
				minElement = element;
			}
		}
		
	int maxSum = sum - minElement;
	int minSum = sum - maxElement;
	
	System.out.println("Max Sum of (n-1) elements = " + maxSum);
	System.out.println("Min Sum of (n-1) elements = " + minSum);
		
	}
}
