
public class recursive extends Thread {
	public static int fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	@Override
	public void run() {
		long k = System.currentTimeMillis();
		int p = fibonacci(40);
		k = System.currentTimeMillis() - k;
		System.out.println("Using recursive Thread found the Output is " + p + "  in " + k + "ms\n");
	}
}
