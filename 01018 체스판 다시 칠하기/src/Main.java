import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int c0 = 0;
		int c1 = 0;
		int min = Integer.MAX_VALUE;
		int[][] board = new int[N][M];
		for (int i = 0; i < N; i++) {
			String line = scan.next();
			
			for (int j = 0; j < M; j++) {
				if (line.charAt(j) == 'W') {
					board[i][j] = 0;
				} else {
					board[i][j] = 1;
 				}
			}
		}
		
		for (int k = 0; k <= N-8; k++) {
			for (int l = 0; l <= M-8; l++) {
				c0 = 0;
				c1 = 0;
				
				for (int i = k; i < k+8; i++) {
					for (int j = l; j < l+8; j++) {
						int color = board[i][j];
						
						if ((i + j) % 2 == 0) {
							if (color != 0) {
								c0 += 1;
							} else {
								c1 += 1;
							}
						} else {
							if (color != 1) {
								c0 += 1;
							} else {
								c1 += 1;
							}
						}
					}
				}
				
				int c = (int) Math.min(c0, c1);
				if (min > c) {
					min = c;
				}
			}
		}
		
		System.out.print(min);
		
		scan.close();
	}

}
