import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A1 = scan.nextInt();
		int B1 = scan.nextInt();
		int A2 = scan.nextInt();
		int B2 = scan.nextInt();
		
		int A = A1 * B2 + A2 * B1;
		int B = B1 * B2;
		int gcd = gcd(A, B);
		
		System.out.print(A/gcd + " " + B/gcd);
		
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
