import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 3. Write a JAVA program to perform iterative Binary search on an array to check if a 
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
		int result = binarySearch(arr, key);
		if (result == -1) {
			System.out.println("Element not present");
		}else {
			System.out.println("Element found at index "+ result);
	}
	}
			public static int binarySearch(int arr[], int k){
				int l=0, r=arr.length - 1;
				while (l<=r){
					int mid=l+(r-l)/2;
					if (arr[mid] == k)
						return mid;
					if (arr[mid] < k)
						l=mid+1;
					else
						r=mid-1;
				}
				return -1;
			}
				
		}

