import java.util.*;
public class Main {
	static int[] budget;
	static int N, M;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		budget = new int[N];
		for (int i = 0; i < N; i++) {
			budget[i] = scan.nextInt();
		}
		M = scan.nextInt();
		
		Arrays.sort(budget);
		
		System.out.println(bin(0, budget[budget.length-1]+1));
		
		scan.close();
	}

	public static int bin(int lo, int hi) {
		while (lo+1 < hi) {
			int mid = (lo + hi) / 2;
			long sum = 0;
			
			for (int i = 0; i < N; i++) {
				sum += budget[i] <= mid ? budget[i] : mid;
			}
			
			if (sum <= M) {
				lo = mid;
			} else {
				hi = mid;
			}
		}
		
		return lo;
	}
}
