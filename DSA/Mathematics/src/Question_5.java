
/*
 * 		Find nth Fibonaci number 
 * 		For example, 5th Fibonaci series is 0,1,1,2,3
 */

import java.util.*;

public class Question_5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fibonaci number = ");
		int n = sc.nextInt();
		LinkedList list = fibonaciSeries(n);
		System.out.println(list.toString());
	}

	private static LinkedList fibonaciSeries(int n) {
		LinkedList list = new LinkedList();
		int a = 0;
		int b = 1;
		if (n == 1) {
			list.add(n - 1, a);
			return list;
		}
		if (n == 2) {
			list.add(n - 2, a);
			list.add(n - 1, b);
			return list;
		}
		if (n > 2) {
			list.add(0, a);
			list.add(1, b);
			for (int i = 3; i <= n; i++) {
				int c = a + b;
				list.add(i-1, c);

				a = b;
				b = c;
			}
		}
		return list;
	}
}
