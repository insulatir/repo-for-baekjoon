import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		long[] A = new long[N];
		long[] B = new long[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = scan.nextLong();
		}
		for (int i = 0; i < N; i++) {
			B[i] = scan.nextLong();
		}
		
		for (int i = 0; i < N; i++) {
			int index = upperBound(B, i, N-1, A[i]);
			System.out.println(A[i] < B[index] ? index-1-i : index-i);
		}

		scan.close();
	}

	public static int upperBound(long arr[], int front, int rear, long key) {
		int mid = 0;
		while (front < rear) {
			mid = (front + rear) / 2;
			if (arr[mid] <= key) {
				front = mid + 1;
			} else {
				rear = mid;
			}
		}

		return rear;
	}
}
