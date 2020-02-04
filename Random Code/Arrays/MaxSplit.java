import java.util.*;

class Test {
    public static void main(String args[] ) {
    	Scanner sc = new Scanner(System.in);
    	int[] a = new int[sc.nextInt()];
    	int max = Integer.MIN_VALUE;
    	int smax = Integer.MIN_VALUE;
    	int re = 0;

    	for(int i = 0; i < a.length; i++){
    			a[i] = sc.nextInt();
    			if(a[i] < 0) {
    				System.out.println("Exit!");
    				break;
    			}
    	}

    	for(int i = 0; i < a.length; i++) {
    		if(a[i] > max){
    			smax = max;
    			max = a[i];
    		}	
    	}

    	for(int i : a){
    		if((max - smax) == i)
    			re = i;
    	}

    	for(int i = 0; i < a.length; i++)  {
    		System.out.print(a[i] + " ");
    	}
    	System.out.println(smax + " " + re);
    }
}