import java.util.*;
public class Main {
	static int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
	static int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		for (int i = 0; i < t; i++) {
			int I = scan.nextInt();
			int[][] count = new int[I][I];
			boolean[][] visited = new boolean[I][I];
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			bfs(a, b, I, count, visited);
			System.out.println(count[c][d]);
		}
		
		scan.close();
	}

	public static void bfs(int i, int j, int I, int[][] count, boolean[][] visited) {
		Queue<Integer> q = new LinkedList<>();
		visited[i][j] = true;
		q.add(1000*i+j);
		while (!q.isEmpty()) {
			int n = q.poll();
			int n_i = n / 1000;
			int n_j = n % 1000;
			for (int k = 0; k < 8; k++) {
				int y = n_i + dy[k];
				int x = n_j + dx[k];
				if (0 <= y && y < I && 0 <= x && x < I) {
					if (!visited[y][x]) {
						visited[y][x] = true;
						q.add(1000*y+x);
						if (count[y][x] == 0) {
							count[y][x] = count[n_i][n_j] + 1;
						} else {
							count[y][x] = Math.min(count[y][x], count[n_i][n_j] + 1);
						}
					}
				}
			}
		}
	}
}
