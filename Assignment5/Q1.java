import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 1. Write a JAVA program to perform iterative Linear search on an array to check if a 
given element is present in it or not. */
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of array: ");
		int n =sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter key: ");
		int k=sc.nextInt();
		int index= -1;
		for(int i=0; i<n;i++) {
			if(a[i]==k) {
				index=i;
			}
		}
		if(index == -1) {
			System.out.println("Key not FOUND!");
		} else {
			System.out.println("Key found at index: "+index);
		}
	}

}
