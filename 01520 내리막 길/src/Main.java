import java.util.*;
public class Main {
	static int[][] board;
	static int[][] cache;
	static int M, N;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		M = scan.nextInt();
		N = scan.nextInt();
		board = new int[M][N];
		cache = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = scan.nextInt();
				cache[i][j] = -1;
			}
		}

		descending(0, 0);
		System.out.println(cache[0][0]);
		
		scan.close();
	}

	public static int descending(int y, int x) {
		if (y == M-1 && x == N-1) {
			return 1;
		}
		
		if (cache[y][x] != -1) {
			return cache[y][x];
		}
		
		cache[y][x] = 0;
		int stand = board[y][x];
		
		if (y-1 >= 0) {
			if (stand > board[y-1][x]) {
				cache[y][x] += descending(y-1, x);
			}
		}
		
		if (y+1 < M) {
			if (stand > board[y+1][x]) {
				cache[y][x] += descending(y+1, x);
			}
		}
		
		if (x-1 >= 0) {
			if (stand > board[y][x-1]) {
				cache[y][x] += descending(y, x-1);
			}
		}
		
		if (x+1 < N) {
			if (stand > board[y][x+1]) {
				cache[y][x] += descending(y, x+1);
			}
		}
		
		return cache[y][x];
	}
}
