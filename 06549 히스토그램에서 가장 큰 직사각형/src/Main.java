import java.util.*;
public class Main {
	static int[] tree;
	static int n;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		while (n != 0) {
			int[] his = new int[n];
			for (int i = 0; i < n; i++) {
				his[i] = scan.nextInt();
			}
			
			int H = (int)Math.ceil(Math.log(n)/Math.log(2));
			tree = new int[(int)Math.pow(2, H+1)];
			init(1, 0, n-1, his);
			
			System.out.println(maxArea(0, n-1, his));
			
			n = scan.nextInt();
		}
		
		scan.close();
	}

	public static long maxArea(int l, int r, int[] his) {
		int n = his.length;
		int m = min(1, 0, n-1, l, r, his);
		long area = (long)(r-l+1) * (long)his[m];
		if (l <= m-1) {
			long left = maxArea(l, m-1, his);
			if (area < left) {
				area = left;
			}
		}
		if (m+1 <= r) {
			long right = maxArea(m+1, r, his);
			if (area < right) {
				area = right;
			}
		}
		
		return area;
	}
	
	public static void init(int node, int start, int end, int[] his) {
		if (start == end) {
			tree[node] = start;
		} else {
			init(node*2, start, (start+end)/2, his);
			init(node*2+1, (start+end)/2+1, end, his);
			if (his[tree[node*2]] <= his[tree[node*2+1]]) {
				tree[node] = tree[node*2];
			} else {
				tree[node] = tree[node*2+1];
			}
		}
	}
	
	public static int min(int node, int start, int end, int left, int right, int[] his) {
		if (right < start || left > end) {
			return Integer.MAX_VALUE;
		}
		
		if (left <= start && end <= right) {
			return tree[node];
		}
		
		int m1 = min(node*2, start, (start+end)/2, left, right, his);
		int m2 = min(node*2+1, (start+end)/2+1, end, left, right, his);
		if (m1 == Integer.MAX_VALUE) {
			return m2;
		} else if (m2 == Integer.MAX_VALUE) {
			return m1;
		} else {
			if (his[m1] <= his[m2]) {
				return m1;
			} else {
				return m2;
			}
		}
	}
}
