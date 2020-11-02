import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		long[] dp = new long[117];
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		for (int i = 4; i <= n; i++) {
			dp[i] = dp[i-1] + dp[i-3];
		}
		
		System.out.print(dp[n]);
		
		scan.close();
	}

}
