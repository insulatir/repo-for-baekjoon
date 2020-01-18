import java.util.*;
public class Main {
	static long[] tree;
	static int n;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		while (n != 0) {
			long[] his = new long[n];
			for (int i = 0; i < n; i++) {
				his[i] = scan.nextLong();
			}
			
			int H = (int)Math.ceil(Math.log(n)/Math.log(2));
			tree = new long[(int)Math.pow(2, H+1)];
			init(1, 0, n-1, his);
			
			System.out.println(maxArea(0, n-1, his));
			
			n = scan.nextInt();
		}
		
		scan.close();
	}

	public static long maxArea(long l, long r, long[] his) {
		long len = r - l + 1;
		
		if (len == 1) {
			return his[(int)l];
		}
		
		long left = maxArea(l, (l + r) / 2, his);
		long right = maxArea((l + r) / 2 + 1, r, his);
		
		long mid = 0;
		double half = (l + r) / 2.0;
		for (int i = (int)l; i < half; i++) {
			for (int j = (int)r; j > half; j--) {
				long minh = min(1, 0, n-1, i, j);
				long area = minh * (j - i + 1);
				if (mid < area) {
					mid = area;
				}
			}
		}
		
		return Math.max(Math.max(left, right), mid);
	}
	
	public static long init(int node, int start, int end, long[] his) {
		if (start == end) {
			return tree[node] = his[start];
		} else {
			return tree[node] = Math.min(init(node*2, start, (start+end)/2, his) ,
					init(node*2+1, (start+end)/2+1, end, his));
		}
	}
	
	public static long min(int node, int start, int end, int left, int right) {
		if (right < start || left > end) {
			return Long.MAX_VALUE;
		}
		
		if (left <= start && end <= right) {
			return tree[node];
		}
		
		return Math.min(min(node*2, start, (start+end)/2, left, right), min(node*2+1, (start+end)/2+1, end, left, right));
	}
}
