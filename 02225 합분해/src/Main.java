import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		// ���� N
		int K = scan.nextInt();
		// ���� K
		int[][] array = new int[N + 1][K + 1];
		// 0���� N���� K���̹Ƿ� (N, K)�� ������ ���Ұ� �ǰ� �ε�ϴ�.
		
		array[0][0] = 1;
		// (0, 0)�� 1���� �ؾ� �˰����� �� �۵��մϴ�.
		for (int j = 1; j <= K; j++) {
			for (int i = 0; i <= N; i++) {
				for (int k = 0; k <= i; k++) {
					array[i][j] = (array[i][j] + array[k][j-1]) % 1000000000;
					// (N, K) = (0, K-1) + (1, K-1) + ... + (N-1, K-1) + (N, K-1)
					// K-1������ �̷���� ���տ� ���� 0���� N���� ���ϸ� (N, K)�� ���� �� �ֽ��ϴ�.
				}
			}
		}
		
		System.out.println(array[N][K]);
		// (N, K) ���
		
		scan.close();
	}

}
