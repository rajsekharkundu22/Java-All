import java.util.Scanner;

/*
 *  Print a pattern based on 'n' value.
 *  if n=5
 *  A
 *  A B A
 *  A B C B A
 *  A B C D C B A
 *  A B C D E D C B A
 */
public class Question_9 {

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
			ch--;
			for(int c=1; c<=r-1; c++) {
				System.out.print(--ch);
			}
			System.out.println();
		}
		
	}

}