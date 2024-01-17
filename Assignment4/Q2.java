import java.util.Arrays;

public class Q2 {
	/* 2. Given two sorted arrays, write a JAVA program to sort the elements of these arrays without 
using any extra array so that first half of sorted elements will lie in first array and second 
half lies in second array. */
    static void mergea(int[] nums1, int m, int[] nums2, int n,int arr3[]) {

        for (int i = 0;i< nums1.length;i++){
            arr3[i]=nums1[i];
        }
        for (int i = 0;i< nums2.length;i++){
            arr3[nums1.length+i]=nums2[i];
        }
        Arrays.sort(arr3);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int arr1[] = {10,11,12,13};
        int arr3[] = new int[arr.length+ arr1.length];
        mergea(arr, arr.length, arr1, arr1.length,arr3);
        for (int i = 0;i< arr3.length;i++){
            System.out.print(arr3[i]+" ");
        }

    }
}