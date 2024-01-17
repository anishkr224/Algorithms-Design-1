import java.util.Arrays;
import java.util.Scanner;

class Q2a{
	// programe works for same size array
		public static void main(String[] args){
			
			Scanner sc = new Scanner(System.in);

	        System.out.println("Enter size for sorted array 1:");
	        int n1 = sc.nextInt();
	        int arr1[] = new int[n1];
	        System.out.println("Enter elements for sorted array 1:");
	        for (int i = 0; i < n1; i++)
	            arr1[i] = sc.nextInt();
	        
	        System.out.println("Enter size for sorted array 2:");
	        int n2 = sc.nextInt();
	        int arr2[] = new int[n2];
	        System.out.println("Enter elements for sorted array 1:");
	        for (int i = 0; i < n2; i++)
	            arr2[i] = sc.nextInt();
			merge(arr1, arr2, arr1.length, arr2.length);
			System.out.print("After Merging \nFirst Array: ");
			System.out.println(Arrays.toString(arr1));
			System.out.print("Second Array: ");
			System.out.println(Arrays.toString(arr2));
		}

	static void merge(int arr1[], int arr2[], int m, int n){
		for (int i = n - 1; i >= 0; i--) {
			int j, last = arr1[m - 1];
			for (j = m - 2; j >= 0 && arr1[j] > arr2[i];j--)
				arr1[j + 1] = arr1[j];
			if (last > arr2[i]) {
				arr1[j + 1] = arr2[i];
				arr2[i] = last;
			}
		}
	}
}