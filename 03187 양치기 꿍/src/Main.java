import java.util.*;
import java.io.*;
public class Main {
	static int R, C;
	static int totalSheep;
	static int totalWolf;
	static String[][] map;
	static boolean[][] visited;

	public static class Location {
		int x;
		int y;
		
		public Location(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		totalSheep = 0;
		totalWolf = 0;
		
		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			
		}
		
		visited = new boolean[R][C];
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (!visited[i][j]) {
					if (map[i][j] == "#") {
						continue;
					} else {
						bfs(new Location(j, i));
					}
				}
			}
		}
		
		bw.write(totalSheep + " " + totalWolf);
		
		bw.flush();
		bw.close();
	}
	
	public static void bfs(Location loc) {
		Queue<Location> q = new LinkedList<>();
		int[] dx = {0, 0, 1, -1};
		int[] dy = {1, -1, 0, 0};
		int x = loc.x;
		int y = loc.y;
		
		int sSheep = 0;
		int sWolf = 0;
		
		visited[y][x] = true;
		q.add(loc);
		while (!q.isEmpty()) {
			Location n = q.poll();
			int nx = n.x;
			int ny = n.y;
			
			for (int i = 0; i < 4; i++) {
				int dxi = dx[i];
				int dyi = dy[i];
				
				if (map[dyi][dxi] == "v") {
					sWolf += 1;
				} else if (map[dyi][dxi] == "k") {
					sSheep += 1;
				}
				
				if (0 <= nx+dxi && nx+dxi < C && 0 <= ny+dyi && ny+dyi < R) {
					if (!visited[ny+dyi][nx+dxi]) {
						visited[ny+dyi][nx+dxi] = true;
						q.add(new Location(nx+dxi, ny+dyi));
					}
				}
			}
		}
		
		if (sSheep > sWolf) {
			totalSheep += sSheep;
		} else {
			totalWolf += sWolf;
		}
	}
}
