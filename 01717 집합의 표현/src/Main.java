import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] parent = new int[n+1];
		for (int i = 0; i <= n; i++) {
			parent[i] = i;
		}
		
		for (int i = 0; i < m; i++) {
			int fun = scan.nextInt();
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			if (fun == 0) {
				unionParent(parent, a, b);
			} else {
				System.out.println(findParent(parent, a, b) ? "YES" : "NO");
			}
		}
		
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
		if (a < b) {
			parent[b] = a;
		} else {
			parent[a] = b;
		}
	}
	
	public static boolean findParent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		return a == b;
	}
}
