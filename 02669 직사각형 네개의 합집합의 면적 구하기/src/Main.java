import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[][] squre = new int[100][100];
		for (int i = 0; i < 4; i++) {
			int x1 = scan.nextInt();
			int y1 = scan.nextInt();
			int x2 = scan.nextInt();
			int y2 = scan.nextInt();
			for (int j = y1; j < y2; j++) {
				for (int k = x1; k < x2; k++) {
					squre[j][k] = 1;
				}
			}
		}
		
		int res = 0;
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				if (squre[i][j] == 1) {
					res += 1;
				}
			}
		}
		
		System.out.print(res);
		
		scan.close();
	}

}
