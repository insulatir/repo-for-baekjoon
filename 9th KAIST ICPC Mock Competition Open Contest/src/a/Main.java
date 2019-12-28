package a;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] matrix = new int[N][M];
		for (int i = 0; i < N; i++) {
			String line = scan.next();
			for (int j = 0; j < M; j++) {
				matrix[i][j] = Integer.parseInt(line.charAt(j) + "");
			}
		}
		
		boolean ok = true;
		int count = 0;
		outer:
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				int mi = matrix[i][j];
				int mir = matrix[N-1-i][M-1-j];
				if (mi == mir) {
					if (mi == 8) {
						continue;
					} else {
						if (i == N-1-i && j == M-1-j) {
							ok = false;
							break outer;
						} else {
							count += 1;
						}
					}
				} else {
					if (mi * mir == 54) {
						continue;
					} else {
						ok = false;
						break outer;
					}
				}
			} 
		}
		
		count /= 2;
		
		System.out.println(ok ? count : "-1");
		
		scan.close();
	}

}
