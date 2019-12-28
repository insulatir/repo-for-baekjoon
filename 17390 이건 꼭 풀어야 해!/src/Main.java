import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int Q = scan.nextInt();
		int[] list = new int[N];
		
		for (int i = 0; i < N; i++) {
			list[i] = scan.nextInt();
		}
		
		Arrays.sort(list);
		
		long[] part = new long[N+1];
		
		for (int i = 1; i <= N; i++) {
			part[i] = part[i-1] + list[i-1];
		}
		
		for (int i = 0; i < Q; i++) {
			int L = scan.nextInt();
			int R = scan.nextInt();
			System.out.println(part[R] - part[L-1]);
		}
		
		scan.close();
	}

}
