import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		
		Arrays.sort(A);
		
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (max < A[i] * A[j]) {
					max = A[i] * A[j];
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				if (j+1 < n) {
					if (max < A[i] * A[j] * A[j+1]) {
						max = A[i] * A[j] * A[j+1];
					}
					if (max < A[i] * A[j] * A[n-1]) {
						max = A[i] * A[j] * A[n-1];
					}
				}
			}
		}
		
		System.out.println(max);
		
		scan.close();
	}

}
