import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
    	/* 4. Write a JAVA program to find the element pair with minimum/maximum difference 
in a given array of integers. */
    	    Scanner sc = new Scanner(System.in);
    	    System.out.println("Enter the size of array:");
    	    int n = sc.nextInt();
    	    int arr[] = new int[n];
    	    System.out.println("Enter array elements:");
    	    for (int i = 0; i < n; i++) {
    	      arr[i] = sc.nextInt();
    	    }

    	    int max = arr[0], index = 0;
    	    for (int i = 1; i < n; i++) {
    	      if (arr[i] > max) {
    	        max = arr[i];
    	        index = i;
    	      }
    	    }
    	    int mindiff = max, maxdiff = 0;
    	    for (int i = 0; i < n; i++) {
    	      if (i != index) {
    	        mindiff = Math.min(Math.abs(max - arr[i]), mindiff);
    	        maxdiff = Math.max(Math.abs(max - arr[i]), maxdiff);
    	      }
    	    }
    	    System.out.println("Minimum difference is:" + mindiff);
    	    System.out.println("Maximum difference is:" + maxdiff);
    	  }
    	}