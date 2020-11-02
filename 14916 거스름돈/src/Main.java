import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] dp = new int[100001];
		dp[0] = 0;
		dp[1] = 100001;
		dp[2] = 1;
		dp[3] = 100001;
		dp[4] = 2;
		for (int i = 5; i <= n; i++) {
			dp[i] = 100001;
			if (dp[i-2] < 100001) {
				dp[i] = Math.min(dp[i], dp[i-2] + 1);
			}
			if (dp[i-5] < 100001) {
				dp[i] = Math.min(dp[i], dp[i-5] + 1);
			}
		}
		
		System.out.print(dp[n] == 100001 ? -1 : dp[n]);
		
		scan.close();
	}

}
