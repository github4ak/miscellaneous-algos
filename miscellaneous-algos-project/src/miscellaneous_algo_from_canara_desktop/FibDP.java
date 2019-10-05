package miscellaneous_algo_from_canara_desktop;

public class FibDP {
	
	static int fib(int n) {
		int fibarr[] = new int[n+1];
		fibarr[0] = 0;
		fibarr[1] = 1;
		
		for(int i=2 ; i<=n ;i++) {
			fibarr[i] = fibarr[i-1] + fibarr[i-2];
		}
		
		return fibarr[n];
	}
	
	public static void main(String args[]) {
		System.out.println("The "+10+" fibonacci number is "+fib(10));
	}
}
