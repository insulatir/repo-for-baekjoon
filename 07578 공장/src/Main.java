import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] A = new int[1000001];
		int[] B = new int[1000001];
		int[] tree = new int[4*N];
		
		for (int i = 1; i <= N; i++) {
			A[scan.nextInt()] = i;
		}
		
		for (int i = 1; i <= N; i++) {
			B[i] = A[scan.nextInt()];
		}
		
		long res = 0;
		for (int i = 1; i <= N; i++) {
			int j = B[i];
			update(j, tree, 1);
			res += sum(N, tree) - sum(j, tree);
		}

		System.out.print(res);
		
		scan.close();
	}

	public static int sum(int i, int[] tree) {
		int ans = 0;
		while (i > 0) {
			ans += tree[i];
			i -= (i & -i);
		}
		
		return ans;
	}
	
	public static void update(int i, int[] tree, int num) {
		while (i < tree.length) {
			tree[i] += num;
			// 0 -> 0
			// 따라서 인덱스 1부터 시작
			i += (i & -i);
		}
	}
}
