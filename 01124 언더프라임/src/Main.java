import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int res = 0;
		
		for (int i = A; i <= B; i++) {
			if (isPrime(numberOfprime(i))) {
				res += 1;
			}
		}
		
		System.out.println(res);
		
		scan.close();
	}
	
	public static int numberOfprime(int n) {
		int count = 0;
		
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				n /= i;
				count += 1;
			}
		}
		
		return count;
	}

	public static boolean isPrime(int n) {
		if (n == 1) {
			return false;
		}
		
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
}
