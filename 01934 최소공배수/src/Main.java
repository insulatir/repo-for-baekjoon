import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A*B/gcd(A, B));
		}
		
		scan.close();
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a%b);
	}
}
