import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[][] dungchi = new int[N][2];
		for (int i = 0; i < N; i++) {
			dungchi[i][0] = scan.nextInt();
			dungchi[i][1] = scan.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			int x = dungchi[i][0];
			int y = dungchi[i][1];
			
			int k = 1;
			for (int j = 0; j < N; j++) {
				int p = dungchi[j][0];
				int q = dungchi[j][1];
				
				if (x < p && y < q) {
					k += 1;
				}
			}
			
			System.out.print(k + " ");
		}
		
		scan.close();
	}

}
