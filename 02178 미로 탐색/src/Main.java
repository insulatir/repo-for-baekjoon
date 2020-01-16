import java.util.*;
public class Main {
	static int[][] map;
	static boolean[][] visit;
	static int[][] count;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {-1, 1, 0, 0};

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		map = new int[N][M];
		visit = new boolean[N][M];
		count = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			String line = scan.next();
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}

		bfs(0, 0, N, M);
		
		scan.close();
	}

	public static class Location {
		int y;
		int x;
		
		public Location(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	
	public static void bfs(int x, int y, int N, int M) {
		Queue<Location> q = new LinkedList<>();
		
		visit[y][x] = true;
		q.add(new Location(y, x));
		count[y][x] = 1;
		
		while (!q.isEmpty()) {
			Location n = q.poll();
			
			if (n.y == N - 1 && n.x == M - 1) {
				System.out.print(count[n.y][n.x]);
				break;
			}
			
			for (int i = 0; i < 4; i++) {
				int nx = dx[i] + n.x;
				int ny = dy[i] + n.y;
				if (0 <= nx && nx < M && 0 <= ny && ny < N) {
					if (map[ny][nx] == 1 && !visit[ny][nx]) {
						visit[ny][nx] = true;
						count[ny][nx] = count[n.y][n.x] + 1;
						q.add(new Location(ny, nx));
					}
				}
			}
		}
	}
}
