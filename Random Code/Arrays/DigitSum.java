import java.util.*;

class Test {
	static int digitSum(int a) {
		if(a/10 == 0) {
			return a;
		} else {
			return (a/10) + (a%10);
		}
	}

    public static void main(String args[] ) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	System.out.println(digitSum(a));
    }
}