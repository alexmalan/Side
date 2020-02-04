import java.util.*;

class Test {
    public static void main(String args[] ) {
    	Scanner sc = new Scanner(System.in);
    	int[] a = new int[sc.nextInt()];
    	int index1 = sc.nextInt();
    	int index2 = sc.nextInt();

    	for(int i = 0; i < a.length; i++) {
    		a[i] = sc.nextInt();
    	}

    	for(int i = index1; i < index2; i++){
    		System.out.print(a[i]);
    	}
	}
}
