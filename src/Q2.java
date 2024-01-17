import java.util.Scanner;
 public class Q2{
    public static void main(String[] args) {
    	/* 2. Write a JAVA program to arrange n numbers present in a given array 
    	  in ascending order using Insertion sort algorithm. */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++){
            int temp=a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;  
        }
        System.out.println("sorted array is: ");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+"  ");
    }
}