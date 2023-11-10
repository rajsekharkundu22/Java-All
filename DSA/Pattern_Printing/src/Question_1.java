import java.util.Scanner;

public class Question_1 {
	
	/*
	 		Design this Pattern
	 		***
	 		***
	 		***
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 'n' value = ");
		int n = sc.nextInt();
		
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
