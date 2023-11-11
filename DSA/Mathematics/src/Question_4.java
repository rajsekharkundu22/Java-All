
/*
 * 		Find a number is a Harsad number or not
 * 		n = 18;
 *		-> sumOfDigit = 1+8 = 9
 *		-> if n%sumOfDigit reminder = 0 then Harsad No
 */
import java.util.Scanner;

public class Question_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number = ");
		int num = sc.nextInt();
		boolean flag = findHarsadNo(num);
		if (flag) {
			System.out.println("Harsad Number");
		} else {
			System.out.println("Non Harsad Number");
		}
	}

	private static boolean findHarsadNo(int num) {

		int originalNum = num;
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			num = num / 10;
			sum = sum + digit;
		}
		if (originalNum % sum == 0)
			return true;

		return false;
	}
}
