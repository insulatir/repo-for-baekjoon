import java.util.*;
public class Main {
	static long[] arr;
	static int mod = 1000000007;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();
		
		arr = new long[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = scan.nextLong();
		}
		
		long[] seg = new long[4*N];
		
		init(arr, seg, 1, N, 1);
		
		for (int i = 0; i < M+K; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			long c = scan.nextLong();
			
			if (a == 1) {
				update(seg, 1, N, b, 1, c);
			} else {
				System.out.println(mul(seg, 1, N, b, (int)c, 1) % mod);
			}
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
		return seg[node] = ((init(arr, seg, s, m, 2*node) % mod) * (init(arr, seg, m+1, e, 2*node+1) % mod) % mod);
		// �� �ڽ��� ���ϰ� �����ϰ� ����
	}
	
	public static long update(long[] seg, int s, int e, int index, int node, long c) {
		if (!(s <= index && index <= e)) {
			// �ε��� ������ ���� ������ �״�� ����
			return seg[node] % mod;
		}
		
		if (s != e) {
			// �ϳ� : base case
			int m = (s+e)/2;
			return seg[node] = ((update(seg, s, m, index, node*2, c) % mod) * (update(seg, m+1, e, index, node*2+1, c) % mod) % mod); 
		} else {
			// s = e = index
			return seg[node] = c % mod;
		}
	}
	
	public static long mul(long[] seg, int s, int e, int l, int r, int node) {
		if (l > e || r < s) {
			return 1;
		}
		
		if (l <= s && e <= r) {
			// l, r ����
			// s, e ����
			return seg[node];
		}
		
		int m = (s+e)/2;
		return ((mul(seg, s, m, l, r, node*2) % mod) * (mul(seg, m+1, e, l, r, node*2+1) % mod) % mod);
	}
}
