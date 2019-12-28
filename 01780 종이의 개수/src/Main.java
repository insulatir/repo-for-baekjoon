import java.util.*;
public class Main {
	public static int[][] board;
	public static int[] num;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		board = new int[N][N];
		num = new int[3];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				board[i][j] = scan.nextInt();
			}
		}
		
		rec(N, 0, 0);
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		scan.close();
	}

	public static boolean check(int N, int y, int x) {
		int stand = board[y][x];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (stand != board[y+i][x+j]) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void rec(int N, int x, int y) {
		if (N == 0) {
			return;
		}
		
		if (check(N, x, y)) {
			num[board[x][y]+1] += 1;
		} else {
			int n = N/3;
			rec(n, x, y);
			rec(n, x+n, y);
			rec(n, x+2*n, y);
			rec(n, x, y+n);
			rec(n, x+n, y+n);
			rec(n, x+2*n, y+n);
			rec(n, x, y+2*n);
			rec(n, x+n, y+2*n);
			rec(n, x+2*n, y+2*n);
		}
	}
}
