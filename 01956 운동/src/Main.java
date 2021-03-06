import java.util.*;
public class Main {
	static int[][] map;
	static int V;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		V = scan.nextInt();
		int E = scan.nextInt();
		
		map = new int[V+1][V+1];
		for (int i = 1; i <= V; i++) {
			for (int j = 1; j <= V; j++) {
				map[i][j] = 4000001;
				if (i ==j) {
					map[i][j] = 0;
				}
			}
		}
		
		for (int i = 1; i < E; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			map[a][b] = c;
		}
		
		ployd();
		
		
		
		scan.close();
	}

	public static void ployd() {
		for (int k = 1; k <= V; k++) {
			for (int i = 1; i <= V; i++) {
				for (int j = 1; j <= V; j++) {
					map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
				}
			}
		}
	}
}
