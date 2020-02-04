import java.util.*;

class Test {
    public static void main(String args[] ) {
    	Scanner sc = new Scanner(System.in);
    	int[] arr = new int[sc.nextInt()];
    	int min = arr[0] , max = arr[0];

    	for(int i = 0; i < arr.length; i++) {
    		arr[i] = sc.nextInt();
    	}

    	for(int i = 0; i < arr.length; i++) {
    		min = arr[0];
    		max = arr[0];

    		if(arr[i] > max) {
    			max = arr[i];
    		}

    		if(arr[i] < min) {
    			min = arr[i];
    		}
    	}

    	System.out.println("Max in array is: " + max);
    	System.out.println("Min in array is: " + min);
   	}
}
