import java.util.*;
public class Main {
	public static boolean[][] visit;
	public static int[] dx = {0, 0, 1, -1};
	public static int[] dy = {1, -1, 0, 0};
	public static int R;
	public static int C;
	public static int max;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		R = scan.nextInt();
		C = scan.nextInt();
		String[][] map = new String[R][C];
		for (int i = 0; i < R; i++) {
			String line = scan.next();
			for (int j = 0; j < C; j++) {
				map[i][j] = line.substring(j, j+1);
			}
		}
		
		visit = new boolean[R][C];
		
		max = 1;
		
		List<String> list = new ArrayList<>();
		list.add(map[0][0]);
		
		back(0, 0, list, map, 1);
		
		System.out.print(max);
		
		scan.close();
	}
	
	public static boolean promising(int y, int x, String[][] map, List<String> list) {
		String alpha = map[y][x];
		return !list.contains(alpha) && !visit[y][x];
	}

	public static void back(int y, int x, List<String> list, String[][] map, int len) {
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];

			if (0 <= ny && ny < R && 0 <= nx && nx < C) {
				if (promising(ny, nx, map, list)) {
					if (max < len+1) {
						max = len+1;
					}
					
					visit[ny][nx] = true;
					list.add(map[ny][nx]);
					back(ny, nx, list, map, len+1);
				} 
			}
			
		}
	}
}
