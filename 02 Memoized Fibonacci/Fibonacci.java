public class Fibonacci {
	
	public static void main(String[] args) {
		Fibonacci temp = new Fibonacci();
		temp.Launch();
	}
	
	public void Launch() {
		long timey = System.currentTimeMillis();
		System.out.println("Fib(40) is " + fib(40));
		System.out.println("Time taken " + (double) (System.currentTimeMillis()
			- timey) / 1000 + " seconds.");
		timey = System.currentTimeMillis();
		System.out.println(fib(45));
		System.out.println("Time taken " + (double) (System.currentTimeMillis()
			- timey) / 1000 + " seconds.");
	}
	
	public static int fib(int n) {
		if ((n == 1) || (n == 2)) {
			return 1;
		}
		else {
			int result = fib(n-1) + fib(n-2);
		return result;
		}
	}

	
}