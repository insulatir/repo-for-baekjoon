import java.util.*;
public class Main {
	static int[][] map;
	static boolean[][] visit;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {1, -1, 0, 0};
	
	public static class Loc {
		int y = 0;
		int x = 0;
		
		public Loc(int y, int x) {
			this.y = y;
			this.x = x;
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		List<Loc> list = new ArrayList<>();
		List<Loc> viruses = new ArrayList<>();
		int zeros = 0;
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				map[i][j] = scan.nextInt();
				if (map[i][j] == 0) {
					list.add(new Loc(i, j));
					zeros += 1;
				} else if (map[i][j] == 2) {
					viruses.add(new Loc(i, j));
				}
			}
		}
		
		int min = zeros - 3;
		for (int i = 0; i < list.size()-2; i++) {
			for (int j = i+1; j < list.size()-1; j++) {
				for (int k = j+1; k < list.size(); k++) {
					int[][] wall = new int[N][M];
					for (int a = 0; a < N; a++) {
						for (int b = 0; b < M; b++) {
							wall[a][b] = map[a][b];
						}
					}
					
					Loc loc1 = list.get(i);
					Loc loc2 = list.get(j);
					Loc loc3 = list.get(k);
					
					wall[loc1.y][loc1.x] = 1;
					wall[loc2.y][loc2.x] = 1;
					wall[loc3.y][loc3.x] = 1;
					
					visit = new boolean[N][M];
					int virus = bfs(N, M, viruses, wall);
					if (min > virus) {
						min = virus;
					}
				}
			}
		}
		
		System.out.print(zeros - 3 - min);
		
		scan.close();
	}

	public static int bfs(int N, int M, List<Loc> viruses, int[][] wall) {
		Queue<Loc> q = new LinkedList<>();
		
		for (Loc virus : viruses) {
			visit[virus.y][virus.x] = true;
			q.add(virus);
		}
		
		int count = 0;
		while (!q.isEmpty()) {
			Loc n = q.poll();
			
			for (int i = 0; i < 4; i++) {
				int ny = n.y + dy[i];
				int nx = n.x + dx[i];
				
				if (0 <= ny && ny < N && 0 <= nx && nx < M) {
					if (wall[ny][nx] == 0 && !visit[ny][nx]) {
						visit[ny][nx] = true;
						count += 1;
						q.add(new Loc(ny, nx));
					}
				}
			}
		}
		
		return count;
	}
}
