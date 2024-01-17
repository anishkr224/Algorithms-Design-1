 import java.util.Scanner;
 public class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* 1. Write a JAVA program to arrange n numbers present in a given array 
           in ascending order using Bubble sort algorithm. */
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        bubbleSort(a,n);
        System.out.println("sorted array is: ");
        for(int i=0;i<n;i++) {
	        System.out.print(a[i]+"  ");
	    }
    }    
	    static void bubbleSort(int[] arr,int n) {
	        for (int i=0; i< n-1; i++) {
	            for (int j=0; j<n-i-1; j++) {
	                if (arr[j] > arr[j+1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }
	    }
	}
