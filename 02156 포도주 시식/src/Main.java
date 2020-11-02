import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] arr = new int[10001];
		for (int i = 1; i <= n; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] dp = new int[10001];
		dp[1] = arr[1];
		dp[2] = arr[1] + arr[2];
 		for (int i = 3; i <= n; i++) {
			dp[i] = Math.max(dp[i-1], // i번째 잔을 마시지 않은 경우
					Math.max(dp[i-2]+arr[i], // i-1번째 잔을 마시지 않은 경우
							dp[i-3]+arr[i-1]+arr[i])); // i-2번째 잔을 마시지 않은 경우
		}
 		
 		System.out.print(dp[n]);
		
		scan.close();
	}

}
