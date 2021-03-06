import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		for (int i = 0; i < T; i++) {
			int N = scan.nextInt();
			int M = scan.nextInt();
			int[][] array = new int[N+1][M+1];
			for (int j = 0; j <= N; j++) {
				Arrays.fill(array[j], -1);
			}
			System.out.println(opt(array, N, M));
		}
		
		scan.close();
	}

	public static int opt(int[][] M, int n, int m) {
		if (M[n][m] != -1) {
			return M[n][m];
		}
		if (m < n) {
			return 0;
		}
		
		M[n][m] = 0;
		for (int i = 1; i < n; i++) {
			M[n][m] += (m-i)*opt(M, i, m-1);
		}
		
		return M[n][m];
	}
}
