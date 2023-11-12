import java.util.Scanner;

/*
 *  Print a pattern based on 'n' value.
 *  if n=3 
 *  ***
 *  **
 *  * 
 */
public class Question_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		printPattern(n);
	}

	private static void printPattern(int n) {
		for(int r=n; r>=1; r--) {
			for(int c=1; c<=r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
