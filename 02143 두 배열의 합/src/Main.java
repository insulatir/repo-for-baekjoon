import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		int n = scan.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		int m = scan.nextInt();
		int[] B = new int[m];
		for (int i = 0; i < m; i++) {
			B[i] = scan.nextInt();
		}
		
		List<Integer> A_sum = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int sum = A[i];
			A_sum.add(sum);
			for (int j = i+1; j < n; j++) {
				sum += A[j];
				A_sum.add(sum);
			}
		}
		
		List<Integer> B_sum = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			int sum = B[i];
			B_sum.add(sum);
			for (int j = i+1; j < m; j++) {
				sum += B[j];
				B_sum.add(sum);
			}
		}
		
		Arrays.sort(B);
		
		long res = 0;
		for (int i = 0; i < A_sum.size(); i++) {
			int a_sum = A_sum.get(i);
			res += upperBound(B_sum, 0, B_sum.size(), T-a_sum) - lowerBound(B_sum, 0, B_sum.size(), T-a_sum);
		}
		
		System.out.print(res);
		
		scan.close();
	}

	public static int upperBound(List<Integer> arr, int f, int b, int key) {
		int m = 0;
		while (f < b) {
			m = (f + b) / 2;
			if (arr.get(m) <= key) {
				f = m + 1;
			} else {
				b = m;
			}
		}
		
		return b;
	}
	
	public static int lowerBound(List<Integer> arr, int f, int b, int key) {
		int m = 0;
		while (f < b) {
			m = (f + b) / 2;
			if (arr.get(m) < key) {
				f = m + 1;
			} else {
				b = m;
			}
		}
		
		return b;
	}
}
