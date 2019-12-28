import java.util.*;
public class Main {
	static int[] a;
	static int[] tree;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}

		int H = (int)Math.ceil(Math.log(N)/Math.log(2));
		tree = new int[(int)Math.pow(2, H+1)];
		init(1, 0, N-1);
		
		for (int i = 0; i < M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(min(1, 0, N-1, a-1, b-1));
		}
		
		scan.close();
	}

	public static int init(int node, int start, int end) {
		if (start == end) {
			return tree[node] = a[start];
		} else {
			return tree[node] = Math.min(init(node*2, start, (start+end)/2) ,
					init(node*2+1, (start+end)/2+1, end));
		}
	}
	
	public static int min(int node, int start, int end, int left, int right) {
		if (right < start || left > end) {
			return Integer.MAX_VALUE;
		}
		
		if (left <= start && end <= right) {
			return tree[node];
		}
		
		return Math.min(min(node*2, start, (start+end)/2, left, right), min(node*2+1, (start+end)/2+1, end, left, right));
	}
}
