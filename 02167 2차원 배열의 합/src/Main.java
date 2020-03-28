import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] arr = new int[N+1][M+1];
		for (int i = 1; i <= N; i++) {
			arr[i][1] = scan.nextInt();
			for (int j = 2; j <= M; j++) {
				arr[i][j] = arr[i][j-1] + scan.nextInt();
			}
		}
		
		int K = scan.nextInt();
		for (int k = 0; k < K; k++) {
			int i = scan.nextInt();
			int j = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			int ans = 0;
			for (int n = i; n <= x; n++) {
				ans += arr[n][y] - arr[n][j-1];
			}
			
			System.out.println(ans);
		}
		
		scan.close();
	}

}
