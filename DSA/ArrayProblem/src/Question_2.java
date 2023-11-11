
/*
 * 		Find the Missing No from an array where element range is 1-10
 * 		int arr[] = {1,5,4,7,10,8,6,3,9};
 */
public class Question_2 {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 4, 7, 10, 8, 6, 3, 9 };
		int missingNo = findMissingNo(arr);
		if(missingNo == -1)	System.out.println("No missing no");
		else System.out.println("Missing No is " + missingNo);

	}

	private static int findMissingNo(int[] arr) {
		for (int i = 1; i <= 10; i++) {
			boolean flag = false;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == i) {
					flag = true;
					break;
				}
			}
			if(flag==false) {
				return i;
			}
		}
		return -1;
	}

}
