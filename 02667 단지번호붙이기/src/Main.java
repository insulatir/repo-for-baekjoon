import java.io.*;
import java.util.*;
public class Main {
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int N;
	static List<Integer> house;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
	
		map = new int[N][N];
		visited = new boolean[N][N];
		house = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			String line = br.readLine();
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(line.charAt(j) + "");
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (map[i][j] == 1 && visited[i][j] == false) {
					bfs(i, j);
				}
			}
		}
		
		bw.write(house.size() + "\n");
		
		Collections.sort(house);
		
		for (int i : house) {
			bw.write(i + "\n");
		}
		
		bw.flush();
		bw.close();
	}

	public static void bfs(int y, int x) {
		Queue<Integer> q = new LinkedList<>();
		
		int num = 0;
		
		visited[y][x] = true;
		q.add(y * 100 + x);
		
		while (!q.isEmpty()) {
			int n = q.poll();
			num += 1;
			int nx = n % 100;
			int ny = n / 100;
			for (int i = 0; i < 4; i++) {
				int ndx = dx[i];
				int ndy = dy[i];
				
				if (0 <= nx + ndx && nx + ndx < N && 0 <= ny + ndy && ny + ndy < N) {
					if (map[ny+ndy][nx+ndx] == 1 && visited[ny+ndy][nx+ndx] == false) {
						visited[ny+ndy][nx+ndx] = true;
						q.add((ny+ndy) * 100 + nx+ndx);
					}
				}
			}
		}
		
		house.add(num);
	}
}
