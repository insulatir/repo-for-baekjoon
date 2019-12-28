import java.util.*;
public class Main {
	static int[][] map;
	static int N;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		int M = scan.nextInt();
		map = new int[N+1][N+1];
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (i == j) {
					map[i][j] = 0;
				} else {
					map[i][j] = 10000001;
				}
			}
		}
		
		for (int i = 0; i < M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			map[a][b] = Math.min(map[a][b], c);
		}
		
		floyd();
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (map[i][j] == 10000001) {
					System.out.print(0 + " ");
				} else {
					System.out.print(map[i][j] + " ");
				}
			}
			System.out.println();
		}
		
		scan.close();
	}

	public static void floyd() {
		for (int k = 1; k <= N; k++) {
			for (int i = 1; i <= N; i++) {
				for (int j = 1; j <= N; j++) {
					if (map[i][j] > map[i][k] + map[k][j]) {
						map[i][j] = map[i][k] + map[k][j];
					}
				}
			}
		}
	}
}
