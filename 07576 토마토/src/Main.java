import java.io.*;
import java.util.*;
public class Main {
	static int[][] map;
	static int[][] afterMap;
	static boolean[][] visited;
	static int[][] check;
	static int N, M;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
	
		map = new int[N][M];
		visited = new boolean[N][M];
		check = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		List<Integer> xys = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 1) {
					xys.add(i * 10000 + j);
				}
			}
		}
		
		bfs(xys);
		
		int max = 0;
		boolean can = true;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (afterMap[i][j] == 0) {
					can = false;
				}
				if (max < check[i][j]) {
					max = check[i][j];
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

	public static void bfs(List<Integer> xys) {
		Queue<Integer> q = new LinkedList<>();
		afterMap = map;
		
		for (int i = 0; i < xys.size(); i++) {
			int y = xys.get(i) / 10000;
			int x = xys.get(i) % 10000;
			visited[y][x] = true;
			q.add(xys.get(i));
		}
		
		while (!q.isEmpty()) {
			int n = q.poll();
			int ny = n / 10000;
			int nx = n % 10000;
			for (int i = 0; i < 4; i++) {
				int ndy = ny + dy[i];
				int ndx = nx + dx[i];
				if (0 <= ndy && ndy < N && 0 <= ndx && ndx < M) {
					if (map[ndy][ndx] == 0 && visited[ndy][ndx] == false) {
						afterMap[ndy][ndx] = 1;
						visited[ndy][ndx] = true;
						check[ndy][ndx] = check[ny][nx] + 1;
						q.add(ndy * 10000 + ndx);
					}
				}
			}
		}
	}
}
