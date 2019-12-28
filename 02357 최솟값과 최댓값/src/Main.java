import java.util.*;
public class Main {
	static int[] a;
	static int[] tree1;
	static int[] tree2;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		a = new int[N];
		for (int i = 0; i < N; i++) {
			a[i] = scan.nextInt();
		}
		int H = (int)Math.ceil(Math.log(N)/Math.log(2));
		tree1 = new int[(int)Math.pow(2, H+1)];
		tree2 = new int[(int)Math.pow(2, H+1)];

		initMin(1, 0, N-1);
		initMax(1, 0, N-1);
		
		for (int i = 0; i < M; i++) {
			int a0 = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(min(1, 0, N-1, a0-1, b-1) + " " + max(1, 0, N-1, a0-1, b-1));
		}
		
		scan.close();
	}

	public static int initMin(int node, int start, int end) {
		if (start == end) {
			return tree1[node] = a[start];
		} else {
			return tree1[node] = Math.min(initMin(node*2, start, (start+end)/2), initMin(node*2+1, (start+end)/2+1, end));
		}
	}
	
	public static int min(int node, int start, int end, int left, int right) {
		if (right < start || left > end) {
			return Integer.MAX_VALUE;
		}
		
		if (left <= start && end <= right) {
			return tree1[node];
		}
		
		return Math.min(min(node*2, start, (start+end)/2, left, right), min(node*2+1, (start+end)/2+1, end, left, right));
	}
	
	public static int initMax(int node, int start, int end) {
		if (start == end) {
			return tree2[node] = a[start];
		} else {
			return tree2[node] = Math.max(initMax(node*2, start, (start+end)/2), initMax(node*2+1, (start+end)/2+1, end));
		}
	}

	public static int max(int node, int start, int end, int left, int right) {
		if (right < start || left > end) {
			return Integer.MIN_VALUE;
		}
		
		if (left <= start && end <= right) {
			return tree2[node];
		}
		
		return Math.max(max(node*2, start, (start+end)/2, left, right), max(node*2+1, (start+end)/2+1, end, left, right));
	}
}
