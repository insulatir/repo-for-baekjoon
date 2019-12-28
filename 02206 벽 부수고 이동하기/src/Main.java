import java.util.*;
import java.io.*;
public class Main {
	static int[][] map;
	static boolean[][][] visited;
	static int[][][] check;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int N, M;

	public static class Location {
		int y;
		int x;
		int wall;
		
		public Location(int y, int x, int wall) {
			this.y = y;
			this.x = x;
			this.wall = wall;
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visited = new boolean[N][M][2];
		check = new int[N][M][2];
		
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(line.charAt(j) + "");
			}
		}
		
		bfs();
		int res0 = check[N-1][M-1][0];
		int res1 = check[N-1][M-1][1];
		
		if (res1 == 0 && res0 == 0) {
			bw.write("-1");
		} else if (res0 == 0) {
			bw.write(res1 + "");
		} else if (res1 == 0) {
			bw.write(res0 + "");
		} else {
			bw.write(Math.min(res0, res1) + "");
		}

		bw.flush();
		bw.close();
	}

	public static void bfs() {
		Queue<Location> q = new LinkedList<>();
		
		visited[0][0][0] = true;
		q.add(new Location(0, 0, 0));
		check[0][0][0] = 1;
		
		while (!q.isEmpty()) {
			Location n = q.poll();
			int y = n.y;
			int x = n.x;
			int wall = n.wall;
			for (int i = 0; i < 4; i++) {
				int ndy = y + dy[i];
				int ndx = x + dx[i];
				if (0 <= ndy && ndy < N && 0 <= ndx && ndx < M) {
					if (visited[ndy][ndx][wall] == false && check[ndy][ndx][wall] == 0) {
						if (map[ndy][ndx] == 0) {
							visited[ndy][ndx][wall] = true;
							check[ndy][ndx][wall] = check[y][x][wall] + 1;
							q.add(new Location(ndy, ndx, wall));
						} else {
							if (wall == 0) {
								visited[ndy][ndx][1] = true;
								check[ndy][ndx][1] = check[y][x][wall] + 1;
								q.add(new Location(ndy, ndx, 1));
							}
						}
					}
				}
			}
		}
		
	}
}