import java.util.Scanner;

/*
 *  Print a Binary pattern based on 'n' value.
 *  if n=5
 *  10101
 *  01010
 *  10101 
 *  01010
 *  10101
 */
public class Question_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number = ");
		int n = sc.nextInt();
		printBinaryPattern(n);
	}

	private static void printBinaryPattern(int n) {
		boolean flag = true;
		for(int r=1; r<=n; r++) {
			for(int c=1; c<=n; c++) {
				if(flag == true) {
					System.out.print("1");
					flag=false;
				}else {
					System.out.print("0");
					flag=true;
				}
			}
			System.out.println();
		}
		
	}

}
