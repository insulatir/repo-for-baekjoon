import java.util.*;
public class Main {
	static int[][] map;
	static boolean[][] visit;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0}; 
	
	public static class Location {
		int y;
		int x;
		
		public Location(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int M = scan.nextInt();
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		map = new int[M][N];
		visit = new boolean[M][N];
		
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				map[i][j] = 1;
			}
		}
		
		for (int i = 0; i < K; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			
			for (int j = y1; j < y2; j++) {
				for (int k = x1; k < x2; k++) {
					map[j][k] = 0;
				}
			}
		}
		
		List<Integer> area = new ArrayList<>();
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1 && !visit[i][j]) {
					bfs(i, j, N, M, area);
				}
			}
		}
		
		Collections.sort(area);
		
		System.out.println(area.size());
		
		for (int i = 0; i < area.size(); i++) {
			System.out.print(area.get(i) + " ");
		}
		
		scan.close();
	}

	public static void bfs(int y, int x, int N, int M, List<Integer> area) {
		Queue<Location> q = new LinkedList<>();
		
		visit[y][x] = true;
		q.add(new Location(y, x));
		
		int count = 0;
		while (!q.isEmpty()) {
			Location n = q.poll();
			count += 1;
			
			for (int i = 0; i < 4; i++) {
				int nx = n.x + dx[i];
				int ny = n.y + dy[i];
				
				if (0 <= ny && ny < M && 0 <= nx && nx < N) {
					if (map[ny][nx] == 1 && !visit[ny][nx]) {
						visit[ny][nx] = true;
						q.add(new Location(ny, nx));
					}
				}
			}
		}
		
		area.add(count);
	}
}
