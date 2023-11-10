import java.util.Scanner;
public class Question_2 {
	
	/*
	 		Design this Pattern
	 		111
	 		222
	 		333
	 */
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'n' Value = ");
		int n = sc.nextInt();
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				System.out.print(r);
			}
			System.out.println();
		}
		
	}

}
