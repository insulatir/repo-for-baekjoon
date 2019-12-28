import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] A = new int[N+1];
		for (int i = 1; i <= N; i++) {
			A[i] = scan.nextInt();
		}
		
		int H = (int)Math.ceil(Math.log(N)/Math.log(2));
		int[] tree = new int[(int)Math.pow(2, H+1)];
 		
		init(A, tree, 1, N, 1);
		
		System.out.println(count(tree, 1, N, 1, N, 1));
		
		scan.close();
	}

	public static int init(int[] arr, int[] tree, int start, int end, int node) {
		if (start == end) {
			return tree[node] = 0;
		}
		
		int mid = (start+end)/2;
		return tree[node] = init(arr, tree, start, mid, node*2) + 
				init(arr, tree, mid+1, end, node*2+1) + (mid-start+1) * (end-mid);
	}
	
	public static int count(int[] tree, int start, int end, int left, int right, int node) {
		if (end < left || right < start) {
			return 0;
		}
		
		if (start <= left && right <= end) {
			return tree[node];
		}
		
		int mid = (start+end)/2;
		return count(tree, start, mid, left, right, node*2) + 
				count(tree, mid+1, end, left, right, node*2+1) + (mid-start+1) * (end-mid);
	}
}
