import java.util.Scanner;

public class Q2 {
	
    public static void main(String[] args) {
    	// 2. Write a JAVA program to print the duplicate elements in a given array of n numbers.
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Duplicate elements in given array: "); 
        for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if (arr[i]==arr[j]) { 
                    System.out.print(arr[i]+" ");
                    }
            }   	
        }
    }
}
