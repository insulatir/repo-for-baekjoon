import java.io.*;
import java.util.*;
public class Main {
	static int[][] map;
	static int[][] cache;
	static int N, M;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		cache = new int[N][M];
		Arrays.fill(cache, -1);
		
		bw.flush();
		bw.close();
	}

	public static int search(int y, int x) {
		if (cache[y][x] != -1) {
			return cache[y][x];
		}
		
		if (y < 0 || N <= y || x < 0 || M <= x) {
			return Integer.MAX_VALUE;
		}
		
		if (y == N-1) {
			
		}
	}
}
