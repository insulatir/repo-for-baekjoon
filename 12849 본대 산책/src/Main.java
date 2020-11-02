import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int D = scan.nextInt();
		long[][] dp = new long[8][2];
		/* 0 : 정보과학관
		 * 1 : 전산관
		 * 2 : 미래관
		 * 3 : 신앙관
		 * 4 : 한경직기념관
		 * 5 : 진리관
		 * 6 : 형남공학관
		 * 7 : 학생회관
		 * */
		
		dp[0][1] = 1;
		
		for (int i = 0; i < D; i++) {
			dp = walk(dp);
		}
		
		System.out.print(dp[0][1]);
		
		scan.close();
	}

	public static long[][] walk(long[][] dp) {
		dp[0][0] = dp[0][1];
		dp[1][0] = dp[1][1];
		dp[2][0] = dp[2][1];
		dp[3][0] = dp[3][1];
		dp[4][0] = dp[4][1];
		dp[5][0] = dp[5][1];
		dp[6][0] = dp[6][1];
		dp[7][0] = dp[7][1];
		
		dp[0][1] = (dp[1][0] + dp[2][0]) % 1000000007;
		dp[1][1] = (dp[0][0] + dp[2][0] + dp[3][0]) % 1000000007;
		dp[2][1] = (dp[0][0] + dp[1][0] + dp[3][0] + dp[4][0]) % 1000000007;
		dp[3][1] = (dp[1][0] + dp[2][0] + dp[4][0] + dp[5][0]) % 1000000007;
		dp[4][1] = (dp[2][0] + dp[3][0] + dp[5][0] + dp[6][0]) % 1000000007;
		dp[5][1] = (dp[3][0] + dp[4][0] + dp[7][0]) % 1000000007;
		dp[6][1] = (dp[4][0] + dp[7][0]) % 1000000007;
		dp[7][1] = (dp[5][0] + dp[6][0]) % 1000000007;
	
		return dp;
	}
}
