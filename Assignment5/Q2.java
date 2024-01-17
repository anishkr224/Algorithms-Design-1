import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 2. Write a JAVA program to perform recursive Linear search on an array to check if a 
		given element is present in it or not. */
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter size:");
		        int n = sc.nextInt();
		        int arr[] = new int[n];
		        System.out.println("Enter array elements:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = sc.nextInt();
		        }
		        System.out.println("Enter key to search: ");
		        int key = sc.nextInt();
		        int index = RecLinearSearch(arr, key, n-1);

		        if (index == -1)
		            System.out.println("Key not FOUND!!!");
		        else
		            System.out.println("Key found at index:" + index);
		    }

		    public static int RecLinearSearch(int arr[], int key, int i) {
		        if (i == -1)
		            return -1;
		        else if (arr[i] == key)
		            return i;
		        return RecLinearSearch(arr, key, i - 1);
	}

}
