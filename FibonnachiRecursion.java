package dayTwo.homework;

public class FibonnachiRecursion {
	
	public static void main(String[] args) {
	fib(6);
	}

	public static int fib(int n) {
		System.out.println("fiboncci: " +(n));
		if (n < 2) {
			return n; 
	
		} else {
			return  (fib (n-1 )+ fib(n-2));
		}
		
	}

	
	}

   

