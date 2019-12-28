import java.util.*;
public class Main {
	static long[] a;
	static long[] tree;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();
		a = new long[N];
		for (int i = 0; i < N; i++) {
			a[i] = scan.nextLong();
		}
		int H = (int)Math.ceil(Math.log(N)/Math.log(2));
		tree = new long[(int)Math.pow(2, H+1)];
		init(1, 0, N-1);
		
		for (int i = 0; i < M+K; i++) {
			int a0 = scan.nextInt();
			int b = scan.nextInt();

			if (a0 == 1) {
				long c = scan.nextLong();
				int index = b - 1;
				long diff = c - a[index];
				a[index] += diff;
				// a도 변경해야 함
				update(1, 0, N-1, index, diff);
			} else {
				int c = scan.nextInt();
				System.out.println(sum(1, 0, N-1, b-1, c-1));
			}
		}
		
		scan.close();
	}

	public static long init(int node, int start, int end) {
		if (start == end) {
			return tree[node] = a[start];
		} else {
			return tree[node] = init(node*2, start, (start+end)/2) +
					init(node*2+1, (start+end)/2+1, end);
		}
	}
	
	public static long sum(int node, int start, int end, int left, int right) {
		if (left > end || right < start) {
			return 0;
		}
		
		if (left <= start && end <= right) {
			return tree[node];
		}
		
		return sum(node*2, start, (start+end)/2, left, right) +
				sum(node*2+1, (start+end)/2+1, end, left, right);
	}
	
	public static void update(int node, int start, int end, int index, long diff) {
		if (index < start || index > end) {
			return;
		}
		
		tree[node] += diff;
		
		if (start != end) {
			update(node*2, start, (start+end)/2, index, diff);
			update(node*2+1, (start+end)/2+1, end, index, diff);
		} 
	}
}
