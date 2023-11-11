import java.util.*;

/*
 * 		Find the unique elements in array
 * 		int arr[] = {7,1,2,3,1,5,3,5};
 */
public class Question_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array = ");
		int n =  sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter the array elements = ");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		LinkedList list = findUniqueElement(arr, n);
		System.out.println(list.toString());
	}

	private static LinkedList findUniqueElement(int[] arr, int n) {
		LinkedList list = new LinkedList();
		int k=0;
		for(int i=0; i<n; i++) {
			int count = 0;
			for(int j=0; j<n; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count==1) {
				list.add(k, key);
				k++;
			}
			
		}
		return list;
	}

}
