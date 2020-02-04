import java.util.*;

class Test {
    public static void main(String args[] ) {
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[sc.nextInt()];
       int p = 0, n = 0, o = 0, e = 0, z = 0;

       for(int i = 0; i < arr.length; i++) {
       		arr[i] = sc.nextInt();
       }

       for(int i = 0; i < arr.length; i++) {
       			if (arr[i] > 0)
       				p++;
       			
       			if (arr[i] < 0)
       				n++;
       			
       			if (arr[i]%2==0)
       				e++;
       		
       			if (arr[i]%2!=0)
       				o++;

       			if (arr[i]==0)
       				z++;
       	}
       	
       System.out.println("There are " + p + " positive numbers");
       System.out.println("There are " + n + " negative numbers");
       System.out.println("There are " + o + " odd numbers");
       System.out.println("There are " + e + " even numbers");
       System.out.println("There are " + z + " zeroes");

       
	}
}