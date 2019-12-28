import java.util.*;
import java.io.*;
public class Main {
	static int[][][] map;
	static int[][][] after;
	static boolean[][][] visited;
	static int[][][] check;
	static List<Location> xyz;
	static int[] dx = {0, 0, 0, 0, -1, 1};
	static int[] dy = {0, 0, -1, 1, 0, 0};
	static int[] dz = {-1, 1, 0, 0, 0, 0};
	static int N, M, H;
	
	public static class Location {
		int y;
		int x;
		int z;
		
		public Location(int y, int x, int z) {
			this.y = y;
			this.x = x;
			this.z = z;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		
		map = new int[N][M][H];
		visited = new boolean[N][M][H];
		check = new int[N][M][H];
		xyz = new ArrayList<>();
		
		for (int k = 0; k < H; k++) {
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++) {
					map[i][j][k] = Integer.parseInt(st.nextToken());
					if (map[i][j][k] == 1) {
						xyz.add(new Location(i, j, k));
					}
				}
			}
		}
		
		after = map;
		
		bfs();
		
		int max = 0;
		boolean can = true;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				for (int k = 0; k < H; k++) {
					if (after[i][j][k] == 0) {
						can = false;
					}
					if (max < check[i][j][k]) {
						max = check[i][j][k];
					}
				}
			}
		}
		
		if (can) {
			bw.write(max + "");
		} else {
			bw.write("-1");
		}
		
		bw.flush();
		bw.close();
	}

	public static void bfs() {
		Queue<Location> q = new LinkedList<>();
		
		for (Location loc : xyz) {
			int y = loc.y;
			int x = loc.x;
			int z = loc.z;
			q.add(loc);
			visited[y][x][z] = true;
		}
		
		while (!q.isEmpty()) {
			Location n = q.poll();
			int ny = n.y;
			int nx = n.x;
			int nz = n.z;
			for (int i = 0; i < 6; i++) {
				int ndy = ny + dy[i];
				int ndx = nx + dx[i];
				int ndz = nz + dz[i];
				if (0 <= ndy && ndy < N && 0 <= ndx && ndx < M && 0 <= ndz && ndz < H) {
					if (map[ndy][ndx][ndz] == 0 && visited[ndy][ndx][ndz] == false) {
						after[ndy][ndx][ndz] = 1;
						visited[ndy][ndx][ndz] = true;
						if (check[ndy][ndx][ndz] == 0) {
							check[ndy][ndx][ndz] = check[ny][nx][nz] + 1;
						}
						q.add(new Location(ndy, ndx, ndz));
					}
				}
			}
		}
	}
}
