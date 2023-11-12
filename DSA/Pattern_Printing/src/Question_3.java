
/*
 *  Print a pattern based on 'n' value.
 *  if n=3 
 *  **1
 *  *12
 *  123 
 */
import java.util.*;
public class Question_3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n = sc.nextInt();
	printPattern(n);
	}

	private static void printPattern(int n) {
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n-r; c++) {
				System.out.print("*");
			}
			for(int c=1; c<=r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}
		
	}
}
