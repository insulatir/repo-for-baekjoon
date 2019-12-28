import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int n = Integer.parseInt(s.split(":")[0]);
		int m = Integer.parseInt(s.split(":")[1]);
		int gcd = gcd(n, m);
		
		System.out.println(n / gcd + ":" + m / gcd);
		
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
