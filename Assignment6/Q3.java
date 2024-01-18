
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 3. Given an array of n-1 unique elements from 1 to n with a number missing. Write a 
		JAVA program to find the missing number. */
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the size of array:");
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		          System.out.println("Enter (n-1) numbers: ");
		          for(int i=0; i<=n-2; i++) {
		             arr[i] = sc.nextInt();
		          }
		          int sumOfAll = (n*(n+1))/2;
		          int sumOfArray = 0;
		          for(int i=0; i<n-1; i++) {
		             sumOfArray = sumOfArray+arr[i];
		          }
		          int missingNumber = sumOfAll-sumOfArray;
		          System.out.println("Missing number is: "+missingNumber);
		       }
		    }