import java.util.*;
public class Main {
	static long[] arr;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int Q = scan.nextInt();
		
		arr = new long[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = scan.nextLong();
		}
		
		long[] seg = new long[4*N];
		
		init(arr, seg, 1, N, 1);
		
		for (int i = 0; i < Q; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int a = scan.nextInt();
			long b = scan.nextLong();
			
			if (x < y) {
				System.out.println(sum(seg, 1, N, x, y, 1));
			} else {
				System.out.println(sum(seg, 1, N, y, x, 1));
			}
			
			long diff = b - arr[a];
			update(seg, 1, N, a, 1, diff);
		}
		
		scan.close();
	}

	public static long init(long[] arr, long[] seg, int s, int e, int node) {
		if (s == e) {
			// �ϳ�
			return seg[node] = arr[s];
			// �����ϰ� ����
		}
		
		int m = (s+e)/2;
		// �߰���
		return seg[node] = init(arr, seg, s, m, 2*node) + init(arr, seg, m+1, e, 2*node+1);
		// �� �ڽ��� ��ġ�� �����ϰ� ����
	}
	
	public static void update(long[] seg, int s, int e, int index, int node, long diff) {
		if (!(s <= index && index <= e)) {
			// �ε��� ������ ���� ������ ����
			return;
		}
		
		//////////
		
		seg[node] += diff;
		// ������Ʈ
		
		if (s != e) {
			// �ϳ� : base case
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
			// l, r ����
			// s, e ����
			return seg[node];
		}
		
		int m = (s+e)/2;
		return sum(seg, s, m, l, r, node*2) + sum(seg, m+1, e, l, r, node*2+1);
	}
}
