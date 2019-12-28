import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int bi = 1;
		bi *= fact(N) / (fact(N-K) * fact(K));
		System.out.print(bi);
		scan.close();
	}
	
	private static int fact(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result = n * fact(n-1);
		}
		return result;
	}
}
