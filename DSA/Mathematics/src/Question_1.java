
/*
 		Sum Of a Digit
 		n = 135
*/

public class Question_1 {
	public static void main(String[] args) {
		int n = 135;
		int sum = sumOfDigit(n);
		System.out.println("Sum of Digit = " + sum);
	}

	private static int sumOfDigit(int n) {
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			sum = sum + r;
		}
		return sum;
	}

}
