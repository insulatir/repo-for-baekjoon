import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int gcd = gcd(a, b);
		
		System.out.println(gcd);
		System.out.println(a * b / gcd);
		
		scan.close();
	}

	public static int gcd(int a, int b) {
		if (a < b) {
			gcd(b, a);
		}
		
		if (a % b == 0) {
			return b;
		}
		
		return gcd(b, a%b);
	}
}
