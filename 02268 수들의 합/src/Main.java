import java.util.*;
public class Main {
	static long[] arr;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		arr = new long[N+1];
		long[] seg = new long[4*N];
		
		init(arr, seg, 1, N, 1);
		
		for (int i = 0; i < M; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			long c = scan.nextLong();
			
			if (a == 1) {
				long diff = c - arr[b];
				update(seg, 1, N, b, 1, diff);
			} else {
				System.out.println(sum(seg, 1, N, b, (int)c, 1));
			}
		}
		
		scan.close();
	}

	public static long init(long[] arr, long[] seg, int s, int e, int node) {
		if (s == e) {
			// 하나
			return seg[node] = arr[s];
			// 저장하고 리턴
		}
		
		int m = (s+e)/2;
		// 중간값
		return seg[node] = init(arr, seg, s, m, 2*node) + init(arr, seg, m+1, e, 2*node+1);
		// 두 자식을 합치고서 저장하고 리턴
	}
	
	public static void update(long[] seg, int s, int e, int index, int node, long diff) {
		if (!(s <= index && index <= e)) {
			// 인덱스 범위에 들지 않으면 리턴
			return;
		}
		
		seg[node] += diff;
		// 업데이트
		
		if (s != e) {
			// 하나 : base case
			int m = (s+e)/2;
			update(seg, s, m, index, node*2, diff);
			update(seg, m+1, e, index, node*2+1, diff);
		} else {
			arr[index] = seg[node];
		}
	}
	
	public static long sum(long[] seg, int s, int e, int l, int r, int node) {
		if (l > e || r < s) {
			return 0;
		}
		
		if (l <= s && e <= r) {
			// l, r 고정
			// s, e 변함
			return seg[node];
		}
		
		int m = (s+e)/2;
		return sum(seg, s, m, l, r, node*2) + sum(seg, m+1, e, l, r, node*2+1);
	}
}
