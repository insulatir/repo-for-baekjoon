import java.util.*;
public class Main {
	static boolean[][] visited;
	static int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int w = scan.nextInt();
		int h = scan.nextInt();
		while (w != 0) {
			int[][] map = new int[h][w];
			visited = new boolean[h][w];
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					map[i][j] = scan.nextInt();
				}
			}
			
			int count = 0;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (!visited[i][j]) {
						if (map[i][j] == 1) {
							bfs(i, j, h, w, map);
							count += 1;
						}
					}
				}
			}
			
			System.out.println(count);
			
			w = scan.nextInt();
			h = scan.nextInt();
		}
		
		scan.close();
	}

	public static void bfs(int i, int j, int h, int w, int[][] map) {
		Queue<Integer> q = new LinkedList<>();
		visited[i][j] = true;
		q.add(100*i+j);
		while (!q.isEmpty()) {
			int now = q.poll();
			for (int k = 0; k < 8; k++) {
				int now_i = now / 100;
				int now_j = now % 100;
				int y = now_i + dy[k];
				int x = now_j + dx[k];
				if (0 <= x && x < w && 0 <= y && y < h) {
					if (map[y][x] == 1) {
						if (!visited[y][x]) {
							visited[y][x] = true;
							q.add(y*100+x);
						}
					}
				}
			}
		}
	}
}
