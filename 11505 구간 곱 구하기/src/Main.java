import java.util.*;
public class Main {
	static int mod = 1000000007;
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();
		
		arr = new int[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = scan.nextInt();
		}
		
		int[] tree = new int[4*N];
		init(arr, tree, 1, N, 1);
		
		for (int i = 0; i < M+K; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			
			if (a == 1) {
				double diff = (double)c / (double)arr[b];
				if (arr[b] == 0) {
					diff = c;
				}
				update(tree, 1, N, b, diff, 1);
			} else {
				System.out.println(mul(tree, 1, N, b, c, 1));
			}
		}
		
		scan.close();
	}

	public static int init(int[] arr, int[] tree, int start, int end, int node) {
		if (start == end) {
			return tree[node] = (arr[start] % mod);
		}
		
		int mid = (start+end)/2;
		return tree[node] = (init(arr, tree, start, mid, node*2) * init(arr, tree, mid+1, end, node*2+1)) % mod;
	}

	public static void update(int[] tree, int start, int end, int index, double diff, int node) {
		if (!(start <= index && index <= end)) {
			return;
		}
		
		if (start != end) {
			int mid = (start+end)/2;
			update(tree, start, mid, index, diff, node*2);
			update(tree, mid+1, end, index, diff, node*2+1);
		} else {
			if (tree[node] == 0) {
				tree[node] = (int)diff;
			}
			arr[index] = tree[node];
		}

		if (tree[node] == 0) {
			tree[node] = (tree[node*2] * tree[node*2+1]) % mod; 
		} else {
			tree[node] = (int)((double)tree[node] * diff) % mod;
		}
	}
	
	public static int mul(int[] tree, int start, int end, int left, int right, int node) {
		if (right < start || end < left) {
			return 1;
		}
		if (left <= start && end <= right) {
			return tree[node] % mod;
		}
		
		int mid = (start+end)/2;
		return (mul(tree, start, mid, left, right, node*2) * mul(tree, mid+1, end, left, right, node*2+1)) % mod;
	}
}
