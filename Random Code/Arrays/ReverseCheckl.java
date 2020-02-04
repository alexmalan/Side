import java.util.*;

class Test {
    public static void main(String args[] ) {
    	Scanner sc = new Scanner(System.in);
    	int[] a = new int[sc.nextInt()];

    	for(int i = 0; i < a.length; i++) {
	    	a[i] = sc.nextInt();
	    }

    	boolean read = true;
	    int j = a.length-1;

	    for(int i = 0; i < a.length / 2; i++){
	      if(a[i] != a[j]){
	        read = false;
	        break;
	      }
	      else
	        j--;
	    }
	    System.out.println(read);
	}
}
