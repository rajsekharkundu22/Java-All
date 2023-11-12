import java.util.Scanner;

/*
 *  Print a pattern based on 'n' value.
 *  if n=3 
 *  1**
 *  22*
 *  333 
 */
public class Question_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		printPattern(n);
	}

	private static void printPattern(int n) {
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(r);
			}
			for(int c=r+1; c<=n; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
