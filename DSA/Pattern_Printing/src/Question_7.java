import java.util.Scanner;

/*
 *  Print a pattern based on 'n' value.
 *  if n=6 
 *  1
 *  2 3
 *  4 5 6
 *  7 8 9 10
 *  11 12 13 14 15
 *  16 17 18 19 20 21 
 */
public class Question_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n= sc.nextInt();
		printPattern(n);
	}

	private static void printPattern(int n) {
		int digit = 1;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=r; c++) {
				System.out.print(digit);
				digit++;
			}
			System.out.println();
		}
		
	}

}
