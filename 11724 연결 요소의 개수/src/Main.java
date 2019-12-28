import java.util.Scanner;
public class Main {
	static int[][] adj;
	static boolean[] visited;
	static int count;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		adj = new int[N+1][N+1];
		for (int i = 0; i < M; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			adj[u][v] = adj[v][u] = 1;
		}

		count = 0;
		dfsAll();
		System.out.println(count);
		
		scan.close();
	}

	public static void dfs(int here) {
		visited[here] = true;
		
		for (int i = 1; i < adj[here].length; i++) {
			int there = adj[here][i];
			if (!visited[i] && there != 0) {
				dfs(i);
			}
		}
	}
	
	public static void dfsAll() {
		visited = new boolean[adj.length+1];
		for (int i = 1; i < adj.length; i++) {
			if (!visited[i]) {
				dfs(i);
				count += 1;
			}
		}
	}
}
