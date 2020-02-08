import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		int[][] chart = new int[7][2];
		for (int i = 0; i < N; i++) {
			int S = scan.nextInt();
			int Y = scan.nextInt();
			chart[Y][S] += 1;
		}
		
		int room = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 0; j < 2; j++) {
				room += (chart[i][j] + K - 1) / K;
			}
		}
		
		System.out.print(room);
		
		scan.close();
	}

}
