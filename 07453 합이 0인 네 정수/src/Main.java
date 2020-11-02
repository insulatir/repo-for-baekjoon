import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		int[] D = new int[n];
		
		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
			C[i] = scan.nextInt();
			D[i] = scan.nextInt();
		}
		
		// A+B
		int[] E = new int[n*n];
		// C+D
		int[] F = new int[n*n];
		
		int e = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				E[e] = A[i] + B[j];
				e += 1;
			}
		}
		
		int f = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				F[f] = C[i] + D[j];
				f += 1;
			}
		}
		
		Arrays.sort(F);
		
		long count = 0;
		for (int i = 0; i < n*n; i++) {
			count += upperBound(F, 0, n*n, -E[i]) - lowerBound(F, 0, n*n, -E[i]);
		}
		
		System.out.print(count);
		
		scan.close();
	}

	public static int upperBound(int arr[], int f, int b, int key) {
		int m = 0;
		while (f < b) {
			m = (f + b) / 2;
			if (arr[m] <= key) {
				f = m + 1;
			} else {
				b = m;
			}
		}
		
		return b;
	}
	
	public static int lowerBound(int arr[], int f, int b, int key) {
		int m = 0;
		while (f < b) {
			m = (f + b) / 2;
			if (arr[m] < key) {
				f = m + 1;
			} else {
				b = m;
			}
		}
		
		return b;
	}
}
