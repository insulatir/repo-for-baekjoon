import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int C = scan.nextInt();
		for (int i = 0; i < C; i++) {
			int n = scan.nextInt();
			int divisors = 0;
			for (int j = 1; j <= n; j++) {
				if (n % j == 0) {
					divisors += 1;
				}
			}
			
			System.out.println(n + " " + divisors);
		}
		
		scan.close();
	}

}
