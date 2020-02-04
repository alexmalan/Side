import java.util.*;

class Test {
    public static void main(String args[] ) {
    	Scanner sc = new Scanner(System.in);
    	int[] a = new int[sc.nextInt()];
    	int min2 = Integer.MAX_VALUE;
    	int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    	for(int i = 0; i < a.length; i++) {
    		a[i] = sc.nextInt();
    	}

    	for(int i = 0; i < a.length; i++) {
    		// Max check
    		if(a[i] > max)
    			max = a[i];

    		// Min Check - if first element is min
    		if(a[i] == min){
          		min2 = min;
          		// check normal min then assign the last 
          		// known value of min to min2
        	} else if (a[i] < min) {
            	min2 = min;
            	min = a[i];
            	// check if 
        	} else if (a[i] < min2) {
            	min2 = a[i];
        	}
    	}

    	System.out.println("Maximum difference: " + (max - min));
    	System.out.println("Minimum difference: " + (min - min2));
	}
}