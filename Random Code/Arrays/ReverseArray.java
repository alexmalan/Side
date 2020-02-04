import java.util.*;

class Test {
    public static void main(String args[] ) {
       	Scanner sc = new Scanner(System.in);
       	int n = sc.nextInt();
       	int[] arr = new int[n];
       	int[] arr2 = new int[n];

       	for(int i = 0; i < n; i++) {
       		arr[i] = sc.nextInt();
       	}

       	int j = 0;
       	for(int i = n - 1; i >= 0; i--) {
       			arr2[i] = arr[j];
       			j++;
       		}
       	
       	for(int i = 0; i < n; i++) {
       		System.out.print(arr2[i] + " ");
       	}
    }
}
