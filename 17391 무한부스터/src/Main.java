import java.util.*;
public class Main {
	static int[][] board = new int[300][300];
	// 게임판이며 최대 100x100의 크기를 갖는다.
	static int[][] cache = new int[300][300];
	// 메모이제이션을 위한 캐쉬이며 똑같이 100x100의 크기를 갖는다.
	static int N, M = 0;
	// NxM 게임판
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		M = scan.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				board[i][j] = scan.nextInt();
				// NxM만큼 보드 위의 수를 가져옵니다.
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

	public static int jump(int y, int x) {
		if (y == N-1 && x == M-1) {
			// 기저 사례: 마지막 칸에 도착한 경우
			return 0;
		}
		
		if (cache[y][x] != -1) {
			// 메모이제이션
			return cache[y][x];
		}
		
		int jumpSize = board[y][x];
		// board에서 점프할 거리를 가져옵니다.
		
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
		// 오른쪽 뛸 경우와 아래로 뛸 경우의 수들 중 최소의 값을 cache에 저장합니다.
		return cache[y][x];
		// 또한 cache에 저장했던 경우의 수를 반환합니다.
	}
}
