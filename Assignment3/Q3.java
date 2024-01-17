 import java.util.Scanner;
 public class Q3{
    public static void main(String[] args) {
    	/* 3. Write a JAVA program to arrange n numbers present in a given array
              n ascending order using Selection sort algorithm. */
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){ 
            int min=i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
        System.out.println("sorted array is: ");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+"  ");  
    }
 }