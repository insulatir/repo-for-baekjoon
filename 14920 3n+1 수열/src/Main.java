import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int c1 = scan.nextInt();
		int c2 = c(c1);
		long n = 1;
		while (!(c1 == 1)) {
			n += 1;
			c1 = c2;
			c2 = c(c1);
		}
		
		System.out.print(n);
		
		scan.close();
	}

	public static int c(int n) {
		if (n % 2 == 0) {
			return n / 2;
		} else {
			return 3 * n + 1;
		}
	}
}
