import java.io.*;
import java.util.*;
public class Main {
	static int[][] map;
	static boolean[][] visited;
	static int[][] check;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visited = new boolean[N][M];
		check = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(line.charAt(j) + "");
			}
		}
		
		bfs(0, 0);
		
		bw.flush();
		bw.close();
	}

	public static void bfs(int y, int x) {
		Queue<Integer> q = new LinkedList<>();
		
		visited[y][x] = true;
		q.add(y * 1000 + x);
		check[y][x] = 1;
		
		while (!q.isEmpty()) {
			int n = q.poll();
			int ny = n / 1000;
			int nx = n % 1000;
			
			if (ny == N-1 && nx == M-1) {
				System.out.println(check[ny][nx]);
				break;
			}
			
			for (int i = 0; i < 4; i++) {
				int ndy = ny + dy[i];
				int ndx = nx + dx[i];
				if (0 <= ndy && ndy < N && 0 <= ndx && ndx < M) {
					if (map[ndy][ndx] == 1 && visited[ndy][ndx] == false) {
						// check에 기록되지 않은 것만 가능 (중복 방지)
						visited[ndy][ndx] = true;
						check[ndy][ndx] = check[ny][nx] + 1;
						q.add(ndy * 1000 + ndx);
					}
				}
			}
		}
	}
}
