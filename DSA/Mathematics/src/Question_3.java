
/*
 * 		Find a number is an Armstrong number or not 
 */

import java.util.Scanner;
public class Question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		boolean flag = findArmstrongNo(num);
		if(flag) {
			System.out.println("It's an Armstrong No");
		}else {
			System.out.println("Not Armstrong");
		}
	}

	private static boolean findArmstrongNo(int num) {
		
		//1st findout no of digit
		int temp = num;
		int noOfdigit=0;
		while(num != 0) {
			num = num/10;
			noOfdigit++;
		}
		num = temp;
		
		//2nd Find Armstrong or not
		int sum = 0;
		while(num != 0) {
		int digit =	num%10;
		num = num/10;
		
		//sum = (int) (sum + Math.pow(digit, noOfdigit));
		
		int tempDigit = 1;
			for(int i=0; i<noOfdigit; i++) {
				tempDigit = tempDigit * digit; 
			}
			sum = sum + tempDigit;	
		}
		
		if(sum == temp) return true;
		
		return false;
	}

}
