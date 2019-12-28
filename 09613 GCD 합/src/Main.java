import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int n = scan.nextInt();
			int[] num = new int[n];
			for (int j = 0; j < n; j++) {
				num[j] = scan.nextInt();
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
