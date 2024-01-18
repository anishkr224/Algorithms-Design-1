import java.util.Scanner;

public class Q1{
		/* 1. Given an unsorted array of n elements, write a JAVA program to find the first 
	element, which is repeated. */ 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements:");
        for (int i=0; i<n; i++) {
            arr[i]=sc.nextInt();
        }
		int index= -1;
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				if (arr[i]==arr[j]) {
					index=i;
				}
			}
					break;
		}
		if (index== -1){
			System.out.println("No repeating element found!");
		} else{
			System.out.println("First repeating element is: " + arr[index]);
		}
			}
}
