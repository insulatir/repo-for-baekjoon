import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] dp = new int[10001];
		for (int i = 1; i <= k; i++) {
			dp[i] = 10001;
			for (int j = 0; j < n; j++) {
				if (i-arr[j] >= 0) {
					dp[i] = Math.min(dp[i], dp[i-arr[j]] + 1);
				}
			}
		}
		
		System.out.print(dp[k] > 10000 ? -1 : dp[k]);
		
		scan.close();
	}

}
