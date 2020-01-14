import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int p = scan.nextInt();
		int q = scan.nextInt();
		int s = scan.nextInt();
		int gcd = gcd(p, q);
		System.out.print(s >= p * q / gcd ? "yes" : "no");
		
		scan.close();
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		
		return gcd(b, a % b);
	}
}
