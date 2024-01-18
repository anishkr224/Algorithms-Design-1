import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5. Given a list n numbers, write a JAVA program to find the element that appears 
		maximum number of times. */
			Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the size of array:");
	        int n = sc.nextInt();
	        int arr[]=new int[n];
	        System.out.println("Enter array elements:");
	        for (int i=0; i<n; i++) {
	            arr[i]=sc.nextInt();
	        }
	        System.out.print("element that appears maximum number of times: "+mostFrequent(arr, n)); 
		}
	 
	public static int mostFrequent(int[] arr, int n) { 
		int maxcount = 0; 
		int ele= 0; 
		for (int i = 0; i < n; i++) { 
		int count = 0; 
		for (int j = 0; j < n; j++) { 
			if (arr[i] == arr[j]) { 
			count++; 
			} 
		} 
		if (count > maxcount) { 
			maxcount = count; 
			ele= arr[i]; 
		} 
		}
		return ele; 
	}
}
