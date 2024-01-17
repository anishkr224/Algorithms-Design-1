import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
    	/* 1. Given an array of positive numbers, a reduction operation involves subtracting the smallest 
number of the array from each element of the array. Write a JAVA program to perform 
reduction till no elements left in the array. Print the elements left after each reduction and 
total number of reductions performed. 
        Time complexity: O(nlogn).*/
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l=arr.length;
        ArrayReduction(arr,l);
    }
        public static void ArrayReduction(int[] arr, int size) {
            Arrays.sort(arr);
            int count = 1;
            int reduction = arr[0];
       
            for (int i=0; i<size; i++) {
                  if (arr[i]-reduction > 0) {
                        reduction = arr[i];
                        count += 1;
                  }
            }
            System.out.println("Total number of reductions " + count);
       }
}