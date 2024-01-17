import java.util.Scanner;

public class Q3 {
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = sc.nextInt();
        int a[] = new int[n];
        int i;
        System.out.println("Enter elements:");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
		int l = a.length;
		if(sortArr(a, l)) { 
		System.out.println("Yes"); 
		}else{ 
		System.out.println("No"); 
		} 
	}
static void reverse(int[] a,int x,int y){ 
	while(x<y) { 
	int temp = a[x]; 
	a[x] = a[y]; 
	a[y] = temp; 
	x++; 
	y--; 
	} 
} 
static boolean sortArr(int[] a, int n) { 
	int x = -1; 
	int y = -1; 

	for (int i = 0; i < n - 1; i++) { 
		if (a[i] > a[i + 1] && x == -1) {
            x = i;
		}
		y = i + 1; 
	} 
	if (x != -1) { 
	reverse(a,x,y); 
	for (int i = 0; i < n - 1; i++) { 
		if (a[i]>a[i+1]) { 
		return false; 
		}
	}
	}
	return true;  
}
}

/* Input : arr [] = {1, 2, 5, 4, 3}
Output : Yes
By reversing the subarray {5, 4, 3}, the array will be sorted.

Input : arr [] = { 1, 2, 4, 5, 3 }
Output : No */