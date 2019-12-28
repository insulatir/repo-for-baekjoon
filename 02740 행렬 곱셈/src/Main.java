import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int[][] A = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = scan.nextInt();
			}
		}
		M = scan.nextInt();
		int K = scan.nextInt();
		int[][] B = new int[M][K];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < K; j++) {
				B[i][j] = scan.nextInt();
			}
		}
		int[][] C = new int[N][K];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				for (int k = 0; k < M; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}
