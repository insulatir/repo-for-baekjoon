import java.util.*;
public class Main {
	static List<List<Integer>> adj;
	static boolean[] visited;
	static Stack<Integer> stack;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		int N = scan.nextInt();
		int M = scan.nextInt();
		adj = new LinkedList<List<Integer>>();
		for (int i = 0; i <= N; i++) {
			List<Integer> list = new LinkedList<Integer>();
			adj.add(list);
		}
		
		for (int i = 0; i < M; i++) {
			int v = scan.nextInt();
			int w = scan.nextInt();
			adj.get(v).add(w);
		}
		
		stack = new Stack<Integer>();
		
		dfsAll();
		
		int size = stack.size();
		for (int i = 0; i < size; i++) {
			int item = stack.pop();
			System.out.print(item + " ");
		}
		
		scan.close();
	}

	public static void dfs(int here) {
		visited[here] = true;
		
		for (int item : adj.get(here)) {
			if (!visited[item]) {
				dfs(item);
			}
		}
		
		stack.push(here);
	}
	
	public static void dfsAll() {
		visited = new boolean[adj.size()];
		
		for (int i = 1; i < adj.size(); i++) {
			if (!visited[i]) {
				dfs(i);
			}
		}
	}
}
