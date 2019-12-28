import java.io.*;
import java.util.*;
public class Main {
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int N;
	static int M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			map = new int[N][M];
			visited = new boolean[N][M];
			
			for (int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int X = Integer.parseInt(st.nextToken());
				int Y = Integer.parseInt(st.nextToken());
				
				map[Y][X] = 1;
			}
			
			int count = 0;
			
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if (map[j][k] == 1 && visited[j][k] == false) {
						bfs(j, k);
						count += 1;
					}
				}
			}
			
			bw.write(count + "\n");
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void bfs(int y, int x) {
		Queue<Integer> q = new LinkedList<>();
		
		visited[y][x] = true;
		q.add(100 * y + x);
		
		while (!q.isEmpty()) {
			int n = q.poll();
			int ny = n / 100;
			int nx = n % 100;
			for (int i = 0; i < 4; i++) {
				int ndy = ny + dy[i];
				int ndx = nx + dx[i];
				if (0 <= ndy && ndy < N && 0 <= ndx && ndx < M) {
					if (map[ndy][ndx] == 1 && visited[ndy][ndx] == false) {
						visited[ndy][ndx] = true;
						q.add(100 * ndy + ndx);
					}
				}
			}
		}
	}
}
