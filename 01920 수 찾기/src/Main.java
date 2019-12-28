import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++)
			A[i] = scan.nextInt();
		Arrays.sort(A);
		int M = scan.nextInt();
		for(int i = 0; i < M; i++) {
			int num = scan.nextInt();
			System.out.println(find(num, A));
		}
		scan.close();
	}
	
	private static int find(int num, int[] A) {
		int left, mid, right;
		left = 0;
		right = A.length-1;
		mid = (left+right)/2;
		for(; left <= right; ) {
			if(num < A[mid]) {
				right = mid-1;
				mid = (left+right)/2;
			}
			else {
				left = mid+1;
				mid = (left+right)/2;
			}
		}
		if(num == A[mid]) return 1;
		else return 0;
	}
}
