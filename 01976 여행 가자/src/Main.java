import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		
		int[] parent = new int[N+1];
		for (int i = 1; i <= N; i++) {
			parent[i] = i;
		}
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (scan.nextInt() == 1) {
					unionParent(parent, i, j);
				}
			}
		}
		
		int[] plan = new int[M];
		for (int i = 0; i < M; i++) {
			plan[i] = scan.nextInt();
		}
		
		boolean union = true;
		for (int i = 0; i < M-1; i++) {
			if (!findParent(parent, plan[i], plan[i+1])) {
				union = false;
				break;
			}
		}
		
		System.out.print(union ? "YES" : "NO");
		
		scan.close();
	}

	public static int getParent(int[] parent, int x) {
		if (parent[x] == x) {
			return x;
		}
		return parent[x] = getParent(parent, parent[x]);
	}
	
	public static void unionParent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if (a > b) {
			parent[a] = b;
		} else {
			parent[b] = a;
		}
	}
	
	public static boolean findParent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		return a == b;
	}
}
