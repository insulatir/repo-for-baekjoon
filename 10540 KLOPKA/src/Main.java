import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[][] mos = new int[2][N];
		for (int i = 0; i < N; i++) {
			mos[0][i] = scan.nextInt();
			mos[1][i] = scan.nextInt();
		}

		Arrays.sort(mos[0]);
		Arrays.sort(mos[1]);
		
		int len = Math.max(mos[0][N-1]-mos[0][0], mos[1][N-1]-mos[1][0]);
		System.out.println(len * len);
		
		scan.close();
	}

}
