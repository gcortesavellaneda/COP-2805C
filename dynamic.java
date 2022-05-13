
public class dynamic extends Thread {
	public static int fibonacci(int n) {
		int v1 = 0, v2 = 1, v3 = 0;
		for (int i = 2; i <= n; i++) {
			v3 = v1 + v2;
			v1 = v2;
			v2 = v3;
		}
		return v3;
	}

	@Override
	public void run() {
		long k = System.currentTimeMillis();
		int p = fibonacci(40);
		k = System.currentTimeMillis() - k;
		System.out.println("Using dynamic Thread found the Output is " + p + " in " + k + "ms\n");
	}
}
