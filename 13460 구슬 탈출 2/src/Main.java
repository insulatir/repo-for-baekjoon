import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		String[][] board = new String[N][M];
		for (int i = 0; i < N; i++) {
			String line = scan.nextLine();
			for (int j = 0; j < N; j ++) {
				board[i][j] = line.substring(j, j+1);
			}
		}
		
		scan.close();
	}

	public static void go(int n, String[][] board) {
		
	}
}
