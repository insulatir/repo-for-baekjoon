import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int gcd = gcd(a, b);
			System.out.println(a*b/gcd + " " + gcd);
		}
		
		scan.close();
	}

	public static int gcd(int a, int b) {
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a%b);
	}
}
