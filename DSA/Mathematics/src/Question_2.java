/*
 * 		Sum of digit where number in String format
 * 		String num = "1345672";
 */
public class Question_2 {
	public static void main(String[] args) {
		String num = "134";
		int sum = sumOfDigit(num);
		System.out.println(sum);
	}

	private static int sumOfDigit(String num) {
		int sum = 0;
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			// int 1 --> different from --> char 1
			// char 1 is an ASCI code and integer value of char 1 is 49
			sum = sum + (c - 48);
		}
		return sum;
	}
}
