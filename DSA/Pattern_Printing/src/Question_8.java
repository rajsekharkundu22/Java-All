import java.util.Scanner;

/*
 *  Print a pattern based on 'n' value.
 *  if n=5
 *  A
 *  A B 
 *  A B C 
 *  A B C D
 *  A B C D E 
 */
public class Question_8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		printPattern(n);
	}

	private static void printPattern(int n) {
		for(int r =1; r<=n; r++) {
			char ch = 'A';
			for(int c=1; c<=r; c++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
	}

}
