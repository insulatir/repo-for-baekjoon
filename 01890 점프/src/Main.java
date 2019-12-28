import java.util.*;
public class Main {
	static int[][] board = new int[100][100];
	// 게임판이며 최대 100x100의 크기를 갖는다.
	static long[][] cache = new long[100][100];
	// 메모이제이션을 위한 캐쉬이며 똑같이 100x100의 크기를 갖는다.
	static int n = 0;
	// NxN 게임판
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = scan.nextInt();
				// NxN만큼 보드 위의 수를 가져옵니다.
				cache[i][j] = -1;
				// 캐쉬를 -1로 초기화합니다.
				// 이는 계산이 되지 않았다는 것을 나타냅니다.
			}
		}
		
		jump(0, 0);
		// (0, 0)에서 jump를 시작합니다.
		System.out.println(cache[0][0]);
		// 재귀 호출로 인해 cache[0][0]에 전체 경로 수가 적히게됩니다.
		
		scan.close();
	}

	public static long jump(int y, int x) {
		if (y >= n || x >= n) {
			// 기저 사례: 게임판 밖을 벗어난 경우
			return 0;
		}
		
		if (y == n-1 && x == n-1) {
			// 기저 사례: 마지막 칸에 도착한 경우
			return 1;
		}
		
		if (cache[y][x] != -1) {
			// 메모이제이션
			return cache[y][x];
		}
		
		int jumpSize = board[y][x];
		// board에서 점프할 거리를 가져옵니다.
		if (jumpSize == 0) {
			// 단 0일 경우
			return 0;
			// 0을 반환하여 무한 재귀를 방지합니다.
		}
		
		cache[y][x] = jump(y, x + jumpSize) + jump(y + jumpSize, x);
		// 오른쪽 뛸 경우와 아래로 뛸 경우의 수를 합쳐서 cache에 저장합니다.
		return cache[y][x];
		// 또한 cache에 저장했던 경우의 수를 반환합니다.
	}
}
