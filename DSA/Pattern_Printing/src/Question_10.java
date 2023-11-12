import java.util.Scanner;

/*
 *  Print a pattern based on 'n' value.
 *  if n=5
 	* * * * *
 	*     *
 	*   *
 	* *
 	* 
 */
public class Question_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		printPattern(n);
	}

	private static void printPattern(int n) {
		for(int r=n; r>=1; r--) {
			for(int c=1;c<=r;c++) {
				if(r==n) {
				System.out.print("*");
				}
				else if(c==1 || c==r) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
