import java.util.*;
public class Main {
	static int[] a;
	static int[] tree;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		int H = (int)Math.ceil(Math.log(N)/Math.log(2));
		tree = new int[(int)Math.pow(2, H+1)];
		
		init(1, 0, N-1);
		
		scan.close();
	}

	public static int init(int node, int start, int end) {
		if (start == end) {
			return tree[node] = a[start];
		} else {
			return tree[node] = init(node*2, start, (start+end)/2) +
					init(node*2+1, (start+end)/2+1, end);
		}
	}
	
	public static int sum(int node, int start, int end, int left, int right) {
		if (right < start || end < left) {
			return 0;
		}
		
		if (left <= start && end <= right) {
			return tree[node];
		}
		
		return sum(node*2, start, (start+end)/2, left, right) +
				sum(node*2+1, (start+end)/2+1, end, left, right);
	}
	
	public static void update(int node, int start, int end, int index, int diff) {
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
