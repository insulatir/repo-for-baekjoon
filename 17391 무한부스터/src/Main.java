import java.util.*;
public class Main {
	static int[][] board = new int[300][300];
	// �������̸� �ִ� 100x100�� ũ�⸦ ���´�.
	static int[][] cache = new int[300][300];
	// �޸������̼��� ���� ĳ���̸� �Ȱ��� 100x100�� ũ�⸦ ���´�.
	static int N, M = 0;
	// NxM ������
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				board[i][j] = scan.nextInt();
				// NxM��ŭ ���� ���� ���� �����ɴϴ�.
				cache[i][j] = -1;
				// ĳ���� -1�� �ʱ�ȭ�մϴ�.
				// �̴� ����� ���� �ʾҴٴ� ���� ��Ÿ���ϴ�.
			}
		}
		
		jump(0, 0);
		// (0, 0)���� jump�� �����մϴ�.
		System.out.println(cache[0][0]);
		// ��� ȣ��� ���� cache[0][0]�� ��ü ��� ���� �����Ե˴ϴ�.
		
		scan.close();
	}

	public static int jump(int y, int x) {
		if (y == N-1 && x == M-1) {
			// ���� ���: ������ ĭ�� ������ ���
			return 0;
		}
		
		if (cache[y][x] != -1) {
			// �޸������̼�
			return cache[y][x];
		}
		
		int jumpSize = board[y][x];
		// board���� ������ �Ÿ��� �����ɴϴ�.
		
		int[] mins = new int[jumpSize*2];
		for (int i = 0; i < mins.length; i++) {
			mins[i] = 1000;
		}
		
		for (int i = 1; i <= jumpSize; i++) {
			if (y + i <= N - 1) {
				mins[2*i-1] = jump(y + i, x) + 1;
			}
			if (x + i <= M - 1) {
				mins[2*i-2] = jump(y, x + i) + 1;
			}
		}
		Arrays.sort(mins);
		cache[y][x] = mins[0];
		// ������ �� ���� �Ʒ��� �� ����� ���� �� �ּ��� ���� cache�� �����մϴ�.
		return cache[y][x];
		// ���� cache�� �����ߴ� ����� ���� ��ȯ�մϴ�.
	}
}
