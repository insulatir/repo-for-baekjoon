import java.util.*;
public class Main {
	public static boolean[] check;
	public static int[] dx = {0, 0, 1, -1};
	public static int[] dy = {1, -1, 0, 0};
	public static int R;
	public static int C;
	public static int max;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		R = scan.nextInt();
		C = scan.nextInt();
		char[][] map = new char[R][C];
		for (int i = 0; i < R; i++) {
			String line = scan.next();
			for (int j = 0; j < C; j++) {
				map[i][j] = line.charAt(j);
			}
		}
		
		check = new boolean[26];
		check[map[0][0]-'A'] = true;
		max = 1;
		
		back(0, 0, map, 1);
		
		System.out.print(max);
		
		scan.close();
	}

	public static void back(int y, int x, char[][] map, int len) {	
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];

			if (0 <= ny && ny < R && 0 <= nx && nx < C) {
				int alpha = map[ny][nx] - 'A';
				if (!check[alpha]) {
					if (max < len+1) {
						max = len+1;
					}
					
					// ¾ËÆÄºªÀ» ¹âÀ½
					check[alpha] = true;
					back(ny, nx, map, len+1);
					// ¾ËÆÄºª¿¡¼­ ³ª¿È
					check[alpha] = false;
				} 
			}	
		}
	}
}
