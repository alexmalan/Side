import java.util.*;

class Test {
    public static void main(String args[] ) {
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[sc.nextInt()];

       for(int i = 0; i < arr.length; i++) {
       		arr[i] = sc.nextInt();
       		System.out.print(arr[i] + " ");
       }
       System.out.println();

       System.out.println("Search for a number: ");
       int nr = sc.nextInt();
       boolean b = false;

       for(int i = 0; i < arr.length; i++) {
       		if(arr[i] == nr)
       			b = true;
       }

       if(b) {
       	System.out.println("Found!");
       } else {
       	System.out.println("Not Found!");
       }
	}
}