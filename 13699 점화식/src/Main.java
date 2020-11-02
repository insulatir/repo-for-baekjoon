import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long[] dp = new long[36];
		dp[0] = 1;
		for (int i = 1; i < 36; i++) {
			for (int j = 0; j < i; j++) {
				dp[i] += dp[j] * dp[i-j-1];
			}
 		}
		
		System.out.print(dp[n]);
		
		scan.close();
	}

}
