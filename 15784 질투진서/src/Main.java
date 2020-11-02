import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int[][] X = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				X[i][j] = scan.nextInt();
			}
		}
		
		int jinseo = X[a-1][b-1];
		boolean angry = false;
		for (int j = 0; j < N; j++) {
			if (X[a-1][j] > jinseo) {
				angry = true;
				break;
			}
		}
		
		for (int i = 0; i < N; i++) {
			if (X[i][b-1] > jinseo) {
				angry = true;
				break;
			}
		}
		
		System.out.print(angry ? "ANGRY" : "HAPPY");
		
		scan.close();
	}

}
