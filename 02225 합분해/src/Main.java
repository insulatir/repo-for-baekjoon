import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		// 정수 N
		int K = scan.nextInt();
		// 정수 K
		int[][] array = new int[N + 1][K + 1];
		// 0부터 N까지 K개이므로 (N, K)가 마지막 원소가 되게 민듭니다.
		
		array[0][0] = 1;
		// (0, 0)이 1으로 해야 알고리즘이 잘 작동합니다.
		for (int j = 1; j <= K; j++) {
			for (int i = 0; i <= N; i++) {
				for (int k = 0; k <= i; k++) {
					array[i][j] = (array[i][j] + array[k][j-1]) % 1000000000;
					// (N, K) = (0, K-1) + (1, K-1) + ... + (N-1, K-1) + (N, K-1)
					// K-1개으로 이루어진 조합에 각각 0에서 N까지 더하면 (N, K)을 구할 수 있습니다.
				}
			}
		}
		
		System.out.println(array[N][K]);
		// (N, K) 출력
		
		scan.close();
	}

}
