import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key to search: ");
        int key = sc.nextInt();
        int result = RecBinarySearch(arr, key, 0, n-1);

        if (result == -1)
            System.out.println("Key not FOUND!!!");
        else
            System.out.println("Key found at index:" + result);
    }

    public static int RecBinarySearch(int arr[], int key, int i, int j) {
        if (i > j)
            return -1;
        int mid = i + (j - i) / 2;
        if (arr[mid] == key)
            return mid;
        else if (arr[mid] < key)
            return RecBinarySearch(arr, key, mid + 1, j);
        else
            return RecBinarySearch(arr, key, i, mid - 1);
    }
}