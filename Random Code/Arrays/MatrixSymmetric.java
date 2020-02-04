import java.util.*;

class Test {
    public static void main(String args[] ) {
    	Scanner sc = new Scanner(System.in);
    	int[][] a = new int[sc.nextInt()][sc.nextInt()];

    	for(int i = 0; i < a.length; i++) {
    		for(int j = 0; j < a.length; j++) {
    			a[i][j] = sc.nextInt();
    		}
    	}
    	

    	for(int i = 0; i < a.length; i++) {
    		for(int j = 0; j < a.length; j++) {
    			if(i == j) {
    				System.out.println("Symmetric");
    				break;
    			}
    		}
    	}
    }
}