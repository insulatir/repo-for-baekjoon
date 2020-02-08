import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		if (N > 0 && M > 0) {
			int[][] shape = new int[N][M];
			for (int i = 0; i < N; i++) {
				String line = scan.next();
				for (int j = 0; j < M; j++) {
					shape[i][M-j-1] = Integer.parseInt(line.substring(j, j+1));
				}
			}
			
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					System.out.print(shape[i][j]);
				}
				System.out.println();
			}
		}
		
		scan.close();
	}

}
