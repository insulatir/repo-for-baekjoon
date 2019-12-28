import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long A = scan.nextLong();
		long X = scan.nextLong();
		
		System.out.println(squre(A, X));
		
		scan.close();
	}

	public static long squre(long a, long x) {
		if (x == 1) {
			return a;
		}
		
		if (x % 2 == 0) {
			long half = squre(a, x/2) % 1000000007;
			return (half * half) % 1000000007;
		} else {
			return (squre(a, x-1) % 1000000007 * a) % 1000000007;
		}
	}
}
