import java.util.*;

class Test {
    public static void main(String args[] ) {
    	Scanner sc = new Scanner(System.in);
    	int[] a = new int[sc.nextInt()];
    	for(int i = 0; i < a.length; i++) {
    		a[i] = sc.nextInt();
    	}
    	int t = a[4];

    	for(int i = a.length - 1; i >= 1; i--) {
    		a[i] = a[i-1];
    	}
    	a[0] = t;
    	for(int i = 0; i < a.length; i++) {
    		System.out.print(a[i]  + " ");
    	}
    }
}