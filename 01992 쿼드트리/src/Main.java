import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[][] map = new int[N][N];
		for (int i = 0; i < N; i++) {
			String line = scan.next();
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(line.substring(j, j+1));
			}
		}
		
		System.out.print(zip(map));
		
		scan.close();
	}

	public static String zip(int[][] map) {
		int len = map.length / 2;
		boolean same = true;
		loop:
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map.length; j++) {
				if (map[0][0] != map[i][j]) {
					same = false;
					break loop;
				}
			}
		}
		
		if (same) {
			return map[0][0] == 0 ? "0" : "1";
		}
		
		int[][] m1 = new int[len][len];
		int[][] m2 = new int[len][len];
		int[][] m3 = new int[len][len];
		int[][] m4 = new int[len][len];
		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				m1[i][j] = map[i][j];
				m2[i][j] = map[i][j+len];
				m3[i][j] = map[i+len][j];
				m4[i][j] = map[i+len][j+len];
			}
		}
		
		String q1 = zip(m1);
		String q2 = zip(m2);
		String q3 = zip(m3);
		String q4 = zip(m4);
		
		return "(" + q1 + q2 + q3 + q4 + ")";
	}
}
