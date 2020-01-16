import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	static String[][] map;
	static boolean[][] visit;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int sheep = 0;
	static int wolf = 0;
	
	public static class Loc {
		int x;
		int y;
		
		public Loc(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int R = scan.nextInt();
		int C = scan.nextInt();
		map = new String[R][C];
		for (int i = 0; i < R; i++) {
			String line = scan.next();
			for (int j = 0; j < C; j++) {
				map[i][j] = line.substring(j, j+1);
			}
		}
		
		visit = new boolean[R][C];
		
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (!map[i][j].equals("#") && !visit[i][j]) {
					bfs(new Loc(i, j), R, C);
				}
			}
		}
		
		System.out.print(sheep + " " + wolf);
		
		scan.close();
	}
	
	public static void bfs(Loc loc, int N, int M) {
		Queue<Loc> q = new LinkedList<>();
		
		visit[loc.y][loc.x] = true;
		q.add(loc);
		
		int w = 0;
		int s = 0;
		while (!q.isEmpty()) {
			Loc n = q.poll();
			
			if (map[n.y][n.x].equals("v")) {
				w += 1;
			} else if (map[n.y][n.x].equals("o")) {
				s += 1;
			}
			
			for (int i = 0; i < 4; i++) {
				int ny = n.y + dy[i];
				int nx = n.x + dx[i];
				
				if (0 <= ny && ny < N && 0 <= nx && nx < M) {
					if (!map[ny][nx].equals("#") && !visit[ny][nx]) {
						visit[ny][nx] = true;
						q.add(new Loc(ny, nx));
					}
				}
			}
		}
		
		if (s > w) {
			sheep += s;
		} else {
			wolf += w;
		}
	}
}
