import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextInt();
		}
		
		int M = scan.nextInt();
		
		
		scan.close();
	}

	public static int bin_search(int[] A, int start, int end, int X) {
		if (start == end) {
			if (A[start] == X) {
				return 1;
			} else {
				return 0;
			}
		}
		
		int mid = (start+end)/2;
		int m = A[mid];
		int p, q = 0;
		if (m < X) {
			q = bin_search(A, mid+1, end, X);
		} else {
			p = bin_search(A, start, mid, X);
		}
	}
}
