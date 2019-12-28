import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		int M = scan.nextInt();
		int correct = 0;
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
		
		
		scan.close();
	}

}
