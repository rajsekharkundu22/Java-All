
/*
 * 		Find the factorial of a number
 * 		for example factorial of 4 is .. 4*3*2*1 
 */
import java.util.*;
public class Question_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int n = sc.nextInt();
		
		long factorial = findFactorial(n); // use long otherwise cross datatype overflow
		System.out.println("Factorial of " + n + " is " + factorial);
	}

	private static long findFactorial(int n) {
		long factorial = 1;
		for(int i=n; i>0; i--) {
			factorial = factorial*i;
		}
		
		return factorial;
	}

}
