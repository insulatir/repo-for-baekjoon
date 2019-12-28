import java.util.*;
public class Main {
	static int[] height;
	static int N, M;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		height = new int[N];
		
		for (int i = 0; i < N; i++) {
			height[i] = scan.nextInt();
		}
		
		System.out.println(bin(0, Integer.MAX_VALUE));
		
		scan.close();
	}

	public static int bin(int lo, int hi) {
		while (lo+1 < hi) {
			int mid = (lo+hi) / 2;
			long sum = 0;
			for (int i = 0; i < N; i++) {
				if (height[i] > mid) {
					sum += height[i] - mid;
				}
			}
			
			if (sum >= M) {
				lo = mid;
			} else {
				hi = mid;
			}
		}
		
		return lo;
	}
}
