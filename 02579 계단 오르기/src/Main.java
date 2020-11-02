import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int[][] dp = new int[n][2];
		dp[0][0] = arr[0];
		if (n > 1) {
			dp[1][0] = dp[0][0] + arr[1];
			dp[1][1] = arr[1];
		}
		for (int i = 2; i < n; i++) {
			dp[i][0] = dp[i-1][1] + arr[i];
			dp[i][1] = Math.max(dp[i-2][0], dp[i-2][1]) + arr[i];
		}
		
		System.out.print(Math.max(dp[n-1][0], dp[n-1][1]));
		
		scan.close();
	}

}
