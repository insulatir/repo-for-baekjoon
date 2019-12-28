import java.util.*;
public class Main {
	static int[][] board = new int[100][100];
	// �������̸� �ִ� 100x100�� ũ�⸦ ���´�.
	static long[][] cache = new long[100][100];
	// �޸������̼��� ���� ĳ���̸� �Ȱ��� 100x100�� ũ�⸦ ���´�.
	static int n = 0;
	// NxN ������
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = scan.nextInt();
				// NxN��ŭ ���� ���� ���� �����ɴϴ�.
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

	public static long jump(int y, int x) {
		if (y >= n || x >= n) {
			// ���� ���: ������ ���� ��� ���
			return 0;
		}
		
		if (y == n-1 && x == n-1) {
			// ���� ���: ������ ĭ�� ������ ���
			return 1;
		}
		
		if (cache[y][x] != -1) {
			// �޸������̼�
			return cache[y][x];
		}
		
		int jumpSize = board[y][x];
		// board���� ������ �Ÿ��� �����ɴϴ�.
		if (jumpSize == 0) {
			// �� 0�� ���
			return 0;
			// 0�� ��ȯ�Ͽ� ���� ��͸� �����մϴ�.
		}
		
		cache[y][x] = jump(y, x + jumpSize) + jump(y + jumpSize, x);
		// ������ �� ���� �Ʒ��� �� ����� ���� ���ļ� cache�� �����մϴ�.
		return cache[y][x];
		// ���� cache�� �����ߴ� ����� ���� ��ȯ�մϴ�.
	}
}
