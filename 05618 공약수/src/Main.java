import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int gcd = 0;
		if (n == 2) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			gcd = gcd(a, b);
		} else {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			gcd = gcd(gcd(a, b), gcd(b, c));
		}
		
		for (int i = 1; i <= gcd; i++) {
			if (gcd % i == 0) {
				System.out.println(i);
			}
		}
		
		scan.close();
	}

	public static int gcd(int a, int b) {
		if (a < b) {
			gcd(b, a);
		}
		
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a%b);
	}
}
