import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		long n = scan.nextLong();
		
		long[][] A = {{1, 1}, {1, 0}};
		if (n >= 2) {
			long[][] mat = mul(A, n-1);
			
			System.out.print(mat[0][0]);
		} else {
			System.out.print(n);
		}
		
		scan.close();
	}

	public static long[][] mul(long[][] A, long a) {
		if (a == 1) {
			long[][] mat = {{1, 1}, {1, 0}};
			return mat;
		}
		
		long[][] half = mul(A, a/2);
		
		long[][] squre = new long[half.length][half.length];
		long[][] res = new long[half.length][half.length];
		
		for (int i = 0; i < half.length; i++) {
			for (int j = 0; j < half.length; j++) {
				for (int k = 0; k < half.length; k++) {
					squre[i][j] = (squre[i][j] + half[i][k] * half[k][j]) % 1000000;
				}
			}
		}
		
		if (a % 2 == 1) {
			for (int i = 0; i < half.length; i++) {
				for (int j = 0; j < half.length; j++) {
					for (int k = 0; k < half.length; k++) {
						res[i][j] = (res[i][j] + squre[i][k] * A[k][j]) % 1000000;
					}
				}
			}
			
			return res;
		} else {
			return squre;
		}
	}
	
}
