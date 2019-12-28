import java.util.*;
public class Main {
	static long[] a;
	static long[] tree;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		while (n != 0) {
			a = new long[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextLong();
			}
			
			int H = (int)Math.ceil(Math.log(n)/Math.log(2));
			tree = new long[(int)Math.pow(2, H+1)];
			
			init(1, 0, n-1);
			
			System.out.println(max(1, 0, n-1, 0, n-1));
			
			n = scan.nextInt();
		}
		
		scan.close();
	}

	public static long init(int node, int start, int end) {
		if (start == end) {
			return tree[node] = a[start];
		} else {
			return tree[node] = Math.min(init(node*2, start, (start+end)/2), init(node*2+1, (start+end)/2+1, end));
		}
	}
	
	public static long max(int node, int start, int end, int left, int right) {
		if (right < start || left > end) {
			return 0;
		}
		
		if (left <= start && end <= right) {
			return tree[node];
		}
		
		return Math.max(((end-start)/2) * max(node*2, start, (start+end)/2, left, right), ((end-start)/2+1) * max(node*2+1, (start+end)/2+1, end, left, right));
	}
}
