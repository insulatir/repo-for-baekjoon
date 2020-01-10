import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			int zero = 0;
			for (int j = 2; j <= N; j++) {
				int n = N;
				while (n % j == 0) {
					zero += 1;
					n = n / j;
				}
			}
			System.out.println(zero);
		}
		
		scan.close();
	}

}
