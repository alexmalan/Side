import java.util.*;

class Test {
    public static void main(String args[] ) {
    	Scanner sc = new Scanner(System.in);
    	int[] a = new int[sc.nextInt()];
    	

    	for(int i = 0; i < a.length; i++) {
    		a[i] = sc.nextInt();
    	}

    	int t = 0;
	    for(int i = 0;i < a.length - 1; i++){
	      for(int j = i+1; j < a.length; j++){
	        if(a[i] > a[j]) {
	          t = a[i];
	          a[i] = a[j];
	          a[j] = t;
	        }
	      }
	    }

    	for(int i = 0; i < a.length; i++) {
    		System.out.print(a[i] + " ");
    	}
    }
}