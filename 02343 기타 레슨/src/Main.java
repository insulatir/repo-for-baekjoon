import java.util.*;
public class Main {
	static int N, M;
	static int[] lesson;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		N = scan.nextInt();
		M = scan.nextInt();
		lesson = new int[N];
		for (int i = 0; i < N; i++) {
			lesson[i] = scan.nextInt();
		}
		
		System.out.println(bin(0, 1000));
		
		scan.close();
		
	}

	public static int bin(int lo, int hi) {
		while (lo+1 < hi) {
			int mid = (lo + hi) / 2;
			long sum = 0;
			int m = 1;
			
			for (int i = 0; i < N; i++) {
				sum += lesson[i];
				
				if (sum > mid) {
					sum = lesson[i];
					m += 1;
				}
			}
			
			if (m > M) {
				lo = mid + 1;
			} else if (m < M) {
				hi = mid - 1;
			} else {
				hi = mid - 1;
			}
		}
		
		return hi;
	}
}
